public class Main {
    public static void main(String[] args) {
        double miles = convertKmToMiles(30);

        double resultImKm = convertMilesToKm(24);
        printResult(resultImKm);
    }

    public static final double KM_IN_ONE_MILE = 1.6;

    public static double convertMilesToKm(double miles) {
        return miles * KM_IN_ONE_MILE;
    }

    public static double convertKmToMiles(double km) {
        return km / KM_IN_ONE_MILE;
    }

    public static void printResult(double result) {
        System.out.println(String.format("%.2f", result));
    }
}
