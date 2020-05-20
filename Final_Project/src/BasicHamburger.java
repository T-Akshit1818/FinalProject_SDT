import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class BasicHamburger extends HealthyBurger{

   public String Addons;
   public String rolltype;
   public double price;
   public static double total=0;
   ArrayList<String> burgerli = new ArrayList<String>();
   public BasicHamburger(){}
   public void BasicHamburger(String ad,double pr,double tot)
   {
	Addons = ad;
	price = pr;
	total=tot;
   }
   public String Ad()
   {
	   return Addons;
   }
   public double Baprice()
   {
	return price;
   }
   public double Batot()
   {
	   return total;
   }
   public ArrayList<String> price()
   {
	return burgerli;
   }
   public static void main(String args[])
   {
	ArrayList<String> burgerlist = new ArrayList<String>();        
	char anotherburger = 'Y';
	do
	{
		System.out.println("************************************************");
		System.out.println("               Welcome to Burger Palace");
		System.out.println("************************************************");
		System.out.println("--->MENU");

	System.out.println("\n1-Basic hamburger on a white roll with sausage."+"\n"+"COST:-3.60"+"\n"+"2-Healthy hamburger on a brown rye roll with Bacon"+"\n"+"COST:-5.60"+"\n"+
"3-Deluxe hamburger on a white roll with sausage."+"\n"+"COST:-14.45"+"\n"+"4-exit"+"\n");	
	Scanner myObj = new Scanner(System.in);
    	String userName;
    	System.out.println("Enter your choice from 1-4"); 
    	userName = myObj.nextLine();
	int casenumber = Integer.parseInt( userName );   
    	switch (casenumber) {
      	case 1:
      		System.out.println("You Have Selected Basic Hamburger");
		burgerlist.add("Basic hamburger on white roll with sausage,Price is 3.67");
        total=total+3.67;	
		break;
      	case 2:
      		System.out.println("You Have Selected Healthy Hamburger");
		burgerlist.add("Healthy hamburger on Brown Rye roll with Bacon,Price is 5.67");
			total=total+5.67;
			break;
      	case 3:
      		System.out.println("You Have Selected Delux Hamburger");
		burgerlist.add("Deluxe hamburger on White roll with Bacon,Price is 14.45");
        total=total+14.45;	
		break;
      	case 4:
        	//System.out.println("Thursday");
        	break;
    }
    	int i=0;
    	int nu=0;
    	int z=0;
    	if(casenumber==1)
    	{
    		nu=4;
    		System.out.println("You Can Add upto 4 Toppings to BasicHamBurger each with an additional cost");
    	}
    	else if(casenumber==2)
    	{
    		nu=6;
    		System.out.println("You Can Add upto 6 Toppings to HealthyHamBurger each with an additional cost");
    	}
    	else if(casenumber==3)
    	{
    		nu=8;
    		System.out.println("\nDelux Burger with chips and a drink");
    	}
    	while(z<nu && nu!=8)
    	{
System.out.println("what toppins you want to add??"+"\n"+"1-BBQ Sauce -- 0.99 cad"+"\n"+"2-Tomato-- 1.95 cad"+"\n"+"3-Honey Mustard-- 0.64 cad"+"\n"+
"4-Cheese-- 1.25 cad"+"\n"+"5-Fried Egg-- 1.20 cad"+"\n"+"6-Mayonnaise-- 1.30 cad"+"\n"+"7.Onion-- 0.80 cad"+"\n"+"8-Exit");
System.out.println("Enter your choice from 1-8");
userName = myObj.nextLine();
int num = Integer.parseInt( userName );  
if(num==1)
{
      		if(casenumber==1) {
      			BasicHamburger bh= new BasicHamburger();
      			bh.BasicHamburger("BBQ Sauce",0.99,total);
      			burgerlist.add("Added BBQ Sauce for an extra 0.99");
      			total=total+0.99;
      		}
      		else if(casenumber ==2)
      		{
		DeluxHamburger trial=new DeluxHamburger("BBQ Sauce", 0.99);      		
		burgerlist.add("Added BBQ Sauce for an extra 0.99");
		System.out.println(trial.price());
		total=total+0.99;
      		}
}
      		else if(num== 2)
      		{
      		if(casenumber==1)
      		{
      			BasicHamburger bh= new BasicHamburger();
      			bh.BasicHamburger("Tomato",1.95,total);
		burgerlist.add("Added Tomato for an extra 1.95");
		total=total+1.95;
      		}
      		else if(casenumber==2)
      		{
      			DeluxHamburger trial=new DeluxHamburger("Tomato", 1.95);      		
      			burgerlist.add("Added Tomato for an extra 1.95");
      			System.out.println(trial.price());
      			total=total+1.95;
      		}
      		}
      		else if(num==3)
      		{
      			
		if(casenumber==1)
		{
			BasicHamburger bh= new BasicHamburger();
			bh.BasicHamburger("Honey Mustard",0.64,total);
			burgerlist.add("Added Honey Mustard for an extra 0.64");
			total=total+0.64;
			
		}
		else if(casenumber==2)
		{
			DeluxHamburger trial=new DeluxHamburger("Honey Mustard", 0.64);
			burgerlist.add("Added Honey Mustard for an extra 0.64");
        	total=total+0.64;
        
		}
		}
      		else if(num== 4)
      		{
      		if (casenumber==1)
      		{
      			BasicHamburger bh= new BasicHamburger();
      			bh.BasicHamburger("Cheese",1.25,total);
    			burgerlist.add("Added Cheese for an extra 1.25");
    			total=total+1.25;	
      		}
      		else if(casenumber ==2)
      		{
      			DeluxHamburger trial=new DeluxHamburger("Cheese", 1.25);
      			burgerlist.add("Added cheese for an extra 1.25");
      			total=total+1.25;
      		}
      		}      		
      		else if(num== 5)
      		{
		if(casenumber==1)
		{
			BasicHamburger bh= new BasicHamburger();
			bh.BasicHamburger("Fried Egg",1.20,total);
			burgerlist.add("Added Fried Egg for an extra 1.20");
			total=total+1.20;
		}
		else
			{
			DeluxHamburger trial=new DeluxHamburger("Fried Egg", 1.20);
			burgerlist.add("Added Fried egg for an extra 1.20");
			total=total+1.20;
			}        	
      		}
      		else if(num== 6)
      		{
      		if(casenumber==1)
      		{
      			BasicHamburger bh= new BasicHamburger();
      			bh.BasicHamburger("Mayonnaise",1.30,total);
    			burgerlist.add("Added Mayonnaise for an extra 1.30");
    			total=total+1.30;	
      		}
      		else if(casenumber==2)
      		{
      			DeluxHamburger trial=new DeluxHamburger("Mayonnaise", 1.30);
    			burgerlist.add("Added Mayonnaise for an extra 1.30");
    			total=total+1.30;      			
      		}
      		}
      		else if(num== 7)
      		{
      		if(casenumber==1)
      		{
      			BasicHamburger bh= new BasicHamburger();
      			bh.BasicHamburger("Onions",0.80,total);
    			burgerlist.add("Added Onions for an extra 0.80");
    			total=total+0.80;	
      		}
      		else if (casenumber==2)
      		{
      			DeluxHamburger trial=new DeluxHamburger("Onions", 0.80);
      			burgerlist.add("Added Onions for an extra 0.80");      			
      			total=total+0.80;	      	        	
      		}
      		}
      		else {
      			break;	
      		}
z++;
}
    	System.out.println("Do you want another Burger??(Y/N)");
userName = myObj.nextLine();
anotherburger=userName.charAt(0);
}
while((anotherburger != 'n' && anotherburger != 'N'));
	int size = burgerlist.size();
	for (int j = 0; j < size; j++) {
	      System.out.println(burgerlist.get(j));
	    }
	System.out.println("Total price is "+total);
System.out.println("Thank you");	 
}
}