package Task4;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите предложение:");
		String sentence =  scanner.nextLine();
		System.out.println("Введите слово:");
		String word =  scanner.nextLine();
		if (word.equals("") || sentence.equals("")) throw new IllegalArgumentException("Некорректный ввод");
		
		/*
		 удаляем из введенного предложения запятые, точки, вопросительные и восклицательные знаки
		 это нужно для того, чтобы после метода split() слова не содержали в себе лишних символов и правильно сравнивались с введенным словом
		 */
		sentence = sentence.replaceAll(",","").replaceAll("\\.","").replaceAll("\\!","").replaceAll("\\?","");
		
		System.out.println(sentence);
		int result = 0;
		String[] words = sentence.split(" ");
		
		
		for (String w : words) {	
			
			if(w.equalsIgnoreCase(word) == true) {
				result++;
			}
		}
		
		System.out.println("В введенном предложении слово " + word + " встречается " + result + " раз");

	}

}
