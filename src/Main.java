import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Starting balance: " + account.getBalance());
        System.out.print("Enter the deposit amount: ");

        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Balance after payment: " + account.getBalance());
        System.out.print("Enter the payment amount: ");

        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Balance after payment: " + account.getBalance());
    }
}
