package stock;

	class StockHolding                  //a class called StockHolding to represent a stock that you have purchased
	{  /*For instance variables,  two floats named purchaseSharePrice and 
	*currentSharePrice,
	* one int named numberOfShares and
	*  one string named companyName. */
		
		float purchaseSharePrice, currentSharePrice;             
		int numberOfShares;
		String companyName;
		
	// accessor methods for the instance variables
		
		StockHolding(float purchasePrice, float currentPrice, int noOfShare, String cname)
		{
			purchaseSharePrice = purchasePrice;
			currentSharePrice = currentPrice;
			numberOfShares = noOfShare;
			companyName = cname;
		}
		//two other instance methods: 
		float costInDollars()
		{
			return purchaseSharePrice*numberOfShares;
		}
		
		float valueInDollars()
		{
			return currentSharePrice*numberOfShares;
		}
	}



