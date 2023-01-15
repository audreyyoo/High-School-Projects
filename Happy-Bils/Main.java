import java.util.Scanner;
import java.util.*;
import java.io.*;

class Main {
  private static int invalid;
  static ArrayList<String> book = new ArrayList<String>();
  public static ArrayList<String> getBooks() {
    return book;
  }
  public static void addBooks(String b) {
    book.add(b);
  }
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static void main(String[] args) {
    HappyBils thing = new HappyBils();
    Story stuff = new Story();
    thing.mainMessage2();
    String[][] userStory2= new String[1][];
    String title = "";
    System.out.println("\nWould you like to learn how to play?\n< 1 > yes   < 2 > no");
    Scanner sc = new Scanner(System.in);
    String repeat = sc.nextLine();
    while (!(repeat.equals("1") || repeat.equals("2"))) {
      System.out.print(ANSI_RED + "\nERROR  please choose again: " + ANSI_RESET);
      repeat = sc.nextLine();
    }
    Rules rules = new Rules(repeat); 
    System.out.println(rules);
    addBooks("< 1 > A Day in the Life at Brooklyn Tech");
    addBooks("< 2 > Technite Food Fight");
    addBooks("< 3 > A letter to Collegeboard...");
    while (!(repeat.equals("STOP"))) { 
      int count = 0;
      System.out.println(ANSI_CYAN + "Choose a Story: " + ANSI_RESET);
      for (int a = 0; a < getBooks().size(); a++) {
        System.out.println(ANSI_CYAN + getBooks().get(a) + ANSI_RESET);
      }
      System.out.print(ANSI_CYAN + "< xx > Make your own story (warning: you can only make one)\n\nChoice: " + ANSI_RESET);
      String input = sc.nextLine();
      while (!(((((input.equals("1") || input.equals("2")) || input.equals("3")) || (input.equals("4") && getBooks().size() == 4)) || (input.equals("xx") && getBooks().size() < 4 )))) {
        count++;
        if (getBooks().size() == 4 && input.equals("xx")) {
          System.out.print(reminder(count));
          System.out.println(ANSI_RED + "\nReminder: you can only make one story");
          if (input.equals("0")) {
            for (int a = 0; a < getBooks().size(); a++) {
              System.out.println(ANSI_CYAN + getBooks().get(a) + ANSI_RESET);
            }
            System.out.print(ANSI_CYAN + "< xx > Make your own story (warning: you can only make one)\n\nChoice: " + ANSI_RESET);
          }
        } else {
          if (input.equals("0")) {
            System.out.println(ANSI_CYAN + "Choose a story: ");
            for (int a = 0; a < getBooks().size(); a++) {
              System.out.println(ANSI_CYAN + getBooks().get(a));
            }
            System.out.print(ANSI_CYAN + "< xx > Make your own story (warning: you can only make one)\n\nChoice: " + ANSI_RESET);
            count = 0;
          } else {
            System.out.print(reminder(count));
          }
        }
        input = sc.nextLine();
        System.out.println(" ");
      }
      if(input.equals("1")){
        System.out.println("\n~~~ A Day in the Life at Brooklyn Tech ~~~\n");
      } else if (input.equals("2")) {
        System.out.println("\n~~~ Technite Food Fight ~~~\n");
      } else if (input.equals("3")) {
        System.out.println("\n~~~ A letter to Collegeboard... ~~~\n");
      } else if(input.equals("4")) {
        System.out.println("\n~~~ " + title + " ~~~~\n");
      } else {
        System.out.println("\n~~~ Make your own story ~~~");
      }
      if (input.equals("1")) {
        thing.print(stuff.getScenario());
      } else if (input.equals("2")) {
        thing.print(stuff.getFoodFight());
      } else if (input.equals("3")) {
        thing.print(stuff.getLetter());
      } else if (input.equals("4")) {
        thing.print(userStory2);
      } else if (input.equals("xx")) {
        System.out.println("\nType your story one word at a time, use punctuation\nUse keywords(noun, verb(present/past), adjective, person, place) as fillers\nTo end the story, type <finish>\n");
        String word = sc.nextLine();
        ArrayList<String> newStory = new ArrayList<String>();
        while (!(word.equals("finish"))) {
          newStory.add(word);
          word = sc.nextLine();
        }
        System.out.println("\nWhat is the name of your story? ");
        title = sc.nextLine();
        addBooks("< " + (getBooks().size()  + 1) + " > " + title);
        String[] userStory = new String[newStory.size()];
        for (int i = 0; i < newStory.size(); i++) {
          userStory[i] = newStory.get(i);
        }
        userStory2[0] = userStory;
      }
      System.out.println(ANSI_RED + "\n\nType <STOP> to stop playing or press ENTER to continue" + ANSI_RESET);
      repeat = sc.nextLine();
    }
    System.out.println("\ncredit to MadLibs");
  }
  public static String reminder(int n) {
    invalid = n;
    if (invalid > 4) {
      return ANSI_RED + "\nERROR  Invalid Input"+ ANSI_CYAN + "\nChoose a story(type 0 for list of stories): " + ANSI_RESET;
    } else {
      return ANSI_RED + "\nERROR  Invalid Input" + ANSI_CYAN + "\nChoose a story: " + ANSI_RESET; 
    }
  }
}
