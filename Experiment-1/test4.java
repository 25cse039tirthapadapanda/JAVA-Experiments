import java.util.Scanner;

class test4
{
    int num;
    boolean isprime = true;

    public void prime()
    {
        Scanner SC = new Scanner(System.in);

        num = SC.nextInt();
        SC.close();

        if(num <= 1)
        {
            isprime = false;
        }
        else
        {
            for(int i = 2; i <= num / 2; i++)
            {
                if(num % i == 0)
                {
                    isprime = false;
                    break;
                }
            }
        }

        if(isprime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }

    public static void main(String args[])
    {
        test4 ob = new test4();

        ob.prime();
    }
}