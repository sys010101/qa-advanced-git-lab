public class Calculator {
    // Calculeaza suma a doua numere
	private static final int BONUS = 2;
	
    public int aduna(int a, int b) {
        return a + b + BONUS;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Rezultat: " + calc.aduna(5, 10));
    }
}
