package assignment;

public class Mains {
	public static void main(String[] args) {

		MyArrayList list = new MyArrayList(3);
		
		list.addElement("Neeraj");
		list.addElement("Sachin");
		System.out.println(list.size());
		list.addElement("Dharni");
		System.out.println(list.size());
		list.addElement("Dharni");
		System.out.println(list.size());
		list.addElement("Dharni");
		System.out.println(list.size());
		list.addElement("Dharni");
		System.out.println(list.size());
		list.addElement("Dharni");
		System.out.println(list.size());
		list.addElement("Dharni");
		System.out.println(list.size());

		System.out.println(list.getElement(1));
		list.getAllElements();

	}

}


