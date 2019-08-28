package home_work.week1;

import java.util.Scanner;

/*
6. Известны две скорости, одна в километрах в час, другая в метрах в секунду.
Какая из них больше?
 */
public class _06KmhVsMs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter speed in km/h - ");
        double kmh = sc.nextDouble();
        System.out.println("Please enter speed in m/s - ");
        double ms = sc.nextDouble();

        if ( ( kmh / 3.6 ) < ms ) {
            System.out.println("Higher speed is - " + ms + "m/s. It`s - " + (ms * 3.6) + "km/h.");
        } else if ( ( ms / 3.6 ) < kmh ) {
            System.out.println("Higher speed is - " + kmh +  "km/h. It`s - "  + (kmh  / 3.6) + "m/s.");
        } else System.out.println("This speeds are equal!");
    }
}
