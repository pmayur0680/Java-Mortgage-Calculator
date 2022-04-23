import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prompt user for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate Mortgage Payments");
        System.out.println("The program will display your monthly payment amount");
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter loan term in years: ");
        int termYears = scanner.nextInt();
        // Apply formula
        double monthlyInterestRate = (annualInterestRate/12)/100;
        int numberOfPayments = termYears * 12;
        double numerator = (monthlyInterestRate) *
                Math.pow((1 + monthlyInterestRate), numberOfPayments);
        double denominator = Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1;
        double monthlyPayment = Math.round(principal * (numerator / denominator));
        // change to currency
        NumberFormat currency =NumberFormat.getCurrencyInstance();
        System.out.println("Your monthly payment will be: " + currency.format(monthlyPayment));
    }
}