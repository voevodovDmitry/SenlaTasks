package Task5;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		 final int MIN_VALUE = 0;
		 final int MAX_VALUE = 100;
		 int value = -1;
		 
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("Введите число N (от 0 до 100), до которого будет производится проверка на палиндром");
		 do {
			 value = scanner.nextInt();
			 if(value > MAX_VALUE || value < MIN_VALUE) {
				 System.out.println("Некорректный ввод. Введите число от 0 до 100");
				 value = -1;
			 }
		 } while (value == -1);
		 
		 for (int i = 0; i < value + 1; i++) {
			if(Palindrome(i)) {
				System.out.println(i);
			}
		}
		
		 
		

	}
	
	public static boolean Palindrome (int x) {
		int x1 = x;
		int x2 = 0;
		
		
		while (x / 1 != 0) {
            x2 *=10;
            x2 += x % 10;
            x /=10;
        }
		return x1 ==x2;
	}

}
