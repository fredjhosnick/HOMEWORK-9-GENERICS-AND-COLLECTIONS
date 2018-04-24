package HomeworkList9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listTen = new ArrayList<>();

		listTen.add(1);
		listTen.add(2);
		listTen.add(3);
		listTen.add(4);
		listTen.add(5);
		listTen.add(6);
		listTen.add(7);
		listTen.add(8);
		listTen.add(9);
		listTen.add(10);
		System.out.println(listTen);
		System.out.println("The removes numbers");

		listTen.remove(0);

		listTen.remove(0);

		listTen.remove(7);
		System.out.println(listTen);

	}

}
