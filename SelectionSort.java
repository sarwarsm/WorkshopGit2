package csci2020;

public class SelectionSort {
	public void sort(int data[]) {
		for(int i = 0; i < data.length; i++) {
			int smallestNdx = i;
			for(int j = i; j < data.length; j++) {
				if(data[smallestNdx] > data[j]) {
					smallestNdx = j;
				}
			}
			
			int temp = data[i];
			data[i] = data[smallestNdx];
			data[smallestNdx] = temp;
		}
	}
}
