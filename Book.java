package lab2;

public class Book extends WrittenItem{

	Book(int idNum,int noOfCopies,String title)
	{
		super(idNum,noOfCopies,title);
	}
	
	Book()
	{
		
	}
	
	public static void main(String[] args)
	{
		
	}
	
	public String getAuthor()
	{
		return super.getAuthor();
	}
	
	public void setAuthor(String author)
	{
		super.setAuthor(author);
	}
	
	public String toString()
	{
		return "Book [getAuthor()= "+getAuthor()+", toString()= "+super.toString()+", getIdNum()= "+getIdNum()+", getNoOfCopies()= "+getNoOfCopies()+", getTitle()= "+getTitle()+", getClass= "+getClass()+", hashCode()= "+hashCode()+" ]";
	}
	
}
