package Task4;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����������:");
		String sentence =  scanner.nextLine();
		System.out.println("������� �����:");
		String word =  scanner.nextLine();
		if (word.equals("") || sentence.equals("")) throw new IllegalArgumentException("������������ ����");
		
		/*
		 ������� �� ���������� ����������� �������, �����, �������������� � ��������������� �����
		 ��� ����� ��� ����, ����� ����� ������ split() ����� �� ��������� � ���� ������ �������� � ��������� ������������ � ��������� ������
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
		
		System.out.println("� ��������� ����������� ����� " + word + " ����������� " + result + " ���");

	}

}
