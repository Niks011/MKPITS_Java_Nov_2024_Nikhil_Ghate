class Solution {
	public static int getCountByType(Footwear[] footwear, String footwearType) {
      int count = 0;

      for(int i = 0; i < footwear.length; i++) 
	{
      if(footwear[i].getFootwearType().equalsIgnoreCase(footwearType))
	{
      count++;
      }
      }return count;
    }

	public static Footwear getSecondHighestPriceByBrand(Footwear[] footwear, String brand){
	
	int highest=footwear[0].getPrice();
	for(int i=1; i<footwear.length; i++){
	if(footwear[i].getPrice()>highest){
	highest=footwear[i].getPrice();
	}
	}

	Footwear footwearWithSecondHighest = footwear[0];
	int secondHighest=footwear[0].getPrice();
	for(int i=1; i<footwear.length; i++){
	if(footwear[i].getPrice()>secondHighest && footwear[i].getPrice()<highest){
	  secondHighest=footwear[i].getPrice();
	  footwearWithSecondHighest=footwear[i];	
	}
	}
	return footwearWithSecondHighest;
	}
}