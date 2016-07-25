import java.io.IOException;
import java.util.Scanner;

public class Calcualte {
	
	public static Calcualte output=new Calcualte();
	public static final double PI = 3.14159265;
	
	public int getINTVal()throws IOException{
		Scanner in =new Scanner(System.in);
		int n =in.nextInt();
		if (n<=0){
			throw new NumberFormatException("All the values must be positive");
		}
		return n;
	}
	public double getDoubleVal(){
		Scanner in =new Scanner(System.in);
		double n=in.nextDouble();
		if (n<=0){
			throw new NumberFormatException("All the values must be positive");
		}
		return n;
		
	}
	public static void get_Vol(){
		
	}
	
	
	
	
	
	
	
	
	

	public static int main(int a) {
		return  a*a*a;
	

	}public static double main(int a,int b,int c) {
		return a*b*c;

		}
	public  static double main(double r) {
		double volume=(2*PI*r*r*r)/3;
		return volume;

	}
	public static double main(double r,double h) {
		return PI*r*r*h;
		

	}
	public void display(double volume){
		System.out.printf("%.3f\n",volume);
	}

}
