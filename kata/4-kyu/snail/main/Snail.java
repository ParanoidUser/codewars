interface Snail {
  static int[] snail(int[][] array) {
    if (array[0].length == 0) return new int[0];

    int[] result = new int[array.length * array.length];
    for (int i = 0, x = 0, y = 0, l = array.length - 1; l / 2 >= 0; l -= 2, x++, y++) {
      for (int j = 0; j < l; j++) result[i++] = array[x][y++];
      for (int j = 0; j < l; j++) result[i++] = array[x++][y];
      for (int j = 0; j < l; j++) result[i++] = array[x][y--];
      for (int j = 0; j < l; j++) result[i++] = array[x--][y];
    }
    if (array.length % 2 > 0) result[result.length - 1] = array[array.length / 2][array.length / 2];
    return result;
  }
}
