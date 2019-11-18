import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * @author Abhay Dang
 */

public class WeaponValue {

	public static void main(String[] args) throws Exception {
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in));
		
		String line = reader.readLine();

		int T = Integer.parseInt(line);
		
		for (int i=0; i<T; i++) {
			
			line = reader.readLine();
			int N = Integer.parseInt(line);
			int arr[] = new int[] {0,0,0,0,0,0,0,0,0,0};
			
			for (int j=0; j<N; j++) {
				line = reader.readLine();
				
				for (int k=0; k<10; k++)
					if (line.charAt(k) == '1')
						arr[k] = (arr[k] + 1) % 2;
			}
			
			int sum = 0;
			
			for (int k=0; k<10; k++) sum += arr[k];
			
			System.out.println(sum);
		}
	}

}
