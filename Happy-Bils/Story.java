public class Story {
  // story1: Brooklyn Tech shenanigans 
  String[] sentence1 = {"One", "morning", "at", "Brooklyn", "Technical", "High", "School,", "I", "saw", "a", "noun."};
  String[] sentence2 = {"I", "felt", "adjective."};
  String[] sentence3 = {"Then,", "I", "met", "up", "with", "person."};
  String[] sentence4 = {"We", "went", "to", "the", "place", "and", "ate", "noun."};
  String[] sentence5 = {"It", "was", "very", "adjective."};
  String[] sentence6 = {"Later", "we", "went", "to", "class", "and", "saw", "a", "noun."};
  String[] sentence7 = {"It", "smelled", "adjective."};
  String[] sentence8 = {"I", "went", "to", "use", "the", "bathroom", "to", "verb(present)."};
  String[] sentence9 = {"I", "felt", "much", "better", "after", "and", "decided", "to", "go", "to", "the", "place."};
  String[] sentence10 = {"Brooklyn", "Tech", "is", "so", "adjective."};
    
  // story2: Technite Food Fight
  String[] fight1 = {"You", "will", "never", "guess", "what", "I", "saw", "in", "school", "today!"};
  String[] fight2 = {"In", "the", "place", "there", "was", "a", "huge", "food", "fight."};
  String[] fight3 = {"person", "started", "the", "fight", "and", "started", "throwing", "tomatoes."};
  String[] fight4 = {"Then", "person", "started", "throwing", "potatoes", "back."};
  String[] fight5 = {"Then,", "the", "lunch", "ladies", "joined", "and", "verb(past)."};
  String[] fight6 = {"But", "suddenly", "person", "came", "in", "and", "burned", "the", "school", "down."};
  String[] fight7 = {"We", "learned", "our", "lesson", "to", "never", "food", "fight", "again", "but", "it", "was", "adjective."};

  // story3: A Letter to CollegeBoard
  String[] letter1 = {"Dear", "Collegeboard,\n", "I", "am", "writing", "to", "you", "to", "ask", "for", "a", "noun."};
  String[] letter2 = {"It", "has", "come", "to", "my", "attention", "that", "you", "are", "all", "adjective."};
  String[] letter3 = {"You", "should", "verb(present)."};
  String[] letter4 = {"I", "am", "a", "noun."};
  String[] letter5 = {"So,", "please", "be", "adjective."};
  String[] letter6 = {"It", "would", "mean", "a", "lot", "to", "me"};
  String[] letter7 = {"\nSincerely,", "person."};
  
  String[][] scenario = {sentence1, sentence2, sentence3, sentence4, sentence5, sentence6, sentence7, sentence8, sentence9, sentence10};

  String[][] foodFight = {fight1, fight2, fight3, fight4, fight5, fight6, fight7};

  String[][] letter = {letter1, letter2, letter3, letter4, letter5, letter6, letter7};

  public String[][] getFoodFight() {
    return foodFight;
  }
  public String[][] getScenario() {
    return scenario;
  }
  public String[][] getLetter() {
    return letter;
  }
}
