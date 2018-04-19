package school.katelyn.tomcatdemo;

import java.util.ArrayList;
import java.util.List;

public class SodaSelect{
	public List getAvailableBrands(SodaType type){
		List brands = new ArrayList();

		if(type.equals(SodaType.PEPSICO)){
			brands.add("Pepsi");
			brands.add("Mug Root Beer");
			brands.add("Mountain Dew");
		}
		else if(type.equals(SodaType.COCACOLA)){
			brands.add("Coca-Cola");
			brands.add("Sprite");
			brands.add("Fanta");
			brands.add("Fresca");
		}
		else if(type.equals(SodaType.DRPEPPERSNAPPLE)){
			brands.add("7up");
			brands.add("A&W Root Beer");
			brands.add("Dr. Pepper");
			brands.add("Crush");
		}
		else if(type.equals(SodaType.DASANI)){
			brands.add("Water");
		}
		else{
			brands.add("No Brand Available");
		}	
		return brands;
	}
}
