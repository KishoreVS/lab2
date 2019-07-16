package lab2;

public class CD extends MediaItem{
	CD(int idNum,int noOfCopies,String title)
	{
		super(idNum,noOfCopies,title);
	}
	
	private String artist,genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getRunTime()
	{
		return super.getRunTime();
	}
	
	public void setRunTime(int runTime)
	{
		super.setRunTime(runTime);
	}
	
	public String toString()
	{
		return "CD [artist= "+artist+", genre= "+genre+", getGenre()= "+getGenre()+", getArtist()= "+getArtist()+", getRunTime()= "+getRunTime()+", getIdNum()= "+getIdNum()+", getNoOfCopies()= "+getNoOfCopies()+", toString()= "+super.toString()+", getClass()= "+getClass()+", hashCode()= "+hashCode()+"]";
	}
	
	public int getIdNum()
	{
		return super.getIdNum();
	}
	
	public void setIdNum(int idNum)
	{
		super.setIdNum(idNum);
	}
	
	public int getNoOfCopies()
	{
		return super.getNoOfCopies();
	}
	
	public void setNoOfCopies(int noOfCopies)
	{
		super.setNoOfCopies(noOfCopies);
	}
	
	public String getTitle()
	{
		return super.getTitle();
	}
	
	public void setTitle(String Title)
	{
		super.setTitle(Title);
	}
	
	void addItem(int idNum,int noOfCopies,String title)
	{
		super.addItem(idNum, noOfCopies, title);
	}

}