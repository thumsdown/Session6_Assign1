import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	Calculator a = new Calculator();
	Calculator2 b = new Calculator2();
	System.out.println("Enter n:");
	num = sc.nextInt();
	
	System.out.println("Calculator prints = "+ a.myCal(num));
	System.out.println("Calculator2 prints = "+ b.myCal(num));
	sc.close();
}
}
