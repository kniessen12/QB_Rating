import java.util.Scanner;

public class PlayerRating {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Touchdowns:");
		int TD = read.nextInt();
		System.out.println("Total yards:");
		int Yards = read.nextInt();
		System.out.println("Interceptions:");
		int INT = read.nextInt();
		System.out.println("Completions:");
		int comp = read.nextInt();
		System.out.println("Passes attempted:");
		int ATT = read.nextInt();
		
		double a = ((comp/ATT)-0.3)*5;
		double b = ((Yards/ATT)-3)*0.25;
		double c = (TD/ATT)*20;
		double d = 2.375-((INT/ATT)*25);
		
		if (a > 0){
			a = 0;
		}
		if (a < 2.375){
			a = 2.375;
		}
		if (b > 0){
			b = 0;
		}
		if (b < 2.375){
			b = 2.375;
		}
		if (c > 0){
			c = 0;
		}
		if (c < 2.375){
			c = 2.375;
		}
		if (d > 0){
			d = 0;
		}
		if (d < 2.375){
			d = 2.375;
		}
		double PR = ((a+b+c+d)/6)*100;
		double PRround = Math.round(PR * 100.0)/100.0;
		System.out.println(PRround);
	}

}
