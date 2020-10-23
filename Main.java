class Main {
  public static void main(String[] args) {
    zahlenfilter();
  }

  public static void zahlenfilter(){
    int ergebnis = 0;

    for (int i = 0; i < 200; i++) {
      if (i % 5 == 0) {
        System.out.println(i + " ist durch 5 teilbar!" + "\n");
      }
      if (i % 10 == 9) {
        System.out.println(i + " endet auf 9!" + "\n");
      }
      if ((i + (i-1)) % 3 == 0) {
        ergebnis = i + (i-1);
        System.out.println(i + " und " + (i-1) + " ergeben " + ergebnis + " und " + ergebnis + " ist durch 3 teilbar!" + "\n");
      }
    }
  }
}