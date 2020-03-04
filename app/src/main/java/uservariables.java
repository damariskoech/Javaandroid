public class uservariables{
    public static void main(String [] args){
        int num1,num2,sum;
        scanner.sc = new scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("the sum of these numbers;"+sum);


    }
}