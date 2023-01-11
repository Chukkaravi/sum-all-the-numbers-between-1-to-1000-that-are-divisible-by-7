public class question3
{
    public static void main(String[] args)
    {
        int sum=0;
        int n=1000;
        for(int i=1;i<=n;i++)
        {
            if(i%7==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}