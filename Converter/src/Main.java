public class Main {
    public static void main(String[] args) {
        double miles = convertKmToMiles(30);

    }

    public static final double KM_IN_ONE_MILE = 1.6;
    public static double convertKmToMiles(double km) {
        return km / KM_IN_ONE_MILE;
    }

}
