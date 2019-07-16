package lab2;

public class CD extends MediaItem 
{
	private String artist;
    private String genre;
	public String getArtist() 
	{
		return artist;
	}
	public void setArtist(String artist) 
	{
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
		
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public CD()
	{
		System.out.println("This is a CD");
		setArtist("Ed Sheeran");
		setUid(28894);
		setTitle("Shape of You");
		setCopy(6788);
		setGenre("Pop");
		display();
	}
	public void display() 
	{
		System.out.println("The Name of the CD is "+getTitle());
		System.out.println("The Name of the Artist is "+getArtist());
		System.out.println("The ID of the CD is "+getUid());
		System.out.println("No.of CDs available are "+getCopy());
		System.out.println("The Genre is "+getGenre());
		System.out.println("------------------------------------");
		
	}
}
