package Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		//������ �����������
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ����������� ��� �������:");
		String str = scanner.nextLine();
			
		//������� ���� � �����������
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println("� ��������� ����������� ������� " + words.length +" c���");
		
		/*
		 � ������� ������� �� ������ ��������, �� �������� ������� ��������� ����������.
		 ������� �������� ���������� �� �������� ��������� ��������� - ������ ���� � �������� ����(�����)
		 */
		
		//����������
		Arrays.sort(words);  //���������� �� �������� � ���-�� �� ������� ��������� - ���������� ������� � ������ ��������
		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words, Collections.reverseOrder()); // �������� ���������� ������� � ������ ��������
		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words, (o1, o2) -> o1.length() - o2.length()); // c��������� �� ������ ���� �� ����������. ���������� ���������� ������-����������
		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words, (o1, o2) -> o2.length() - o1.length()); // c��������� �� ������ ���� �� ����������
		System.out.println(Arrays.toString(words));
		
		//������ ������ ����� ������������ �������						
		for (int i = 0; i < words.length; i++) {			
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);				
		}
		
		System.out.println(Arrays.toString(words));
		
		
	}

}
