import java.util.Scanner;

public class HappyBils {
  Scanner sc = new Scanner(System.in);

  private static void type(String s) {
    String text = s;
    for (int i = 0; i < text.length(); i++) {
      System.out.printf("%c", text.charAt(i));
      try {
        Thread.sleep(75);
      } catch(InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
  /**
  goes through each story input and replaces filler word with user input, prints complete story at end
  */ 
  public void print(String[][] arrays) {
    for (String[] arr : arrays) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals("noun")) { // noun
          System.out.print("noun: ");
          String ans = sc.nextLine();
          arr[i] = ans;
        } else if (arr[i].equals("noun.")) { // noun.
          System.out.print("noun: ");
          String ans = sc.nextLine();
          arr[i] = ans + ".";
        } else if (arr[i].equals("noun,")) { // noun,
          System.out.print("noun: ");
          String ans = sc.nextLine();
          arr[i] = ans + ",";
        } else if (arr[i].equals("verb(past)")) { // verb past 
          System.out.print("verb(past): ");
          String ans = sc.nextLine();
          arr[i] = ans;
        } else if (arr[i].equals("verb(past).")) { // verb past.
          System.out.print("verb(past): ");
          String ans = sc.nextLine();
          arr[i] = ans + ".";
        } else if (arr[i].equals("verb(past),")) { // verb past,
          System.out.print("verb(past): ");
          String ans = sc.nextLine();
          arr[i] = ans + ",";
        } else if (arr[i].equals("verb(present)")) { // verb present
          System.out.print("verb(present): ");
          String ans = sc.nextLine();
          arr[i] = ans;
        } else if (arr[i].equals("verb(present).")) { // verb present.
          System.out.print("verb(present): ");
          String ans = sc.nextLine();
          arr[i] = ans + ".";
        } else if (arr[i].equals("verb(present),")) { // verb present,
          System.out.print("verb(present): ");
          String ans = sc.nextLine();
          arr[i] = ans + ",";
        } else if (arr[i].equals("adjective")) { // adj
          System.out.print("adjective: ");
          String ans = sc.nextLine();
          arr[i] = ans;
        } else if (arr[i].equals("adjective.")) { // adj.
          System.out.print("adjective: ");
          String ans = sc.nextLine();
          arr[i] = ans + ".";
        } else if (arr[i].equals("adjective,")) { // adj,
          System.out.print("adjective: ");
          String ans = sc.nextLine();
          arr[i] = ans + ",";
        } else if (arr[i].equals("person")) { // person
          System.out.print("person: ");
          String ans = sc.nextLine();
          arr[i] = ans;
        } else if (arr[i].equals("person.")) { // person.
          System.out.print("person: ");
          String ans = sc.nextLine();
          arr[i] = ans + ".";
        } else if (arr[i].equals("person,")) { // person,
          System.out.print("person: ");
          String ans = sc.nextLine();
          arr[i] = ans + ",";
        } else if (arr[i].equals("place")) { // place
          System.out.print("place: ");
          String ans = sc.nextLine();
          arr[i] = ans;
        }
        else if (arr[i].equals("place.")) { // place.
          System.out.print("place: ");
          String ans = sc.nextLine();
          arr[i] = ans + ".";
        } else if (arr[i].equals("place,")) { // place,
          System.out.print("place: ");
          String ans = sc.nextLine();
          arr[i] = ans + ", ";
        }
      }
    }
    System.out.println("\n");
    for (String[] arrs : arrays) { // prints complete story
      for (String s : arrs) {
        type(s);
        System.out.print(" ");
      }
    }
  }
  public void mainMessage() {
    System.out.println("                     __    __     _                             _ ");
    System.out.println("/ / /\\ \\ \\___| | ___ ___  _ __ ___   ___   | |_ ___         ");
    System.out.println("\\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\  | __/ _ \\        ");
    System.out.println(" \\  /\\  /  __/ | (_| (_) | | | | | |  __/  | || (_) |  _ _  ");
    System.out.println("  \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|   \\__\\___/  (_|_) ");
    System.out.println(""); 
    System.out.println("   _   _                             ______  _  _      "); 
    System.out.println("  | | | |                            | ___ \\(_)| |     "); 
    System.out.println("  | |_| |  __ _  _ __   _ __   _   _ | |_/ / _ | | ___ "); 
    System.out.println("  |  _  | / _` || '_ \\ | '_ \\ | | | || ___ \\| || |/ __|"); 
    System.out.println("  | | | || (_| || |_) || |_) || |_| || |_/ /| || |\\__ \\"); 
    System.out.println("  \\_| |_/ \\__,_|| .__/ | .__/  \\__, |\\____/ |_||_||___/"); 
    System.out.println("                | |    | |      __/ |     "); 
    System.out.println("                |_|    |_|     |___/     ");
  }
  public void mainMessage2() {
    System.out.println("                                                          _   _                             ______  _  _      ");
    System.out.println(" __    __     _                              _           | | | |                            | ___ \\(_)| |     ");
    System.out.println("/ / /\\ \\ \\___| | ___ ___  _ __ ___   ___    | |_ ___     | |_| |  __ _  _ __   _ __   _   _ | |_/ / _ | | ___ ");
    System.out.println("\\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\   | __/ _ \\    |  _  | / _` || '_ \\ | '_ \\ | | | || ___ \\| || |/ __|");
    System.out.println(" \\  /\\  /  __/ | (_| (_) | | | | | |  __/   | || (_) |   | | | || (_| || |_) || |_) || |_| || |_/ /| || |\\__ \\");
    System.out.println("  \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|    \\__\\___/    \\_| |_/ \\__,_|| .__/ | .__/  \\__, |\\____/ |_||_||___/");
    System.out.println("                                                                       | |    | |      __/ |     "); 
    System.out.println("                                                                       |_|    |_|     |___/     ");
  }

}