import java.util.Scanner;
public class Pockets {

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Please enter a pocket number");
		    int num=sc.nextInt();
		    if (num==0){
		    	System.out.println("Green");}
		    else if (num>=1 && num<=10) {
		    	if (num%2==0)
		    		System.out.println("Red");
		    	else
		    		System.out.println("Black");}	
		    else if (num>=11 && num<=18) {
		    	if (num%2==0)
		    		System.out.println("Black");
		    	else
		    		System.out.println("Red");}	
		    else if (num>=19 && num<=28) {
		    	if (num%2==0)
		    		System.out.println("Red");
		    	else
		    		System.out.println("Black");}
		    else if (num>=29 && num<=36) {
		    	if (num%2==0)
		    		System.out.println("Black");
		    	else
		    		System.out.println("Red");}
		    }
		    	
		    }  
