import java.util.Scanner;

public class exampleOne{
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();

    if(number == 0){
        System.out.println("Zero");
    }
    else if(number <0){
        System.out.println("Negative");
    }
    else{
        System.out.println("Positive");
    }
}
}