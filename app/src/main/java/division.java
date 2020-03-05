import java.util.Scanner;
class division
{
    public static void main(String args[])
    {
        int num1, num2, division;
        System.out.println("Enter two integers to calculate their division: ");
        Scanner sc = new Scanner(System.in); //System.in An InputStream which is typically connected to keyboard input of console programs.
        num1 = sc.nextInt(); //scan data for input of integer value
        num2 = sc.nextInt();
        division = num1 / num2;
        System.out.println("Division of entered integers = " +division);
    }
}