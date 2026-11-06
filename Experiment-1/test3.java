import java.util.Scanner;

class test3
{
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter a number:");

        int num = SC.nextInt();
        SC.close();

        int original = num;

        int reverse = 0;

        while(num != 0)
        {
            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        if(original == reverse)
		{
            System.out.println("Palindrome Number");
		}
        else
		{
            System.out.println("Not a palindrome number");
		}
    }
}