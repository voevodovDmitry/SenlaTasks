package Task2;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		/*
		 В условии задачи сказано, что числа целые, из этого следует, что на вход могут поданы отрицательные числа и 0. 
		 В случае, когда одно из чисел меньше нуля, стандартное решение будет неправильным, т.к. НОД определяется как отрицательное число. 
		 Это неверно по определению НОД
		 Для решения этой проблемы в методе nod возвращается модуль числа а		 		 
		 */
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Введите целое число а");
		while(scanner.hasNextInt() != true) {			
			System.out.println("Вы ввели не целое число. Повторите ввод");
			scanner.nextLine();
		}
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите целое число b");
		while(scanner.hasNextInt() != true) {			
			System.out.println("Вы ввели не целое число. Повторите ввод");
			scanner.nextLine();
		}
		int b = scanner.nextInt();
		if(a==0 && b==0) {
			System.out.println("Набор входных данных а=0, b=0 недопустим");
		}
		
		System.out.println("HOД для чисел " + a +" и " + b + " равен " +nod(a,b));
		System.out.println("HOK для чисел " + a +" и " + b + " равен " +nok(a,b));
		
	}
	
	public static int nod(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
					
		return nod(b, a % b);
	}
	
	/*
	 По определению НОК находится как произведение исходных чисел делённое на их НОД.
	 По определению НОК - наименьшее натуральное число, которое делится на a и b без остатка
	 Поэтому для корректной реализации метод nok  возвращает модуль вычисленного значения
	 */
	static int nok (int a, int b){
        return Math.abs((a*b)/nod(a,b));
    }

}
