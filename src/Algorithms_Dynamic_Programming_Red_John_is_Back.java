import java.util.Scanner;

public class Algorithms_Dynamic_Programming_Red_John_is_Back {
	public static void main (String [] arsg){
		
		long [] m = new long [41];
		
		m[0]=1;
		
		for (int i=1;i<41;i++){
			m[i]=m[i-1];
			if (i-4>=0)
				m[i]+=m[i-4];
		}
			
		
		boolean[] pr = new boolean [(int) m[40]+1];
		
		pr[0] = false;
		pr[1] = false;
		
		for (int i=2;i<m[40];i++){
			pr[i]=true;
			for (int j=2;j*j<=i;j++)
				if (i%j==0){
					pr[i]=false;
					break;
				}
		}
		
		long p[] = new long[41];
		
		for (int i=1;i<41;i++){
			p[i]=p[i-1];
			for (long j=m[i-1]+1;j<=m[i];j++){
				if (pr[(int) j])
					p[i]++;
			}
		}
			
		Scanner sc = new Scanner (System.in);
		
		int T=sc.nextInt();
		while (T-->0){
			int n = sc.nextInt();
			System.out.println(p[n]);
		}
		sc.close();
	}
}
