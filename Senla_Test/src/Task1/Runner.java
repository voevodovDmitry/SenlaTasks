package Task1;

import java.math.BigInteger;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			
		System.out.println("�������  ����� ����� ��� �������");
		Integer number = 0;
		while(scanner.hasNextInt() != true) {			
			System.out.println("�� ����� �� ����� �����. ��������� ����");
			scanner.nextLine();
		}
		number = scanner.nextInt();
		System.out.print("��������� ����� " + number + " �������� ");
		
		//�������� �� ��������
		if(number % 2 == 0 ) {
			System.out.print("������ ");
		}
		else {
			System.out.print("�������� ");
		}
		
		//�������� �� �������� �����		
		BigInteger bigInteger = BigInteger.valueOf(number);
		boolean prime = bigInteger.isProbablePrime(number);
		if(prime  == true ) {
			System.out.print("������� ");
		}
		else {
			System.out.print("��������� ");
		}
		
		
	}

}
