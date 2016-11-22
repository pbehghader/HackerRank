import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mathematics_Combinatorics_Sherlock_and_Pairs {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            while(n-->0){
                int x = sc.nextInt();
                if (!map.containsKey(x))
                    map.put(x,0);
                map.put(x,map.get(x)+1);
            }
            BigInteger total = BigInteger.ZERO;
            for (Integer k : map.keySet()){
                int v = map.get(k);
                BigInteger perm;
                perm = new BigInteger(Integer.toString(v));
                perm = perm.multiply(new BigInteger(Integer.toString(v-1)));
                total= total.add(perm);
            }
            System.out.println(total);
        }
    }
}
