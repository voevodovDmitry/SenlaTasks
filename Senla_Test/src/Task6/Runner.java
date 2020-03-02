package Task6;

import java.util.Arrays;
import java.util.Comparator;

/*
 � ������� ������ �������, ��� ���������� ��������� ������. ��� ����� �������������� �����������  ��� ������� ����������� ��������� ������� � ������������
 ���������.
 ����� ������� ������ ����� �������� ����������� ������� ���������
 
 ������� ������ ����� �������� �� ��������� �����:
 1) ���������� �������� ��������� �������� �� ������� ����
 2) ���������� ��������� �� �������� ��������� �� ��������
 3) ���������� � ����� n ����� ��������� � ����� ������� �������� ����������
 4) ���������� � ����� ����������� ����� n+1 ��������  
 */
public class Runner {

	public static void main(String[] args) {
		
		final int MAX_WEIGTH = 40; // ����������� �������
		
		final Item Item1 =  new Item(4,20);
		final Item Item2 =  new Item(3,18);
		final Item Item3 =  new Item(2,14);
		final Item Item4 =  new Item(3,18);
		final Item Item5 =  new Item(3,15);
		final Item Item6 =  new Item(5,22);
		final Item Item7 =  new Item(6,23);
		final Item Item8 =  new Item(7,25);
		final Item Item9 =  new Item(8,29);
		final Item Item10 =  new Item(9,33);
		
		final Item[] items = {Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10,}; // ����� ���� ��������� ���������
		
		Arrays.sort(items, Comparator.comparingDouble(Item::getUnitCost).reversed()); // ���������� ������� �� �������� ��������� �� ��������
		
		for (Item i : items) {
			System.out.println(i.showItem());
		}
		
		int currentWeight = 0; //���������� ��� �������� �������� ���� ������ ���������
		double currentCost = 0; //���������� ��� �������� ������� ��������� ������ ���������
		int curretItem = 0; //���������� ��� �������� ������� �������� ��������
		
		while(curretItem < items.length && currentWeight != MAX_WEIGTH) {
			if(currentWeight + items[curretItem].getWeight() < MAX_WEIGTH) {
				currentWeight+=items[curretItem].getWeight();
				currentCost+=items[curretItem].getCost();
			}
			else {
				currentCost+= (MAX_WEIGTH - currentWeight) /(double) items[curretItem].getWeight() * items[curretItem].getCost();
				currentWeight = MAX_WEIGTH;
			}
			curretItem++;
		}
		
		System.out.println("������������ ��������� ������ ����� " + currentCost);
		

	}

}
