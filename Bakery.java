package factory;

public class Bakery extends Cake{
	
	public Cake orderCake(String cake)
	{
		return createCake(cake);
	}
	private Cake createCake(String cake)
	{
		if(cake == "Carrot Cake")
		{
			return new CarrotCake();
		}
		else if(cake == "Black Forest Cake")
		{
			return new BlackForestCake();
		}
		else if (cake == "Birthday Cake")
		{
			return new BirthdayCake();
		}
		else
			return null;
	}
}
