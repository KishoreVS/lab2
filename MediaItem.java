package lab2;
public class MediaItem extends Item{
	MediaItem(int idNum,int noOfCopies,String title)
	{
		super(idNum,noOfCopies,title);
	}
	
	public String toString()
	{
		return "MediaItem [runTime= "+runTime+", getRunTime()= "+getRunTime()+", toString()= "+super.toString()+", getIdNum()= "+getIdNum()+", getNoOfCopies()= "+getNoOfCopies()+", getTitle()= "+getTitle()+", getClass()= "+getClass()+", hashCode()= "+hashCode()+" ]";
	}
	
	private int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
}
