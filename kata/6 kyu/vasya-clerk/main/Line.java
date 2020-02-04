class Line {
  static String Tickets(int[] peopleInLine) {
    int twenty = 0, fifty = 0;
    for (int bill : peopleInLine) {
      if (bill < 26) {
        twenty++;
      } else if (bill < 51 && twenty > 0) {
        fifty++;
        twenty--;
      } else if (bill > 50 && twenty > 0 && fifty > 0) {
        fifty--;
        twenty--;
      } else if (bill > 50 && twenty > 2) {
        twenty -= 3;
      } else {
        return "NO";
      }
    }
    return "YES";
  }
}