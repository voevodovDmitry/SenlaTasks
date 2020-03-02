package Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		//вводим предложение
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите предложение для анализа:");
		String str = scanner.nextLine();
			
		//подсчет слов в пердложении
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println("В введенном предложении имеется " + words.length +" cлов");
		
		/*
		 В условии задании не указан параметр, по которому следует выполнить сортировку.
		 Поэтому выполним сортировку по наиболее вероятным критериям - длинна слов и значение слов(строк)
		 */
		
		//сортировки
		Arrays.sort(words);  //сортировка по значению в зав-ти от таблицы кодировки - Алфавитный порядок с учетом регистра
		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words, Collections.reverseOrder()); // обратный алфавитный порядок с учетом регистра
		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words, (o1, o2) -> o1.length() - o2.length()); // cортировка по длинне слов от наименьшей. компаратор реализован лямбда-выражением
		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words, (o1, o2) -> o2.length() - o1.length()); // cортировка по длинне слов от наибольшей
		System.out.println(Arrays.toString(words));
		
		//Делаем первую букву каждогослова большой						
		for (int i = 0; i < words.length; i++) {			
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);				
		}
		
		System.out.println(Arrays.toString(words));
		
		
	}

}
