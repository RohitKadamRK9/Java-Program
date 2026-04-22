class Pattern1
{
    public static void main(String[] args)
    {
        int n = 4; // number of rows
        int num = 2;

        for (int i = 1; i <= n; i++)
        {
            int count = 0;

            while (count < i)
            {
                if (isPrime(num))
                {
                    System.out.print(num + "   ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }

    static boolean isPrime(int n)
    {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}