import java.util.Scanner;
public class daireAlan {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a radius: ");
		double radius=kb.nextDouble();
		System.out.println("Enter a angle: ");
		double angle=kb.nextDouble();
		double circleArea= (Math.PI*(radius*radius)*angle)/360;
		System.out.println("The circle area is: "+circleArea);
		
		
		

	}

}
