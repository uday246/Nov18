package Prmr;

public class FoodTester
{
   public static void main(String[] args)
   {
       Food berries = new Food("Strawberries", 4.95, 10);
       Food cheese = new Food("String Cheese", 5.50, 1);
       Food spinach = new Food("Spinach",3.95, 0.2);
       Food cucumber = new Food("Cucumber", 1.50, 0.9);
       Food rice = new Food("Rice", 4.95, 45.0);
              
       System.out.println(rice.getCarbs());
       System.out.println("Expected: 45");
       System.out.println(spinach.getCarbs());
       System.out.println("Expected: 0.2");
       
       System.out.println(cheese.isZeroCarb());
       System.out.println("Expected: false");
       System.out.println(berries.isZeroCarb());
       System.out.println("Expected: false");
       System.out.println(spinach.isZeroCarb());
       System.out.println("Expected: true");
       System.out.println(cucumber.isZeroCarb());
       System.out.println("Expected: true");
       
       System.out.println(spinach.getDescription());
       System.out.println("Expected: Spinach carbs=0.2");
       System.out.println(cheese.getDescription());
       System.out.println("Expected: String Cheese carbs=1.0");
   }
}
class Product
{
    private double price;
    private String description;
    
    /**
     * Constructs a Product with a price and description
     * @param thePrice the price of this product
     * @param theDescription the description of this
     * product
     */
    public Product(String theDescription, double thePrice )
    {
         price = thePrice;
         description = theDescription;
    }
    
    /**
     * Gets the price of this Product
     * @return the price of this object
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Gets the description of this Product
     * @return the description of this Product
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Reduce the price by the given percent
     * @param percent the pecentage to reduce the price by
     */
    public void reducePrice(double percent)
    {
        
        price = price - price * percent/100;
    }
    
    /**
     * Increase the price of the Product by the 
     * given percent
     * @param percent the percentage to increase the 
     * price by
     */
    public void increasePrice(double percent)
    {
        price = price * (1.0 + percent/100);
    }    
}
class Food extends Product{
	private double carbs;
	
	public Food(String aTheDescription, double aThePrice,double c) {
		super(aTheDescription, aThePrice);
		carbs=c;
		// TODO Auto-generated constructor stub
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double aCarbs) {
		carbs = aCarbs;
	}
	public boolean isZeroCarb(){
		return getCarbs()<1;
	}
	public String getDescription()
    {
        return super.getDescription()+" carbs = "+ carbs;
    }
    
}
