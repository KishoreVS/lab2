package lab2;
public class JournalPaper extends WrittenItem{
	JournalPaper(int idNum,int noOfCopies,String title)
	{
		super(idNum,noOfCopies,title);
	}
	
	public JournalPaper()
	{
		
	}
	
	private String yearPublished;

	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
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
		return "JournalPaper [yearPublished= "+yearPublished+", getYearPublished()= "+getYearPublished()+", getAuthor()= "+getAuthor()+", toString()= "+super.toString()+", getIdNum()= "+getIdNum()+", getNoOfCopies()= "+getNoOfCopies()+", getTitle()= "+getTitle()+", getClass= "+getClass()+", hashCode()= "+hashCode()+" ]";
	}

}