//upcasting example//

class Amitab
{
	int height=7;
	void awards()
	{
		System.out.println("5 Awards");
	}
	void hitMovie()
	{
		System.out.println("Don");
	}
	void tvShow()
	{
		System.out.println("KBC");
	}
	void tvAdvertisement()
	{
		System.out.println("Dabur Honey");
	}
}

class Abhishek extends Amitab
{
	int height =6;
	void sportsTeam()
	{
		System.out.println("Pro Kabadi - jaipur ");
	}
	void hitMovie()
	{
		//System.out.println("Dhoom");
		System.out.println("Dhoom");
		super.hitMovie();
	}
}

class vilon
{
	public static void main(String...sd)
	{
		Abhishek abhi =new Abhishek();
		
		abhi.tvShow();
		abhi.tvAdvertisement();
		abhi.hitMovie();
		abhi.sportsTeam();
		abhi.awards();
		
		System.out.println("--------------------------1");
		
		Amitab amit = abhi; //new Abhishek();  // upcasting 
		System.out.println(amit.height);											  
		amit.tvShow();
		amit.tvAdvertisement();
		amit.hitMovie();
		//amit.sportsTeam();// throws error
		amit.awards();
		
		System.out.println("--------------------------2");    // downcasting
		
		((Abhishek)amit).sportsTeam();
		((Abhishek)amit).awards();
		((Abhishek)amit).tvShow();
		((Abhishek)amit).tvAdvertisement();
		((Abhishek)amit).hitMovie();
		
		System.out.println("--------------------------3");
		
		Abhishek abhi1=(Abhishek)amit;
		abhi1.tvShow();
		abhi1.tvAdvertisement();
		abhi1.hitMovie();
		abhi1.sportsTeam();
		abhi1.awards();
		
		
		
		
	}
}