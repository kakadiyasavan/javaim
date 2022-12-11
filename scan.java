import java.util.Scanner;

public class scan{

    public static void main(String[] args) {
        int a;
        String b;

        Scanner dk = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        a = dk.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter your name : ");
        b = op.nextLine();

        System.out.println("Number is : "+a);
        System.out.println("Name is : "+b);
    }
}