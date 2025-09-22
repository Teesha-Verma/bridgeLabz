package bridgeLabz.basic;
public class Prog7EarthVolume {
    public static void main(String[] args) {
        double rKm = 6378;
        double volumeKm3 = (4.0/3) * Math.PI * Math.pow(rKm, 3);
        double rMiles = rKm / 1.609; // convert radius to miles
        double volumeMiles3 = (4.0/3) * Math.PI * Math.pow(rMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " +
            volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
