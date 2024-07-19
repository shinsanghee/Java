import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	        
	int a;
	int b;
	int sum;

	System.out.print("첫번째 정수를 입력하시오: ");
	    a = input.nextInt();

	System.out.print("두번째 정수를 입력하시오: ");
	    b = input.nextInt();

	sum = a - b;

	System.out.println("차는 " + sum + "입니다.");
	 }
	}