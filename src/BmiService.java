public class BmiService {

    public int calculate(int m, double h) {
        double result;
        result = m / (h * h);
        return (int) result;
    }
}