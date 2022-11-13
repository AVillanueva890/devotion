/**
* Name: Alpichi T. Villanueva
* Section: IT Dept - Devotion 
* Year: 4th Year
*/
package villanueva;
import java.util.Scanner;

public class Smallstore{

  public static void main(String[]args) {
  
  Scanner purchase = new Scanner(System.in);
  
  
  String orderCart = "You purchase are the following: \n";
  int respondToOrder, orderCategory;
  float totalPayment = 0, customerCash;
  
  System.out.println("============ WELCOME TO RAIDO'S PUB! =============");
  System.out.println("| DO YOU WANT TO PURCHASE? [1-YES, 2-NO]         |");
  System.out.println("| Enter the number for your choice below         |");
  System.out.println("==================================================");
  System.out.print  ("Choice:");
  respondToOrder = purchase.nextInt(); 
  
  do {

  if (respondToOrder == 1) {
  
	  System.out.println("============ WELCOME TO RAIDO'S PUB! =============");
	  System.out.println("|WHAT TO PURCHASE?[1-FOOD, 2- BEVERAGES ,3-SNACKS|");
	  System.out.println("| Enter the number for your choice below         |");
	  System.out.println("==================================================");
	  System.out.print  ("Choice:");
	  orderCategory = purchase.nextInt();
	  
	  if(orderCategory == 1) {
	    System.out.println("============ WELCOME TO RAIDO'S PUB! =============");
	    System.out.println("|***************ORDER FOOD***********************|");
	    System.out.println("| [1] Chicken Adobo+ Unli-Rice       : P250.00   |");
	    System.out.println("| [2] Crispy Pata                   : P1800.00   |");
	    System.out.println("| [3] Sinigang + Unli-Rice           : P180.00   |");
	    System.out.println("| [4] Lechon                         : P250.00   |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    float unliChicken = 250 , unliPork = 180, bangusSisig = 180;
	    int orderChoice = purchase.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Chicken Adobo + Unli-Rice: P250.00 added to cart");
		  totalPayment+=unliChicken;
		  String order1 = "Chicken Adobo + Unli-Rice: P250.00 \n";
		  orderCart+=order1;
		  
		break;
		
		case 2: 
		  System.out.println("Crispy Pata           : P180.00  added to cart");
		  totalPayment+=unliPork;
		  String order2 = "Crispy Pata          : P180.00  \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Sinigang + Unli-Rice      : P180.00 added to cart");
		  totalPayment+=bangusSisig;
		  String order3 = " Sinigang + Unli-Rice      : P180.00 \n";
		  orderCart+=order3;
		  
		break;
	     
	      case 4: 
		  System.out.println("Lechon      : P250.00 added to cart");
		  totalPayment+=bangusSisig;
		  String order4 = "Lechon      : P250.00 \n";
		  orderCart+=order4;
		  
		break; 
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    

	  } else if(orderCategory == 2) {
	    System.out.println("============ WELCOME TO RAIDO'S PUB! =============");
	    System.out.println("|***************ORDER BEVERAGE********************|");
	    System.out.println("| [1] 1-Bucket of Red Horse Beer     : P310.00    |");
	    System.out.println("| [2] 1-Tower of Beer na Beer Pilsen : P280.00    |");
	    System.out.println("| [3] Tanduay Rhum                   : P80.00     |");
	    System.out.println("| [4]  Emperador Light 1L            : P170.00    |");
	    System.out.println("| Enter the number for your choice below          |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float redhorse = 310 , bnbp = 280, tanduay  = 180, Emperador = 170;
	    int orderChoice = purchase.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("1-Bucket of Red Horse Stallion : P310.00 added to cart");
		  totalPayment+=redhorse;
		  String order1 = "1-Bucket of Red Horse Stallion : P310.00 \n";
		  orderCart+=order1;
		  
		  
		  
		  
		break;
		
		case 2: 
		  System.out.println("1-Tower of Beer na Beer Pilsen : P280.00 added to cart");
		  totalPayment+=bnbp;
		  String order2 = "1-Tower of Beer na Beer Pilsen : P280.00 \n";
		  orderCart+=order2;
		  
		  
		  
		break;
		
		case 3: 
		  System.out.println("Tanduay Rhum: P80.00  added to cart");
		  totalPayment+=tanduay;
		  String order3 = "Tanduay Rhum: P80.00 \n";
		  orderCart+=order3;
		  
		  
		break;
		
          case 4: 
		  System.out.println("Emperador Light 1L: P170.00  added to cart");
		  totalPayment+=tanduay;
		  String order4 = "Emperador Light 1L: P170.00 \n";
		  orderCart+=order4;
		  
		  
		break; 
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
	       break;  	       
	      
	      }
	    
	    
	    }
	    
	    else if(orderCategory == 3) {
	    System.out.println("============ WELCOME TO RAIDO'S PUB! =============");
	    System.out.println("|*************ORDER SNACKS / PULUTAN*************|");
	    System.out.println("| [1] Chicharon                     : P150.00    |");
	    System.out.println("| [2] Sisig                         : P250.00    |");
	    System.out.println("| [3] Mani                          : P100.00    |");
	    System.out.println("| [4] Kinilaw                       : P150.00    |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float chicharon = 150 , sisig = 250, mani = 100, kinilaw = 150;
	    int orderChoice = purchase.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Chicharon         : P150.00 added to cart");
		  totalPayment+=chicharon;
		  String order1 = "Chicharon        : P150.00 \n";
		  orderCart+=order1;
		break;
		
		case 2: 
		  System.out.println("Sisig            : P250.00 added to cart");
		  totalPayment+=sisig;
		  String order2 = "Sisig            : P250.00 \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Mani     : P100.00  added to cart");
		  totalPayment+=mani;
		   String order3 = "Mani   : P100.00 \n";
		   orderCart+=order3;
		  
		  
		break;
		
		case 4: 
		  System.out.println("Kinilaw     : P150.00  added to cart");
		  totalPayment+=mani;
		   String order4 = "Kinilaw   : P150.00 \n";
		   orderCart+=order4;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    
	    }
   }
   
   else {
   
   System.out.println("Okay! Have a nice day!~ ;)");
   System.exit(0);
   
   
   }
   
   
   
   
   System.out.println("Order again?");
   System.out.println("[1] - Yes");
   System.out.println("[2] - No");
   respondToOrder = purchase.nextInt();
   
    
  } while(respondToOrder == 1);
  
    System.out.println("Amount to pay: "+totalPayment);
    System.out.print("Enter cash payment: ");
    customerCash = purchase.nextFloat();
  
    System.out.println("==========R E C E I P T ========");
    System.out.println(orderCart);
     System.out.printf("TOTAL: %.2f\n",totalPayment);
    System.out.println("Change: " + (customerCash - totalPayment));
    System.out.println("================================");
     System.out.println("Thank you come again!");
  
  
  
  
  

  }


}
