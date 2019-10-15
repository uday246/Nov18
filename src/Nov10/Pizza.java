package Nov10;

public class Pizza
{
	private String pizzaSize;
	private int cheeseCount;
	private int pepperoniCount;
	private int hamCount;

	public Pizza()
	{
		this.pizzaSize = "";
		this.cheeseCount = 0;
		this.pepperoniCount = 0;
		this.hamCount = 0;
	}
	
	public Pizza(String pizzaSize, int cheeseCount, 
					int pepperoniCount, int hamCount)
	{
		this.pizzaSize = pizzaSize;
		this.cheeseCount = cheeseCount;
		this.pepperoniCount = pepperoniCount;
		this.hamCount = hamCount;
	}
	
	public String getPizzaSize()
	{
		return pizzaSize;
	}

	public void setPizzaSize(String pizzaSize)
	{
		this.pizzaSize = pizzaSize;
	}

	public int getNumCheeseToppings()
	{
		return cheeseCount;
	}

	public void setNumCheeseToppings(int cheeseCount)
	{
		this.cheeseCount = cheeseCount;
	}

	public int getNumPepperoniToppings()
	{
		return pepperoniCount;
	}

	public void setNumPepperoniToppings(int pepperoniCount)
	{
		this.pepperoniCount = pepperoniCount;
	}

	public int getNumHmaToppings()
	{
		return hamCount;
	}

	public void setNumHmaToppings(int hamCount)
	{
		this.hamCount = hamCount;
	}

	public double calcCost()
	{		
		if(pizzaSize.equalsIgnoreCase("small"))
		{
			return 10;
		}
		else if(pizzaSize.equalsIgnoreCase("medium"))
		{
			return 20;
		}
		else if(pizzaSize.equalsIgnoreCase("large"))
		{
			return 30;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaSize=" + pizzaSize + ", cheeseCount=" + cheeseCount + ", pepperoniCount=" + pepperoniCount
				+ ", hamCount=" + hamCount + "]";
	}

	
}
