package Nov13;

import java.util.ArrayList;
import java.util.Scanner;
class Recipe {
private String recipeName;
private int servings; //Number of servings
private ArrayList<Ingredient> recipeIngredients; //an array list for all ingredients in the recipe
private double totalRecipeCalories; //this is the total calories of the recipe
private double totalRecipeCost;  
public Recipe() {
this.recipeName = "";
this.servings = 0;
this.recipeIngredients = new ArrayList<>(); //Array list starts empty
this.totalRecipeCalories = 0;
this.totalRecipeCost = 0.00;   
}
public Recipe(String recipeName, int servings,
ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories, double totalRecipeCost)
{
this.recipeName = recipeName;
this.servings = servings;
this.recipeIngredients = recipeIngredients;
this.totalRecipeCalories = totalRecipeCalories;
this.totalRecipeCost = totalRecipeCost;
}
public String getRecipeName() {
return recipeName;
}
public void setRecipeName(String recipeName) {
this.recipeName = recipeName;
}
public double getTotalRecipeCalories() {
return totalRecipeCalories;
}
public void setTotalRecipeCalories(double totalRecipeCalories) {
this.totalRecipeCalories = totalRecipeCalories;
}  
public double getTotalRecipeCost() {
return totalRecipeCost;
}
public void setTotalRecipeCost(double totalRecipeCost) {
this.totalRecipeCost = totalRecipeCost;
}
public ArrayList getRecipeIngredients() {
return recipeIngredients;
}
public void setRecipeIngredients(ArrayList recipeIngredients) {
this.recipeIngredients = recipeIngredients;
}
public int getServings() {
return servings;
}
public void setServings(int servings) {
this.servings = servings;
}
public void printRecipe() {
double singleServingCalories = totalRecipeCalories / servings;
System.out.println("Recipe: " + recipeName);
System.out.println("Serves: " + servings);
System.out.println("Ingredients:");
/*recipeIngredients.forEach((ingredient) -> {
System.out.println(ingredient);
});*/   
for (int i = 0; i < recipeIngredients.size(); i++) {
Ingredient currentIngredient = recipeIngredients.get(i);
String currentnameOfIngredient = currentIngredient.getnameOfIngredient();
System.out.println(currentnameOfIngredient);
float ingredientAmount = currentIngredient.getingredientAmount();
System.out.println(ingredientAmount);
String unitMeasurement = currentIngredient.getunitMeasurement();
System.out.println(unitMeasurement);
double ingredientCalories = currentIngredient.getingredientCalories();
System.out.println(ingredientCalories);
double ingredientCost = currentIngredient.getingredientCost();
System.out.println(ingredientCost);
}
System.out.println(recipeName + " has " + servings + " Servings and each serving has " + singleServingCalories + " Calories.");
System.out.println(recipeName + " has a total of " + totalRecipeCalories + " calories.");
System.out.println(recipeName + " will cost $" + totalRecipeCost);
}  
public Recipe createNewRecipe() {
double totalRecipeCalories = 0;
double totalRecipeCost = 0.00;
recipeIngredients = new ArrayList<>();
boolean addMoreIngredients = true;
Scanner scnr = new Scanner(System.in);
int MAX_UNIT = 100; // The max units an ingredient can be
int MAX_CAL = 2000; // the max calories an ingredient can be per unit  
System.out.println("Please enter the recipe name: ");
String recipeName = scnr.nextLine();
System.out.println("Please enter the number of servings: ");
int servings = scnr.nextInt();  
scnr.nextLine();
//this loop starts the ingredient array list and finishes when users types 'end'
do {
System.out.println("Please enter the ingredient name or type 'end' if you are done: ");
String nameOfIngredient = scnr.next();
if (nameOfIngredient.toLowerCase().equals("end")) {
addMoreIngredients = false;
}
else {  
System.out.println("Please enter the amount of " + nameOfIngredient + " recipe will need: ");
float ingredientAmount = scnr.nextFloat();
if ((ingredientAmount >= 1) && (ingredientAmount <= MAX_UNIT)) {
System.out.println(HelperClass.amtGoodPrint(ingredientAmount)); //using a helper class for shorter and cleaner code
}
else {
System.out.println(HelperClass.amtBadPrint(ingredientAmount));
System.out.println("Please enter another amount of " + nameOfIngredient + " between 1 and 100: ");
ingredientAmount = scnr.nextFloat();
if ((ingredientAmount >= 1) && (ingredientAmount <= MAX_UNIT)) {
System.out.println(HelperClass.amtGoodPrint(ingredientAmount)); //using a helper class for shorter and cleaner code
}
else {
System.out.println(HelperClass.amtBadPrint(ingredientAmount));
System.out.println(HelperClass.outBadPrint(null));
}
}   
System.out.println("Please enter the unit of measurement: ");
String unitMeasurement = scnr.next();
System.out.println("Please enter the number of calories per measurement: ");
int ingredientCalories = scnr.nextInt();   
if ((ingredientCalories >= 1) && (ingredientCalories <= MAX_CAL)) {
System.out.println(HelperClass.calGoodPrint(ingredientCalories));
}
else {
System.out.println(HelperClass.calBadPrint(ingredientCalories));
System.out.println("Please enter another number of calories between 1 and 2000: ");
ingredientCalories = scnr.nextInt();
if ((ingredientCalories >= 1) && (ingredientCalories <= MAX_CAL)) {
System.out.println(HelperClass.calGoodPrint(ingredientCalories));
}
else {
System.out.println(HelperClass.calBadPrint(ingredientCalories));
System.out.println(HelperClass.outBadPrint(null));
} //User must start over if 2 attempts were made unsuccessful or field will be zero
}   
System.out.println("Please enter the cost of the ingredient: ");
double ingredientCost = scnr.nextDouble();

if ((ingredientCost >= 0.10) && (ingredientCost <= MAX_UNIT)) {
System.out.println(HelperClass.costGoodPrint(ingredientCost));
}
else {
System.out.println(HelperClass.costBadPrint(ingredientCost));
System.out.println("Please enter another amount between 1 and 100: ");
ingredientCost = scnr.nextDouble();
if ((ingredientCost >= 0.10) && (ingredientCost <= MAX_UNIT)) {
System.out.println(HelperClass.costGoodPrint(ingredientCost));
}
else {
System.out.println(HelperClass.costBadPrint(ingredientCost));
System.out.println(HelperClass.outBadPrint(null));
//User must start over if 2 attempts were made unsuccessful
}
}   
Ingredient tempIngredient = new Ingredient(nameOfIngredient, ingredientAmount, unitMeasurement, ingredientCalories, ingredientCost);
recipeIngredients.add(tempIngredient);
}
} while (addMoreIngredients);
for (int i = 0; i < recipeIngredients.size(); i++) {
Ingredient currentIngredient = recipeIngredients.get(i);
float ingredientAmount = currentIngredient.getingredientAmount();
String unitMeasurement = currentIngredient.getunitMeasurement();
double ingredientCost = currentIngredient.getingredientCost();
double ingredientCalories = currentIngredient.getingredientCalories();
double ingredientTotalCalories = ingredientAmount * ingredientCalories;
totalRecipeCalories += ingredientTotalCalories;
totalRecipeCost += ingredientCost;   
}
Recipe recipe1 = new Recipe(recipeName,
servings, recipeIngredients, totalRecipeCalories, totalRecipeCost);
//recipe1.printRecipe();
return recipe1;
}
}
public class RecipeBox {

