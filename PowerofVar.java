public class PowerofVar {

    public static void main(String[] args) {
        double base = 2;
        int exponent = 5;
        double result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double halfPow = power(x, n / 2);
            return halfPow * halfPow;
        } else {
            double halfPow = power(x, (n - 1) / 2);
            return x * halfPow;
        }
    }

}
