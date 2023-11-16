package pack1;

public class SingleDimentionArray {

	int arr[] = null;
	int size = 0;

	public SingleDimentionArray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		this.size = size;
	}

	public int length() {
		return size;
	}

	public int getIndexValue(int index) {
		try {
			return arr[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception");
		}
		return -1;
	}

	public void insertValue(int location, int value) {
		try {
			arr[location] = value;
			System.out.println("Value inserted successfully");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception");
		}
	}
	
	public int searchElement(int value){
		int index = -1;
		for(int i=0;i< arr.length;i++){
			if(value== arr[i])
				index = i;
		}
		return index;
	}
	
	public void traverseArray(){
		for(int i=0;i< arr.length;i++){
			System.out.println(arr[i]);		
		}
	}
}
