import java.util.Scanner;

public class Algorithms_Bit_Manipulation_2_s_complement {
	public static void main (String[] args){
		
		Scanner in = new Scanner (System.in);
		int t = in.nextInt();
		
		while (t-->0){
			long a,b;
			a=in.nextInt();
			b=in.nextInt();
			
			long total=0;
			
			if (a>0&&b>0)
				total=ones(b)-ones(a-1);
			else if (a<0&&b<0)
				total=ones(a)-ones(b+1);
			else
				total=ones(a)+ones(b);
			System.out.println(total);
		}
			
	}
	
	public static long ones(long x){
		if (x>0){
			return fp(x);
		}else
			return fn(x);
	}
	
	public static long fp(long x){
		if (x==0)
			return 0;
		long k = 1;
		while (k*2<=x)
			k*=2;
		
		return x-k+1+fp(x-k)+mp(k);
	}
	
	public static long mp(long k){
		if (k==0)
			return 0;
		return k/2+2*mp(k/2);
	}
	
	public static long fn(long x){
		long k=1;
		long p=0;
		while (k*2<=-x){
			k*=2;
			p++;
		}
		long mnk = (32-p)*k+mp(k);
		long alpha=-x-k;
		long rest=alpha*(32-(1+p))+fp(k-1)-fp(k-1-alpha);
		return mnk+rest;
		
	}
}
