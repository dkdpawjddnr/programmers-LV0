import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};

        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            int m = 0;
            
            StringBuffer sb = new StringBuffer();
            for(int j=0; j<coins.length; j++) {
                m = n / coins[j];
                n = n % coins[j];
                sb.append(m + " ");
            }
            System.out.println(sb);
        }
    }
}

