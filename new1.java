import java.util.Scanner;

public class new1 {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter Your Name:-");
        String name = scanner.nextLine();
       
        System.out.print("Enter your roll number:-");
        int roll = scanner.nextInt();

        System.out.print("Enter your Fee:-");
        int fee = scanner.nextInt();

        System.out.println("Name is:-" + name +", "+ "roll is:-" + roll + ", "+"fee is:-" + fee);
        scanner.close();
    }
}