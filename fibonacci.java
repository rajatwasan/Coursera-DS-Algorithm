import java.util.Scanner;
import java.math.BigInteger;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }
  
  private static BigInteger fib_fast(int n){
	  BigInteger r1, r2, res;
	  BigInteger x=new BigInteger("1");
	  BigInteger y=new BigInteger("10");
	  
	  res = new BigInteger("0");
	  r1=new BigInteger("0");
	  r2=new BigInteger("1");
	   for(int i=2;i<=n+2;i++){
		   res= r1.add(r2);
		   r1 = r2;
		   r2 = res;
	   }
	   return (res.subtract(x)).remainder(y);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
	int m = in.nextInt();
	BigInteger r1,r2;
	r1=fib_fast(n);
	r2=fib_fast(m-1);
	System.out.println(r2.subtract(r1));
  }
}
