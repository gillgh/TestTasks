import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args){
        BaseConverter converter = new BaseConverter();
        converter.Convert();


    }

    public void Convert(){
        char input;
        double match = 0;
        double Cel;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter degrees Celsius: ");
        Cel = in.nextDouble();
        System.out.println("Enter the desired unit of measurement: ('K' for Kelvin or 'F' for Fahrenheit)");
        input = in.next().charAt(0);
        if(input == 'K'){
            match = Cel + 273.15;
        }
        if (input == 'F') {
            match = 1.8 * Cel + 32;
        }
        System.out.println("Response: " + match);
    }

}


