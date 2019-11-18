import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * @author Abhay Dang
 */

public class HardSequence {
	
	public static void main(String[] args) throws Exception {
		int S[] = new int[128];
		S[0] = 0; S[1] = 0;
		for (int i=2; i<S.length; i++) {
			boolean found = false;
			int j;
			for (j=i-2; j>=0 && !found; j--) {
				if (S[j] == S[i-1])
					found = true;
			}
			if (found)
				S[i] = i-j-2;
			else
				S[i] = 0;
		}	
		
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in));
		
		String line = reader.readLine();
		int T = Integer.parseInt(line);
		
		for (int i=0;i<T; i++) {
			line = reader.readLine();
			int N = Integer.parseInt(line)-1, count = 0;
			
			for (int j=0; j<=N; j++)
				if (S[j] == S[N]) count++;
			
			System.out.println(count);
		}
		
	}
}
