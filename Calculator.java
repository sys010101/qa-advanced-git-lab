public class Calculator {
  public int aduna(int a, int b) {
    int bonus = 2;
    return a + b + bonus;
  }
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("Rezultat: " + calc.aduna(5, 10));
  }
}