	private ArrayList listOfRecipes;

	public ArrayList getListOfRecipes() {
		return listOfRecipes;
	}

	public void setListOfRecipes(ArrayList listOfRecipes) {
		this.listOfRecipes = listOfRecipes;
	}

	public RecipeBox(ArrayList listOfRecipes) {
		this.listOfRecipes = listOfRecipes;
	}

	public RecipeBox() {
		this.listOfRecipes = new ArrayList<>();
	}

	void printAllRecipeDetails(String selectedRecipe) {
		for (Recipe recipe1 : listOfRecipes) {
			if (recipe1.getRecipeName().equalsIgnoreCase(selectedRecipe)) {
				recipe1.printRecipe();
				return;
			}
		}
		System.out.println("No Recipe found with name: " + selectedRecipe);
	}

	void printAllRecipeNames() {
		for (Recipe selectedRecipe : listOfRecipes) {
			System.out.println(selectedRecipe.getRecipeName());
		}
	}

	public void addRecipe(Recipe tmpRecipe) {
		listOfRecipes.add(tmpRecipe);
	}

	/**
	 * A variation of following menu method should be used as the actual main
	 * once you are ready to submit your final application. For this submission
	 * and for using it to do stand-alone tests, replace the public void menu()
	 * with the standard public static main(String[] args) method
	 *
	 * @param args
	 */

	public static void main(String[] args) {
		RecipeBox myRecipeBox = new RecipeBox(); // Uncomment for main method
		Scanner menuScnr = new Scanner(System.in);
		int recipeNum = 0;
		ArrayList tmpRecipe = new ArrayList<>();

		while (true) {
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n"
					+ "3. Print All Recipe Names\n" + "4. Delete a Recipe\n" + "\nPlease select a menu item:");
			int input = menuScnr.nextInt();
			menuScnr.nextLine();

			if (input == 1) {
				Recipe newRecipe = new Recipe();
				myRecipeBox.addRecipe(newRecipe.createNewRecipe());
			} else if (input == 2) {
				System.out.println("Which recipe?\n");
				String selectedRecipeName = menuScnr.next();
				myRecipeBox.printAllRecipeDetails(selectedRecipeName);
			} else if (input == 3)
				for (int j = 0; j < myRecipeBox.getListOfRecipes().size(); j++) {
					System.out.println((j + 1) + ": " + myRecipeBox.getListOfRecipes().get(j).getRecipeName());
				}
			else if (input == 4) {
				System.out.println("Which Recipe?\n");
				String rec = menuScnr.next();
				Recipe temp=null;
				for (Recipe recipe1 : listOfRecipes) {
					if (recipe1.getRecipeName().equalsIgnoreCase(rec)){
						temp=recipe1;
						break;
					}
				}
				if(temp!=null)
				listOfRecipes.remove(temp);
				else
					System.out.println("Given receipe does not exist in list");
				// FIXME

			} else {
				System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Print All Recipe Names\n"
						+ "4. Delete a Recipe\n" + "\nPlease select a menu item:");
			}
		}
	}
}
