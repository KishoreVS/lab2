package lab2;

public class WrittenItem extends Item{
	WrittenItem(int idNum,int noOfCopies,String title)
	{
		super(idNum,noOfCopies,title);
	}
	
	public WrittenItem()
	{
		
	}
	
	private String author;
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public String toString()
	{
		return "WrittenItem [author= "+author+", getAuthor= "+getAuthor()+", toString()= "+super.toString()+", getIdNum()= "+getIdNum()+", getNoOfCopies()= "+getNoOfCopies()+", getTitle()= "+getTitle()+", getClass()= "+getClass()+", hashCode()= "+hashCode()+" ]";
	}

}
