package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num1:");
		int x=s.nextInt();
		System.out.println("Enter num2:");
		int y=s.nextInt();
		System.out.println("\n1.Addition\n2.Difference\n3.Multiplication\n4.Division");
		System.out.println("Enter your choice:");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1: Addition a1=new Addition();
			    a1.add(x, y);
			    break;
		case 2: Difference s1=new Difference();
	    		s1.diff(x, y);
	    		break;
		case 3: Multiplication m1=new Multiplication();
	    		m1.mul(x, y);
	    		break;
		case 4: Division d1=new Division();
	    		d1.div(x, y);
	    		break;
	    default : System.out.println("\nEnter valid choice");
		}
	}

}
