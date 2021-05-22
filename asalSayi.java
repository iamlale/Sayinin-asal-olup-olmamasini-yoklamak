import java.util.Scanner;
public class asalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer number : ");
		int number=input.nextInt();
		int i;

		for(i=2; i<number; i++) {
			if (number%i==0) {
				i=number;
			}
		}
		if (i!=number) {
			System.out.println("the number is not prime");
		}
		else {
			System.out.println("the number is prime");
		}
		
		
		/*boolean isPrime=true;

		for (int i=2; i<number; i++) {
			if (number%i==0) {
				isPrime=false;
			}
        }
		if (isPrime) {
			System.out.println(number+" is prime");
		}
		else {
			System.out.println(number+" is not prime");
		}*/
	}

}
