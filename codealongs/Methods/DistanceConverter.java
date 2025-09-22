package codealongs.Methods;

public class DistanceConverter {
    public static void main(String[] args) {
        milesToKilometers(0.9);
        milesToKilometers(54);
        milesToKilometers(2789);
    }

    static void milesToKilometers(double miles) {
        
        double kilometers = miles * 1.60934;
        System.out.println(kilometers);
    }
    
}
