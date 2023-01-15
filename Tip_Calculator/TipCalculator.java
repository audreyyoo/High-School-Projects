import java.util.*;
import java.lang.*;
import java.io.*;


public class TipCalculator {
  //attributes
  private int people;
  private int tip;
  private double bill;

  //constructors
  public TipCalculator(int p, int t, double b){
    people = p;
    tip = t;
    bill = b;
  }

  //getters and setters
  public int getPeople(){
    return people;
  }
  public int getTip(){
    return tip;
  }
  public double getBill(){
    return bill;
  }
  
  //methods
  public double calculatedTip(){
    double notRoundedTip = (double) tip / 100 * bill;
    double roundedTip = Math.round(notRoundedTip*100.0)/100.0;
    System.out.println("Tip: $" + roundedTip);
    return roundedTip;
  }
  public double calculatedBill(){
    double notRoundedBill = (tip / 100 * bill) + bill;
    double roundedBill = Math.round(notRoundedBill*100.0)/100.0;
    System.out.println("Bill: $" + roundedBill);
    return roundedBill;
  }
  public double tipPerPerson(){
    double notRoundedTipPerPerson = (double) tip / 100 * bill / people;
    double roundedTipPerPerson = Math.round(notRoundedTipPerPerson*100.0)/100.0;
    System.out.println("Tip per person: $" + roundedTipPerPerson);
    return roundedTipPerPerson;
  }
  public double totalPerPerson(){
    double notRoundedTotalPerPerson = ((tip / 100 * bill) + bill) / people;
    double roundedTotalPerPerson = Math.round(notRoundedTotalPerPerson*100.0)/100.0;
    System.out.println("Total per person: $" + roundedTotalPerPerson);
    return roundedTotalPerPerson;
  }
}