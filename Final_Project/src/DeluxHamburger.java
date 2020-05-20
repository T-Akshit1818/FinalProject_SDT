import java.util.ArrayList;
class DeluxHamburger{
ArrayList<String> burgerli = new ArrayList<String>();
public String rolltype;
public double price;
public double total;
public DeluxHamburger(){}
   public DeluxHamburger(String rt, double pr)
   {
	rolltype= rt;
	price = pr;
	burgerli.add("added"+rolltype+"for an extra"+price);
   }
   public ArrayList<String> price()
   {
	return burgerli;
   }
}