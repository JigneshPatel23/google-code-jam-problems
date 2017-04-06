
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.lang.Integer;

public class CountingSheep{

	public static void main(String[] args) throws Exception{
		System.out.println("CountingSheep");

		String inFile = "sample.in";
		String outFile = "sample.out";

		// String inFile = "A-small-practice.in";
		// String outFile = "A-small-practice.out"

		Scanner sc = new Scanner(new File(inFile));
		PrintWriter writer = new PrintWriter(outFile);

		int caseNo = 0;

		while(sc.hasNextInt()){
			caseNo++;
			int number = sc.nextInt();
			System.out.println("Number : "+number);
			writer.println("Case #"+ caseNo + ": " + logic(number));
		}
		sc.close();
		writer.close();

	}

	private static String logic(int number){
		Set<Integer> digits = new TreeSet<>();
		String result = "INSOMNIA";
		if(number != 0){
			for(int i=1; i<=Integer.MAX_VALUE; i++){
				long nextNumber = number * i;
				long temp = nextNumber;
				Set<Integer> tempDigits = new TreeSet<>();

					System.out.println("Number ("+number+") * i ("+i+") = nextNumber ("+nextNumber+")");
					while(temp > 0) {
						tempDigits.add((int)temp%10);
						temp = temp / 10;
					}
					System.out.println("Temp Digits = "+ tempDigits);

				digits.addAll(tempDigits);
				System.out.println("Digits = "+ digits);
				if(digits.containsAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9))){
					result = String.valueOf(nextNumber);
					break;
				}
			}
		}
		System.out.println("Input - "+number+"   =>   Output - "+ result);
		return result;
	}
}
