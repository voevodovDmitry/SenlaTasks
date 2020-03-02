package Task1;

import java.math.BigInteger;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			
		System.out.println("Введите  целое число для анализа");
		Integer number = 0;
		while(scanner.hasNextInt() != true) {			
			System.out.println("Вы ввели не целое число. Повторите ввод");
			scanner.nextLine();
		}
		number = scanner.nextInt();
		System.out.print("Введенное число " + number + " является ");
		
		//проверка на четность
		if(number % 2 == 0 ) {
			System.out.print("четным ");
		}
		else {
			System.out.print("нечетным ");
		}
		
		//проверка на простоту числа		
		BigInteger bigInteger = BigInteger.valueOf(number);
		boolean prime = bigInteger.isProbablePrime(number);
		if(prime  == true ) {
			System.out.print("простым ");
		}
		else {
			System.out.print("составным ");
		}
		
		
	}

}
