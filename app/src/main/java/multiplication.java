import java.util.Scanner;
class multiplication
{
    public static void main(String args[])
    {
        int num1, num2, multiplication;
        System.out.println("Enter two integers to calculate their multiplication: ");
        Scanner sc = new Scanner(System.in); //System.in An InputStream which is typically connected to keyboard input of console programs.
        num1 = sc.nextInt(); //scan data for input of integer value
        num2 = sc.nextInt();
        multiplication = num1 * num2;
        //prints the two integers
        System.out.println("Sum of entered integers = "+multiplication);
    }
}