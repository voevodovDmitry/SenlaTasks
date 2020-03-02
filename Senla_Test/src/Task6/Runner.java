package Task6;

import java.util.Arrays;
import java.util.Comparator;

/*
 В условии задачи сказано, что необходимо заполнить рюкзак. Это будет гарантированно выполняться  при условии возможности разделить предмет в произвольной
 пропорции.
 Таким образом задача будет решаться применением жадного алгоритма
 
 Решение задачи будет состоять из следующих шагов:
 1) вычисление удельной стоимости предмета на единицу веса
 2) сортировка предметов по удельной стоимости по убыванию
 3) добавление в мешок n целых предметов с самой высокой удельной стоимостью
 4) добавление в мешок вычисленной части n+1 предмета  
 */
public class Runner {

	public static void main(String[] args) {
		
		final int MAX_WEIGTH = 40; // вместимость рюкзака
		
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
		
		final Item[] items = {Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10,}; // набор всех имеющихся предметов
		
		Arrays.sort(items, Comparator.comparingDouble(Item::getUnitCost).reversed()); // сортировка массива по удельной стоимости по убыванию
		
		for (Item i : items) {
			System.out.println(i.showItem());
		}
		
		int currentWeight = 0; //переменная для хранения текущего веса набора предметов
		double currentCost = 0; //переменная для хранения текущей стоимости набора предметов
		int curretItem = 0; //переменная для хранения индекса текущего предмета
		
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
		
		System.out.println("Максимальная стоимость набора равна " + currentCost);
		

	}

}
