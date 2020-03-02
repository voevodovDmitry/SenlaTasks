package Task2;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		/*
		 � ������� ������ �������, ��� ����� �����, �� ����� �������, ��� �� ���� ����� ������ ������������� ����� � 0. 
		 � ������, ����� ���� �� ����� ������ ����, ����������� ������� ����� ������������, �.�. ��� ������������ ��� ������������� �����. 
		 ��� ������� �� ����������� ���
		 ��� ������� ���� �������� � ������ nod ������������ ������ ����� �		 		 
		 */
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("������� ����� ����� �");
		while(scanner.hasNextInt() != true) {			
			System.out.println("�� ����� �� ����� �����. ��������� ����");
			scanner.nextLine();
		}
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� ����� b");
		while(scanner.hasNextInt() != true) {			
			System.out.println("�� ����� �� ����� �����. ��������� ����");
			scanner.nextLine();
		}
		int b = scanner.nextInt();
		if(a==0 && b==0) {
			System.out.println("����� ������� ������ �=0, b=0 ����������");
		}
		
		System.out.println("HO� ��� ����� " + a +" � " + b + " ����� " +nod(a,b));
		System.out.println("HOK ��� ����� " + a +" � " + b + " ����� " +nok(a,b));
		
	}
	
	public static int nod(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
					
		return nod(b, a % b);
	}
	
	/*
	 �� ����������� ��� ��������� ��� ������������ �������� ����� ������� �� �� ���.
	 �� ����������� ��� - ���������� ����������� �����, ������� ������� �� a � b ��� �������
	 ������� ��� ���������� ���������� ����� nok  ���������� ������ ������������ ��������
	 */
	static int nok (int a, int b){
        return Math.abs((a*b)/nod(a,b));
    }

}
