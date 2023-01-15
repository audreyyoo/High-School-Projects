public class Rules {
  private String start; 

  public Rules(String start) {
    this.start = start;
  }
  public String toString() {
    if (start.equals("1")) {
      return "\nRules : Fill in words where applicable and make a fun story!\n\n";
    } else {
      return "\nHave Fun!\n\n";
    }
  }
}