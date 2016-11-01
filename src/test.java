import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class test {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		Scanner sf = new Scanner(new File("src\\StudenScores.in"));
		String []a = new String[1000];
		int maxIndx = -1;
		while(sf.hasNext()){
			maxIndx++;
			a[maxIndx] = sf.nextLine();
		}
		sf.close();
		FileWriter fw = new FileWriter("src\\StudentScores.out");
		PrintWriter output = new PrintWriter(fw);
		int total=0;
		int num=0;
		int average=0;
		
		
		String result = "";
		for (int n = 0; n <= maxIndx; n++){
			sc = new Scanner(a[n]);
			result = result + sc.next() + ", average = ";
			while (sc.hasNextInt()){
				total += sc.nextInt();
				num++;
			}
			average = (int)Math.round((double)total / num);
			output.println(result + average);
		}
		output.close();
		fw.close();

	}

}
