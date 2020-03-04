import java.util.Scanner;
 class uservariables
{
    public static void main(String args[])
    {
        int p, q, r;
        System.out.println("Enter two integers to calculate their sum: ");
        Scanner sc = new Scanner(System.in); //System.in An InputStream which is typically connected to keyboard input of console programs.
        p = sc.nextInt(); //scan data for input of integer value
        q = sc.nextInt();
        r = p + q;
        System.out.println("Sum of entered integers = "+r);
    }
}