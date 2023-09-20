import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal calculator = new Animal();



        Scanner scanner = new Scanner(System.in);
        String kontynuuj = "tak";

        while (kontynuuj.equals("tak")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String operacja = scanner.next();


            if (operacja.equals("+")) {
                System.out.println(calculator.dodawanie(a, b));
            } else if (operacja.equals("-")) {
                System.out.println(calculator.odejmowanie(a, b));
            } else {
                System.out.println("Operacja nie jest wspierana");
            }

            kontynuuj = scanner.next();
        }
    }
}