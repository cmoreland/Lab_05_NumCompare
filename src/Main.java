import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number as an integer: ");
        if (in.hasNextInt()){
            int num1 = in.nextInt();
            System.out.println("Enter the second number as an integer: ");
            if (in.hasNextInt()){
                int num2 = in.nextInt();
                if (num1 > num2){
                    System.out.println(num1 + " is larger than " + num2);
                }
                else if (num1 < num2){
                    System.out.println(num1 + " is smaller than " + num2);
                }
                else {
                    System.out.println(num1 + " is equal to " + num2);
                }
            }
            else {
                System.out.println("That input is not correct. Try again.");
            }
        }
        else {
            System.out.println("That input is not correct. Try again.");
        }
    }
}