import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) throws FileNotFoundException {
		System.out.print("What recipe:");
		Scanner scanner = new Scanner(System.in);
		String recipe = scanner.next();
		 
		if (recipe.contains("corn")) {
		File corn = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/corn_on_the_cob_igr.txt");
		Scanner scan = new Scanner(corn);
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		}
		else if (recipe.contains("bucatini")) {
		File bucatini = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/bucatini_alla_griccia_with_fava_beans_igr.txt");
		Scanner scan2 = new Scanner(bucatini);
		while (scan2.hasNextLine()) {
			System.out.println(scan2.nextLine());
		}
		}
		else if (recipe.contains("chicken")) {
		File chicken = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/emergency_chicken_igr.txt");
		Scanner scan2 = new Scanner(chicken);
		while (scan2.hasNextLine()) {
			System.out.println(scan2.nextLine());
		}
		}
		else if (recipe.contains("greens")) {
		File greens = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/instant_pot_collard_greens_igr.txt");
		Scanner scan2 = new Scanner(greens);
		while (scan2.hasNextLine()) {
			System.out.println(scan2.nextLine());
		}
		}
		else if (recipe.contains("potatoes")) {
		File potatoes = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/oven_baked_parsley_red_potatoes_igr.txt");
		Scanner scan2 = new Scanner(potatoes);
		while (scan2.hasNextLine()) {
			System.out.println(scan2.nextLine());
		}
		}
		else if (recipe.contains("eggs")) {
		File eggs = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/pressure_cooker_hard_boiled_eggs_igr.txt");
		Scanner scan2 = new Scanner(eggs);
		while (scan2.hasNextLine()) {
			System.out.println(scan2.nextLine());
		}
		}
		else if (recipe.contains("beans")) {
		File beans = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/roasted_green_beans_igr.txt");
		Scanner scan2 = new Scanner(beans);
		while (scan2.hasNextLine()) {
			System.out.println(scan2.nextLine());
		}
		}
		else if (recipe.contains("radishes")) {
		File radishes = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/sauteed_radishes_igr.txt");
		Scanner scan2 = new Scanner(radishes);
		while (scan2.hasNextLine()) {
			System.out.println(scan2.nextLine());
		}
		}
		else if (recipe.contains("spaghetti")) {
		File spaghetti = new File("/Users/Admin/git/CSC-131-Project-Cuisine-Club/CSC 131 Project/src/Meal_Ingredients/spaghetti_carbonara_igr.txt");
		Scanner scan2 = new Scanner(spaghetti);
		while (scan2.hasNextLine()) {
			System.out.println(scan2.nextLine());
		}
		}
		else {
			System.out.println("Try again!");
		}	  
    }
}