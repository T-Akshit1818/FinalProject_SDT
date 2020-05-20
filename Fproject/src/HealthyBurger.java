import java.util.ArrayList;
public class HealthyBurger extends DeluxHamburger{   
	   public String Burgername;
	   public String rolltype;
	   public double price;
	   public double total;
	   ArrayList<String> burgerli = new ArrayList<String>();
	   public HealthyBurger(){}
	   public HealthyBurger(String bn, String rt, double pr,double tot)
	   {
		Burgername = bn;
		rolltype= rt;
		price = pr;
		total=tot;
	   }
	   public double Hbprice()
	   {
		return price;
	   }
	   public double Hbtot()
	   {
		   return total;
	   }
	   public ArrayList<String> price()
	   {
		return burgerli;
	   }
}
