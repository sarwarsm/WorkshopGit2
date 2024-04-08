package csci2020;

public class InsertionSort {
	public void sort(int data[]) {
		for(int j = 2; j <= data.length; j++) {
			int key = data[j-1];
			int i = j - 1;
			while(i > 0 && data[i-1] > key) {
				data[i+1-1] = data[i-1];
				i = i - 1;
			}
			
			data[i+1-1] = key;
		}
	}
}
