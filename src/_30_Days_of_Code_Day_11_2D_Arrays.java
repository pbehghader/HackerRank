
import java.util.*;

public class _30_Days_of_Code_Day_11_2D_Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = -100000;
        for (int i=0; (i+2) < 6; i++){
            for (int j=0; (j+2) < 6; j++){
                int value = 0;
                for (int ii=0;ii<3;ii++)
                    for (int jj=0;jj<3;jj++)
                        if ((jj!=0||ii!=1)&&(jj!=2||ii!=1))
                            value += arr[i+ii][j+jj];
                    
                if (value > max)
                    max=value;
            }
        }
        System.out.println(max);
        in.close();
    }
}
