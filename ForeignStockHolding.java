package stock;

//a subclass of StockHolding called ForeignStockHolding
public class ForeignStockHolding extends StockHolding
{
	float conversionRate;         /* an additional instance variable: conversionRate of float type, 
	* (The conversion rate is what you need to multiply
	* the local price by to get a price in Canadian dollars.
	*  Assume the purchasePrice and currentPrice are in the local currency.)*/
	
	ForeignStockHolding(float purchasePrice, float currentPrice, int noOfShare, String cname, float conRate) 
	{
		super(purchasePrice, currentPrice, noOfShare, cname);
		/*"super" (a special variable), for use in the definitions of instance methods. 
		 * The variable super is for use in a subclass. Like this, super refers to the object that contains the method. 
		 * The reason super exists is so you can get access to things in the superclass that are hidden by things in the subclass.
		 */

		conversionRate = conRate;
	}
	/*  Override costInDollars and valueInDollars to do the right thing. */
	
	float costInDollars()
	{
		return conversionRate*purchaseSharePrice*numberOfShares;
	}
	
	float valueInDollars()
	{
		return conversionRate*currentSharePrice*numberOfShares;
	}
	
	
}


