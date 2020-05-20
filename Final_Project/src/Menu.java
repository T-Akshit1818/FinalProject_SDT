import java.util.*;
public class Menu {
	public String rolltype;
	public String Meat;
	public float price;
	public String burgername;
	public int toppingchoice;
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int option=0;
System.out.println("************************************************");
System.out.println("               Welcome to Subway");
System.out.println("************************************************");
System.out.println("--->MENU");
System.out.println("\n1) Basic hamburger on a white roll with sausage");
System.out.println("COST:- 3.60$");
System.out.println("2) Healthy hamburger with Brown rye roll with Bacon");
System.out.println("COST:- 5.67$");
System.out.println("3) Delux Hamburger on a white roll with Sausage");
System.out.println("COST:- 14.45$");
System.out.println("4) Exit");
System.out.println("Enter your choice:1-4");
option=sc.nextInt();
sc.close();
switch (option)
{
case 1:
	System.out.println("You Have chosen Basic Hamburger on a white roll with sausage");
	break;
case 2:
	System.out.println("You Have Chosen Healthy Hamburger with Brown rye roll with Bacon");
	break;
case 3:
	System.out.println("You Have Chosen Delux Hamburger on a white roll with Sausage ");
	
default:
	break;
}
	 }
}
