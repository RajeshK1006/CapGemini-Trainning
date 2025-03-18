
import java.util.*;


public class Earth {
   public static void main(String[] args) {
       double radiusKm = 6378;


       double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);


       // Convert cubic kilometers to cubic miles (1 km^3 = 0.239913 mi^3)
       double volumeMi3 = volumeKm3 * 0.239913;


       System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f%n", volumeKm3, volumeMi3);
   }


}
