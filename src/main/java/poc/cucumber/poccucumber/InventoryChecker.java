package poc.cucumber.poccucumber;

public class InventoryChecker {
	

	static int stock  = 100;
	
	static int cash = 20000;
	
	
	public boolean checkStock(int stockquantity)
	{
		if(stockquantity > stock)
		{
		    return false;	
		}
		else
		{
		   return true;
		}
	}
	
	
	
	
	public boolean checkcash(int cashAmount)
	{
		if(cashAmount > cash)
		{
		    return false;	
		}
		else
		{
		   return true;
		}
	}

}
