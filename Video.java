package lab2;

public class Video extends MediaItem{
	Video(int idNum,int noOfCopies,String title)
	{
		super(idNum,noOfCopies,title);
	}
	
	public String toString()
	{
		return "Video [director= "+director+", genre()= "+genre+", yearReleased()= "+yearReleased+", getDirector()= "+getDirector()+", getGenre()= "+getGenre()+", getYearReleased()= "+getYearReleased()+", toString()= "+super.toString()+", getRunTime= "+getRunTime()+", getIdNum()= "+getIdNum()+", getNoOfCopies()= "+getNoOfCopies()+", getTitle()= "+getTitle()+", getClass= "+getClass()+", hashCode()= "+hashCode()+" ]";
	}
	
	private String director,genre,yearReleased;

	public String getDirector() {
		return director;
	}

	public void setDirector(String getDirector) {
		this.director = getDirector;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(String yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	

}