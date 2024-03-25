package pizzabilling;

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Pizza basepizza = new Pizza();
	   System.out.println("Choose Your Option by SNo.");
	   System.out.println("	1. Veg Pizza");
	   System.out.println("	2. Non-Veg Pizza");
	   System.out.println("	3.Exit");
	   System.out.print("choice : ");
	   System.out.println();
	   int choice = 0;
	   while(true) {
	   try {  
           choice = sc.nextInt();
       }   
       catch (Exception ex) {  
           System.out.println("Input MisMatchException");  
       }
	   
	   if(choice == 1) {
		  basepizza.vegPizza = true;
	   }
	   if(choice == 2) {
		   basepizza.vegPizza = false;
	   }
	   
	   while(true) {

		   switch(choice) {
		   case 1:
			
			   System.out.println("===List of Veg Pizza Toppings===");
			   System.out.println("	11. ExtraCheese");
			   System.out.println("	12. Babycorn");
			   System.out.println("	13. Red Paneer");
			   System.out.println("	14. Paneer");
			   System.out.println("	15. Tomato");
			   System.out.println("	16. Mushroom");
			   System.out.println("	17. Get Bill");
			   System.out.print("Choose Your Option by SNo.\nPlease Enter your Choice: ");
			   int extraToppings = sc.nextInt();
			   switch(extraToppings) {
			   case 11:
				   basepizza.addExtraCheese();
				   break;
			   
		       case 12:
		    	   	basepizza.addBabyCorn();
			   		break;
		       case 13:
		    	   	basepizza.addRedPanner();
		    	   	break;
		       case 14:
		    	   	basepizza.addPaneer();
		    	   		break;
		       case 15:
		    	   	basepizza.addTomato();
		    	   		break;
		       case 16:
		    	   	basepizza.addMushroom();
		    	   		break;
		       case 17:
		    	   	basepizza.getBill();
			   		System.exit(0);
			   default:
				   System.out.println("Invalid option.");
				   break;
		     }
			   break;
		   case 2:
			   System.out.println("===List of Non-Veg Pizza Toppings===");
			   System.out.println("	21. ExtraCheese");
			   System.out.println("	22. Pepperoni");
			   System.out.println("	23. Onions");
			   System.out.println("	24. Chicken Salami");
			   System.out.println("	25. Get Bill");
			   System.out.print("Choose Your Option by SNo.\nPlease Enter your Choice: ");
			   int extraToppings1 = sc.nextInt();
			   switch(extraToppings1) {
			   case 21:
				   basepizza.addExtraCheese();
				   break;
			   case 22:
				   basepizza.addExtraPepperoni();
				   break;
			   case 23:
				   basepizza.addExtraOnions();
				   break;
			   case 24:
				   basepizza.addExtraChicken();
				   break;
			   case 25:
		    	   	basepizza.getBill();
			   		System.exit(0);
			   default:
				   System.out.println("Invalid option");
				   break;
		   }
			  break;
		   case 3:
			   System.out.println("Thank You");
			   System.exit(0);
		   default:
			   System.out.println("Invalid option");
			   System.exit(0);
	   }
     }
   }
  }
 }
   
