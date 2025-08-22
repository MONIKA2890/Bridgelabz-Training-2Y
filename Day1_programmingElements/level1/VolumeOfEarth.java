public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378; // in km
        double pi = 3.14159;
        
        double volumeKm = (4.0/3.0) * pi * Math.pow(radius, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3); 
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and in cubic miles is " + volumeMiles);
    }
}  
