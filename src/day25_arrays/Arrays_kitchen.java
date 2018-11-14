package day25_arrays;

public class Arrays_kitchen {

	public static void main(String[] args) {
		//create 
		 String[] kitchenItems = {"Knife", "wooden spoons","Plates", "cups", 
				                 "forks", "pan", "pot", "trash can", 
				                                   "fridge", "dishwasher"};
		 /*Using a for each loop iterate through each item:
		  * within your for each loop
		  */
		 //item= item.toLowerCase();
		 for (String item: kitchenItems) {
			switch (item.toLowerCase()) {
			case "knife" :
				System.out.println("Knife is used to cut the veggies");
				break;
			case "wooden spoons":
				System.out.println("Wooden spoons are used for mixing salads");
				break;
			case "plates":
				System.out.println("Plates are used to serve food");
				break;
			case "cups":
				System.out.println("Cups are used to serve drinks");
				break;
			case "forks":
				System.out.println("Forks are used to eat salads, dishes");
				break;
			case "pan":
				System.out.println("Pots are used to cook soups and dishes");
				break;
			case "pot":
				System.out.println("Pans are used to fry food");
				break;
			case "trash can":
				System.out.println("Trash cans used for storing garbage");
				break;
			case "fridge":
				System.out.println("Fridge used to store food");
				break;
			case "dishwasher":
				System.out.println("Dishwasher used to wash dishes");
				break;
			
			}
			
			
			
			
		}
		 }

	}


