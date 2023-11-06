// Johnny Pedicone
public class ComputerTester {

	public static void main(String[] args) 
	{
		Computer myComputer1 = new Computer();//The first computer 
		
		myComputer1.brand = "Dell";
		myComputer1.model = "xps 13";
		myComputer1.processor = "Intel i5-4460k";
		myComputer1.ram = 4;
		myComputer1.hdd = 512;
		myComputer1.ssd = false;
		myComputer1.gpu = "GeForce GTX 660";
		myComputer1.score = myComputer1.setScore(myComputer1.ram, myComputer1.ssd);
		
		Computer myComputer2 = new Computer();// The second computer
		
		myComputer2.brand = "Lenovo";
		myComputer2.model = "k450e";
		myComputer2.processor = "Intel i9-9900k";
		myComputer2.ram = 16;
		myComputer2.hdd = 1024;
		myComputer2.ssd = true;
		myComputer2.gpu = "GeForceGTX 1060";
		myComputer2.score = myComputer2.setScore(myComputer2.ram, myComputer2.ssd);
		
		System.out.println("myComputer1 score: "+myComputer1.score);
		System.out.println("myComputer2 score: "+myComputer2.score);

		if(myComputer1.isFaster(myComputer2)) // This if statement compares the 2 scores of the computer to determine which is faster; 
		{
			System.out.println("myComputer1 is faster than myComputer2!");
		}else if (myComputer2.isFaster(myComputer1)) 
		{
			System.out.println("myComputer2 is faster than myComputer1!");
		}else
		{
			System.out.println("The computers are the same speed!");
		}
		
	}

}
