/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RR
 */
public class PizzaOrder {

    /**
     * @param args the command line arguments
     */
      // base prices
       public static final double SMALL_BASE_PRICE = 8.0;
       public static final double LARGE_BASE_PRICE = 11.0;
       public static final double FAMILY_BASE_PRICE = 14.0;
        //topping prices 
       public static final double SMALL_TOPPING_PRICE = 1.0;
       public static final double LARGE_TOPPING_PRICE = 1.5;
       public static final double FAMILY_TOPPING_PRICE = 2.0;       
   
    
        public static void main(String[] args) {
        // TODO code application logic here
           // number of pizzas
        int numOfSmallPizza = 2;
        int numOfLargePizza = 2;
        int numOfFamilyPizza = 1;       
        //amount of toppings
        int numOfSmallToppings = 3;
        int numOfLargeToppings = 4;
        int numOfFamilyToppings = 6;  
        // store price 
        double smallPrice = 0; 
        double largePrice = 0;
        double familyPrice = 0;
        double totalCost = 0;
        
        // small pizza
        smallPrice = (SMALL_BASE_PRICE * numOfSmallPizza) + ((SMALL_TOPPING_PRICE * numOfSmallToppings) * numOfSmallPizza);
        System.out.println("Order for small pizzas: $" + smallPrice);
        totalCost += smallPrice;
        //large pizza
        largePrice = (LARGE_BASE_PRICE * numOfLargePizza) + ((LARGE_TOPPING_PRICE * numOfLargeToppings) * numOfLargePizza);
        System.out.println("Order for large pizzas: $" + largePrice);
        totalCost += largePrice;
        //family pizza
        familyPrice = (FAMILY_BASE_PRICE * numOfFamilyPizza) + ((FAMILY_TOPPING_PRICE * numOfFamilyToppings) * numOfFamilyPizza);
        System.out.println("Order for Family pizzas: $" + familyPrice);
        totalCost += familyPrice;
        
        System.out.println("total cost is $" + totalCost);
      
        
       
    
                        
    }
    
}
