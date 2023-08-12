import java.util.Scanner;

public class ExampleTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float number = scanner.nextFloat();

        // check if it is positive or not ?
        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");

        }

        // check if it is small of laege 
        if(Math.abs(number)<1){
            System.out.println("small");
        }else if(number> 1000000){
            System.out.println("large");
        }
    }

}
