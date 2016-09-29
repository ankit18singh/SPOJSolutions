import java.util.*;
import java.lang.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int a, b, sum = 0;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
        } while (a >= 200 && b >= 200);
        sum = a+b;
        System.out.println(sum);
	}
} 