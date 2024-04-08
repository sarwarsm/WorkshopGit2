package csci2020;

public class Driver {

	public static void main(String[] args) {
		int data[] = {100, 7, 19, 1, 2, 113, 87, 99, 23, 50};
		SelectionSort selection = new SelectionSort();
		InsertionSort insertion = new InsertionSort();
		BubbleSort bubble = new BubbleSort();
		
		System.out.println("Original Data: ");
		display(data);
		bubble.sort(data);
		System.out.println("Sorted Data with Bubble Sort: ");
		display(data);		
	}
	
	public static void display(int data[]) {
		for(int val: data) {
			System.out.printf("%d,", val);
		}
		System.out.println();
	}

}
