package lab2;
public class Test {
	public static void main(String[] args) {
		Book b=new Book();
		b.setAuthor("Kishore Kumaar VS");
		b.setIdNum(111);
		b.setNoOfCopies(123);
		b.setTitle("Java");
		System.out.println("Author "+b.getAuthor());
	}

}