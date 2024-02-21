import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;
        String activity;

        Scanner input = new Scanner(System.in);
        System.out.print("What is hte temperature outside? ");
        temp = input.nextInt();

        if (temp < 5) activity = "Skiing";
        else if (temp < 15) activity = "Cinema";
        else if (temp < 25) activity = "Picnic";
        else activity = "Swimming";

        System.out.println("The activity you can do in this weather is " + activity);
    }
}