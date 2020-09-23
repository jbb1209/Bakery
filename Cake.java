package factory;
import java.util.*;
public abstract class Cake {
	String name;
	double price;
	int numLayers;
	ArrayList decorations;
	Shape shape;
	String flavor;
	String icing;
	Cake(){}
	private void createCake()
	{
		createLayers();
		frostCake();
		addDecorations();
	}
	protected void createLayers()
	{
		System.out.print("Creating "+numLayers+name);
	}
	protected void frostCake()
	{
		System.out.print( "\nFrost cake with"+ icing+" icing.");
	}
	protected void addDecorations()
	{
		int x = 0;
		while(decorations != null)
		{
		System.out.println("\nAdding "+decorations.remove(x));
		x++;
		}
		System.out.println("Price: $"+price);
		
	}
	public double getPrice()
	{
		return price;
	}

}
