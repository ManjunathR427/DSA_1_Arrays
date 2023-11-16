package pack1;

// User defined array creation
public class Main {

	public static void main(String[] args) {
		SingleDimentionArray sda = new SingleDimentionArray(10);
		System.out.println(sda.length());//10
		System.out.println(sda.getIndexValue(0));//0
		System.out.println(sda.getIndexValue(10));//0
		sda.insertValue(0, 5);
		sda.insertValue(10, 5);
		System.out.println("Index value : " + sda.searchElement(5));
		sda.traverseArray();
		System.out.println("-------------------------");
	}
}
