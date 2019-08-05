public class Commandarg
 {
    public static void main(String[] args) 
{
     /**  int i,n=args.length;
        for(i=0;i<n;i++)
        {
            System.out.println(args[i]);
        }
	System.out.println("lenght ="+n);
**/
	int a =Integer.parseInt(args[0]);
	int b =Integer.parseInt(args[1]);
	int c =Integer.parseInt(args[2]);
	int sum=a+b+c;
	System.out.println(sum);
    }
    
}
