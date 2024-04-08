package csci2020;

public class BubbleSort {
	public void sort(int arr[]) {
		int i, j, temp; 
		boolean swapped; 
		for (i = 0; i < arr.length - 1; i++) { 
			swapped = false; 
			for (j = 0; j < arr.length - i - 1; j++) { 
				if (arr[j] > arr[j + 1]) { 
					// swap arr[j] and arr[j+1] 
					temp = arr[j]; 
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp; 
					swapped = true; 
				} 
			} 
			// IF no two elements were 
			// swapped by inner loop, then break 
			if (swapped == false) 
				break; 
		} 
	} 
}
