import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Open_Recipe {

	public static void main(String[] args) throws IOException {
		System.out.println("What meal would you like to cook?");
		Scanner sc = new Scanner(System.in);
		String Desired_Meal= sc.nextLine();
		System.out.println("Yummy... Here is the Recipe!");		
		
		if (Desired_Meal.equalsIgnoreCase("Corn on the Cob")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Corn_on_the_Cob.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
		
		else if (Desired_Meal.equalsIgnoreCase("Bucantini Alla Griccia With Gava Beans")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Bucatini_Alla_Griccia_With_Fava_Beans.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
		
		else if (Desired_Meal.equalsIgnoreCase("Emergency Chicken")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Emergency_Chicken.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
		
		
		else if (Desired_Meal.equalsIgnoreCase("Instant Pot Collard Greens")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Instant_Pot_Collard_Greens.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
			
		else if (Desired_Meal.equalsIgnoreCase("Oven baked Parsley Red ")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Oven_Baked_Parsley_Red_Potatoes.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
		
		else if (Desired_Meal.equalsIgnoreCase("Pressure Cooker Hard Boiled Eggs")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Pressure_Cooker_Hard_Boiled_Eggs.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
	
		else if (Desired_Meal.equalsIgnoreCase("Roasted Green Beans")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Roasted_Green_Beans.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
	
		else if (Desired_Meal.equalsIgnoreCase("Sauteed Radishes")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Sauteed_Radishes.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
		
		else if (Desired_Meal.equalsIgnoreCase("Spaghetti Carbonara")) {
			String path="C:\\Users\\audda\\git\\CSC-131-Project-Cuisine-Club\\CSC 131 Project\\src\\Meal_Recipes\\Spaghetti_Carbonara.txt";
			File file= new File(path);
			Desktop.getDesktop().open(file);}
		else {
			System.out.println("Recipe does not exist");
		}
		
		
		
		
		
		
		
	}

}
