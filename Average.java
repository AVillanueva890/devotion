/**
* Name: Alpichi T. Villanueva
* Section: Devotion 
* Year: 4th Year
*/
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner Iskor=new Scanner(System.in);
		int Grado=1;
		int total=0;
		int rep=0;
		
		while(Grado==1){
		    System.out.println("Enter Grade:");
		    int grado=Iskor.nextInt();
		    
		    total+=Grado;
		    rep+=Grado;
		    
		    System.out.println("Do you want to enter another grade?\n[1]YES   [2]NO:");
		    Grado=Iskor.nextInt();
		    
		}
		total=total/rep;
		System.out.println("AVERAGE:"+total);
    }	
}
