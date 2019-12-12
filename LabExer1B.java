import java.util.Scanner;
public class LabExer1B
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int a=scanner.nextInt();
		showNumberPlus10(a);
		showNumberPlus100(a);
		showNumberPlus1000(a);
	}
	public static void showNumberPlus10(int a){
		int b=10+a;
		System.out.println(a+ " " + "plus 10 is " +b);
	}
	public static void showNumberPlus100(int a){
		int b=100+a;
		System.out.println(a+ " " + "plus 100 is " +b);
	}
	public static void showNumberPlus1000(int a){
		int b=1000+a;
		System.out.println(a+ " " + "plus 1000 is " +b);
	}
}