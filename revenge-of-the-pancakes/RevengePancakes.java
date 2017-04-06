import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class RevengePancakes {

    public static void main(String[] args) throws Exception {

        String inFile = "sample.in";
        String outFile = "sample.out";
        // String inFile = "A-small-practice.in";
        // String outFile = "A-small-practice.out";
        // String inFile = "A-large-practice.in";
        // String outFile = "A-large-practice.out";

        Scanner sc = new Scanner(new File(inFile));
        PrintWriter writer = new PrintWriter(outFile);

        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                stack.add(c);
            }

            int maneuver = 0;
            // logic
            writer.println("Case #" + tc + ": " + maneuver);
        }
        sc.close();
        writer.close();
    }
}
