import java.util.Scanner;


class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("What's the bill?");
     double bill = Double.parseDouble(scan.nextLine());

     System.out.println("What percent of the bill are you tipping?");
     int tip = (int)Double.parseDouble(scan.nextLine());
     if(tip < 0 && tip > 100){
       System.out.println("You cannot tip that amount! Please input a correct tip number.");
       tip = (int)Double.parseDouble(scan.nextLine());
     }

     System.out.println("How many people are in your party?");
     int people = (int)Double.parseDouble(scan.nextLine());
     if(people < 0){
       System.out.println("You must have a party of over 0 people! Please input a correct party number.");
       people = (int)Double.parseDouble(scan.nextLine());
     }

     TipCalculator theBill = new TipCalculator(people, tip, bill);
     theBill.calculatedTip();
     theBill.calculatedBill();
     theBill.tipPerPerson();
     theBill.totalPerPerson();
  }
}