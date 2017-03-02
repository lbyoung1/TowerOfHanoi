import java.util.ArrayList;

public class Tower extends ArrayList<Disk>
{
	char name;
	int numDisks;
	
	Tower(char tName, int numberDisks)
	{
		super(numberDisks);		//initial capacity of arraylist
		this.name = tName;
		this.numDisks = numberDisks;


		
	}
	
	public void init()
	{

		for (int i = numDisks; i >= 1; i--)
		{
			Disk disk = new Disk(i);
			add(disk);
			//System.out.println("Adding " + i);
		}
	}
	

	public void move(Tower t)
	{
		Disk moved = remove(size()-1);
		t.add(moved);
	}
	
	
	@Override
	public String toString()		//I know there was probably a much simpler way to do this, but I couldn't figure it out
	{

		String answer=  "Tower " + name + ":["; 
				for(int i = 0; i < size(); i++)
					{
						if (i == size() - 1)
						{
							answer+= get(i).toString();
						}
						else
						answer+= get(i).toString() + ", ";
					}
					return answer + "]";

	}

}
