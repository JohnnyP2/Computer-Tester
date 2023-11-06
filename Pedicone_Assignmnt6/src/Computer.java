// Johnny Pedicone
public class Computer 
{
	String brand;
	String model;
	String processor;
	int ram;
	int hdd;
	boolean ssd;
	String gpu;
	int score;
	
	
	Computer()//Constructor, I put all the variables to "default" and 0 because they will just be redefined later.
	{
		brand = "default";
		model = "default";
		processor = "default";
		ram = 0;
		hdd = 0;
		ssd = false;
		gpu = "default";
		score = 0; 
	}
	private int calculateScore() // Calculates the score of the computer
	{
		int newScore = 0 + (ram*10);
		boolean haveSSD = ssd;
		if(haveSSD) 
		{
			newScore += 50;
		}
		return newScore;
	}
	public int setScore(int ram, boolean ssd) //allows the use of calculateScore outside of the class
	{
		score = calculateScore();
		return score;
	}
	
	public boolean isFaster(Computer computer) // checks if one computer is faster than the other based on the score
	{
		if(this.score > computer.score)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
