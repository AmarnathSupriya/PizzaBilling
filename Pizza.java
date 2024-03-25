package pizzabilling;

public class Pizza {
	  private int price;
	  public boolean vegPizza;

	    
	    public Pizza(boolean vegPizza){
	        this.vegPizza = vegPizza;
	        if(this.vegPizza){
	            this.price = 300;
	        }
	        else{
	            this.price = 450;
	        }
	    }
	    public int baseprize;
	    public Pizza() {
			// TODO Auto-generated constructor stub
	    	if(this.vegPizza == true) {
	    		this.price = 300;
	    	}
	    	else {
	    		this.price = 450;
	    	}
	    	baseprize = this.price;
		}

		public int addedExtraCheese = 100;
	    public int addedBabyCorn = 50;
	    public int addedRedPanner = 40;
	    public int addedPaneer = 150;
	    public int addedTomato = 70;
	    public int addedMushroom = 170;
	    
	    public boolean isExtraCheeseAdded = false;
	    public boolean isBabyCornAdded = false;
	    public boolean isRedPannerAdded = false;
	    public boolean isPannerAdded = false;
	    public boolean isTomatoAdded = false;
	    public boolean isMushroomAdded = false;
	    

	    public void addExtraCheese(){
	    	isExtraCheeseAdded = true;
	        this.price += addedExtraCheese;
	    }

	    public void addBabyCorn(){
	    	isBabyCornAdded  = true;
	        this.price += addedBabyCorn;
	    }

	    public void addRedPanner(){
	    	isRedPannerAdded = true;
	        this.price += addedRedPanner;
	    }
	    public void addPaneer(){
	    	isPannerAdded = true;
	        this.price += addedPaneer;
	    }
	    public void addTomato(){
	    	isTomatoAdded=true;
	        System.out.println("Extra Tomato Slices added.");

	    }
	    public void addMushroom(){
	    	isMushroomAdded = true;
	        this.price += addedMushroom;
	    }
	    
	    int onions = 50;
	    int pepperoni = 70;
	    int chicken = 100;
	    
	    public boolean  isAddextraPepperoni = false;
	    public boolean isAddedOnions = false;
	    public boolean isAddedChicken = false;
		public void addExtraPepperoni() {
			// TODO Auto-generated method stub
			isAddextraPepperoni = true;
			this.price += pepperoni;
		}

		public void addExtraOnions() {
			// TODO Auto-generated method stub
			isAddedOnions = true;
			this.price += onions;
		}

		public void addExtraChicken() {
			// TODO Auto-generated method stub
			isAddedChicken = true;
			this.price += chicken;

		}
		

	    public void getBill(){
	    	System.out.println("===PIZZA HUT INDIA===");
	        String bill = "";
	        System.out.println("Pizza: "+baseprize);
	        if(isExtraCheeseAdded) {
	        	bill += "Extra Cheese added: " + addedExtraCheese + "\n";
	        }
	        if(isBabyCornAdded) {
	        	bill += "Babycorn Toppings: " + addedBabyCorn + "\n";
	        }
	        if(isRedPannerAdded) {
	        	bill += "Red Paneer: " + addedRedPanner + "\n";
	        }
	        if(isTomatoAdded) {
	        	bill += "Tomato Slices: " + addedTomato + "\n";
	        }
	        if(isPannerAdded) {
	        	bill += "Panner: " + addedPaneer + "\n";
	        }
	        if(isMushroomAdded) {
	        	bill += "Mushroom: " + addedMushroom + "\n";
	        }
	        if(isAddextraPepperoni) {
	        	bill += "Pepperoni: " + pepperoni + "\n";
	        }
	        if(isAddedOnions) {
	        	bill += "Onions: " + onions + "\n";
	        }
	        if(isAddedChicken) {
	        	bill += "Chicken Salami: " + chicken + "\n";
	        }
	        bill += "Total Bill: "+this.price;
	        System.out.println(bill);
	        System.out.println("===THANK YOU.===");
	    }

}
