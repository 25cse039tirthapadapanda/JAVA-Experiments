import java.util.Scanner;

class test2
{
    int num, rem, sum;

    public void cal()
    {
        System.out.println("Enter a number:");
        Scanner SC = new Scanner(System.in);

        num = SC.nextInt();
        SC.close();

        while(num > 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("The sum of the number is:" + sum);
    }

    public static void main(String args[])
    {
        test2 ob = new test2();
        ob.cal();
    }
}