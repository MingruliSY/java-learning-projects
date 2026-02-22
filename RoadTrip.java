public class RoadTrip {
public static void main(String[] args) {
    double gallons = Double.parseDouble(args[0]);
    double mpg = Double.parseDouble(args[1]);
    boolean isRaning = Boolean.parseBoolean(args[2]);
    boolean hasMountainPass = Boolean.parseBoolean(args[3]);
    int numPassengers = Integer.parseInt(args[4]);
    boolean isWeekend = Boolean.parseBoolean(args[5]);
    if (isWeekend) {
        mpg = mpg * 0.70;
    }
    if (isRaning) {
        mpg = mpg * 0.85;
    }
    if (hasMountainPass) {
        mpg = mpg * 0.90;
    }
    if (numPassengers >= 3) {
        mpg = mpg * 1.05;
    }
    double distance = gallons * mpg;
    System.out.println("Expected range:" + distance + " miles");
}
 
}