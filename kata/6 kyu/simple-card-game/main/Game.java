class Game {
  static String winner(String[] deckSteve, String[] deckJosh) {
    int steve = 0, josh = 0;
    for (int i = 0; i < deckSteve.length; i++) {
      int score = "23456789TJQKA".indexOf(deckSteve[i]) - "23456789TJQKA".indexOf(deckJosh[i]);
      if (score > 0) steve++;
      if (score < 0) josh++;
    }
    return steve == josh ? "Tie" : steve > josh ? "Steve wins " + steve + " to " + josh : "Josh wins " + josh + " to " + steve;
  }
}
