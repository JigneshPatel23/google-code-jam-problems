
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.lang.Integer;

public class CountingSheep{

	public static void main(String[] args) throws Exception{

		// String inFile = "sample.in";
		// String outFile = "sample.out";
		// String inFile = "A-small-practice.in";
		// String outFile = "A-small-practice.out";
		String inFile = "A-large-practice.in";
		String outFile = "A-large-practice.out";

		Scanner sc = new Scanner(new File(inFile));
		PrintWriter writer = new PrintWriter(outFile);

		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++){
			int n = sc.nextInt();
			Set<Integer> digits = new TreeSet<>();
			int last = 0;
			if(n != 0){
				for(int i=1; i<=Integer.MAX_VALUE; i++){
					int next = last = n * i;
					Set<Integer> nextDigits = new TreeSet<>();
						while(next > 0) {
							nextDigits.add((int)next%10);
							next = next / 10;
						}
					digits.addAll(nextDigits);
					if(digits.containsAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9))){
						break;
					}
				}
			}
			if(last == 0) writer.println("Case #"+ tc + ": INSOMNIA");
			else writer.println("Case #"+ tc + ": " + last);
		}
		sc.close();
		writer.close();
	}
}
