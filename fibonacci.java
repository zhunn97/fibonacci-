import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci(i));
        }
    }

    static BigInteger Fibonacci(int n) {
        BigInteger before =new BigInteger("0");
        BigInteger behind =new BigInteger("0");
        BigInteger result =new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            if (i == 1) 
            {
                behind = result;
            } 
            else
            {
                result = before.add(behind);
                before = behind;
                behind = result;
            }
        }
        return result;
    }
}
