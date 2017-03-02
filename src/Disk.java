
public class Disk 
{
	int diskSize;
	
	Disk(int size)
	{
		this.diskSize = size;
	}
	
	@Override

	public String toString()
	{
		String size = Integer.toString(diskSize);
		return size;
	}

}
