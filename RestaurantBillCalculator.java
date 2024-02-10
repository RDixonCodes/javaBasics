public class RestaurantBillCalculator {
    public static double generateOrderBill(int foodChoice, int drinkChoice, int dessertChoice, String couponCode) {
	    
	    double foodPrice = getMenuItemPrice(foodChoice);
	    double drinkPrice = getMenuItemPrice(drinkChoice);
	    double dessertPrice = getMenuItemPrice(dessertChoice);
	    
	    double orderAmount = foodPrice + drinkPrice + dessertPrice;
	    
	    if(orderAmount > 10.00) {
	        orderAmount -= applyCoupon(couponCode);
	    }
		
		return orderAmount;
	}
	
	public static double getMenuItemPrice(int choice) { 
		double itemPrice = 0.0;
		
	    switch(choice){
	        case 0: itemPrice = 0.00;
	        
	        break;
	        case 1: itemPrice = 12.00;
	        
	        break;
	        case 2: itemPrice = 8.00;
	        
	        break;
	        case 3: itemPrice = 10.00;
	        
	        break;
	        case 4: itemPrice = 15.00;
	        
	        break;
	        case 5: itemPrice = 7.00;
	        
	        break;
	        case 6: itemPrice = 9.00;
	        
	        break;
	        case 7: itemPrice = 3.00;
	        
	        break;
	        case 8: itemPrice = 3.00;
	        
	        break;
	        default: itemPrice = -1.00;
	        
	        break;
	    }
		
		return itemPrice;
	}
	
	public static double applyCoupon(String couponCode) { 
		double discount = 0.00;
		
		switch(couponCode){
		    case "SAVE4": discount = 4.00;
		    
		    break;
		    case "HAPPYHOUR": discount = 5.00;
		    
		    break;
		    case "SPECIAL30OFF": discount = 3.00;
		    
		    break;
		    case "SUNDAY2OFF": discount = 2.00;
		    
		    break;
		    case "GOODSTUDENT": discount = 2.00;
		    
		    default: discount = 0.00;
		    break;
		}
		
		return discount; 
	}	
	
	public static void main(String[] args) {
		int foodChoice = 1; // Example choice: 1 for Pizza
		int drinkChoice = 8; // Example choice: 8 for Coffee
		int dessertChoice = 9; // Example choice: 9 for Cake
		String couponCode = "HAPPYHOUR"; // Example coupon code

		double totalBill = generateOrderBill(foodChoice, drinkChoice, dessertChoice, couponCode);
		System.out.println("Total order bill: $" + totalBill);
	}
}
