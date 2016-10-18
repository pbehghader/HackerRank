import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Algorithms_Greedy_Max_Min {
	   public static void main(String[] args) throws NumberFormatException, IOException {

		      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		      int N = Integer.parseInt(in.readLine());
		      int K = Integer.parseInt(in.readLine());
		      Vector <Integer>list = new Vector<Integer>();

		      for(int i = 0; i < N; i ++)
		         list.add(Integer.parseInt(in.readLine()));
		      
		      int unfairness = Integer.MAX_VALUE;
		      
		      /*
		       * Write your code here, to process numPackets N, numKids K, and the packets of candies
		       * Compute the ideal value for unfairness over here
		      */
		    
		      Collections.sort(list,new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o1-o2;
				}
			});
		      
		      for (int i=K-1;i<list.size();i++)
		    	  if (list.elementAt(i)-list.elementAt(i-K+1)<unfairness)
		    		  unfairness = list.elementAt(i)-list.elementAt(i-K+1);
		      System.out.println(unfairness);
		   }
}
