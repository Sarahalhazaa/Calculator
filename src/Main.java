import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();


        System.out.println("Enter 1 to addition the numbers\n" +
                "\n" +
                "Enter 2 to subtraction the numbers\n" +
                "\n" +
                "Enter 3 to multiplication the numbers\n" +
                "\n" +
                "Enter 4 to division the numbers\n" +
                "\n" +
                "Enter 5 to modulus the numbers\n" +
                "\n" +
                "Enter 6 to find minimum number\n" +
                "\n" +
                "Enter 7 to find maximum number\n" +
                "\n" +
                "Enter 8 to find the average of numbers\n" +
                "\n" +
                "Enter 9 to print the last result in calculator\n" +
                "\n" +
                "Enter 10 to print the list of all results in calculator\n" +
                "\n" + " Enter 0 to exit");
        int num = 0;
        int num1 = 0;
        int num2 = 0;
      //  double result = 0;
        System.out.println("Enter the transaction number you want to perform or 0 to exit");
        try {
            num = scanner.nextInt();

            while (num>10){
                System.out.println("Enter the transaction number you want to perform or 0 to exit");
            num = scanner.nextInt();}
            if (num!=9 &&num != 10){
                System.out.println("Enter First Number:");
                num1 = scanner.nextInt();
                System.out.println("Enter second Number:");
                num2 = scanner.nextInt();}

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        calculator( A, num,num1, num2);
    }

    public static void calculator(ArrayList<Integer> A, int num, int num1, int num2) {
int result=0;
        while (num!=0) {

            switch (num) {
                case 1:
                    result=num1 + num2;
                    A.add(result);
                    System.out.println(result);
                    break;
                case 2:
                    result=num1 - num2;
                    A.add(result);
                    System.out.println(result);
                    break;
                case 3:
                    result=num1 * num2;
                    A.add(result);
                    System.out.println(result);
                    break;
                case 4:
                   try {
                       result=num1 / num2;
                       A.add(result);
                       System.out.println(result);
                   }catch (ArithmeticException e1){
                       System.out.println(e1.getMessage());}
                    break;
                case 5:
                    result=num1 % num2;
                    A.add(result);
                    System.out.println(result);
                    break;
                case 6:
                    result=Math.min(num1, num2);
                    A.add(result);
                    System.out.println(result);
                    break;
                case 7:
                    result=Math.max(num1, num2);
                    A.add(result);
                    System.out.println(result);
                    break;
                case 8:
                    result=(num1 + num2) / 2;
                    A.add(result);
                    System.out.println(result);
                    break;
                case 9:

                   System.out.println(result);
                    break;
                case 10:
                    System.out.println(A);
                    break;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the transaction number you want to perform or 0 to exit");
            num = scanner.nextInt();
            if (num==0){
                break;
            }
            if (num!=9 &&num != 10){
            System.out.println("Enter First Number:");
            num1 = scanner.nextInt();
            System.out.println("Enter second Number:");
            num2 = scanner.nextInt();}
        }
    }
}

