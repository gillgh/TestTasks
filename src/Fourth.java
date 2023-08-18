import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        int hours;
        int minutes;
        double angleHours;
        double angleMinutes;
        double angleBetween;

        Scanner in = new Scanner(System.in);
        System.out.print("Insert hours: ");
        hours = in.nextInt();
        System.out.print("Insert minutes: ");
        minutes = in.nextInt();

        angleMinutes = minutes * 6;
        angleHours = ((angleMinutes / 360) * 30) + (hours * 30);

        if(angleHours > angleMinutes){
            angleBetween = angleHours - angleMinutes;
        }
        else{
            angleBetween = angleMinutes - angleHours;
        }
        System.out.println("The angle between the hands of the clock is: " + angleBetween);
    }

}
