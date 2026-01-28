import java.math.BigDecimal;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        // Write your code here 💖
        System.out.println("How many coins you have?");
        Scanner scanner = new Scanner(System.in);

        // needs to be BigDecimal because of byte calculation errors
        BigDecimal coins = new BigDecimal(scanner.nextInt());

        BigDecimal conversion = new BigDecimal("0.0045");
        BigDecimal money = conversion.multiply(coins);

        // going back to double so int won't show more decimal places than needed
        double intMoney = money.doubleValue();

        // finally we print it
        System.out.println("Awesome you have $ " + intMoney + " USD worth of coins on Club Penguin!");
    }
}
