public class TaylorSeries {
    public static double calculateCosSeries(double x, int N){
        double sum = 0.0;
        for (int n = 0; n < N; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial(2 * n);
            sum += term;
        }
        return sum;
    }
    private static long factorial(int n){
        if(n == 0) return 1;
        long result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }
}

