package school.katelyn.tomcatdemo;

import java.util.ArrayList;
import java.util.List;

public class SodaSelect{
 List<VendorNProduct> vnp = new ArrayList<VendorNProduct>();
 VendorNProduct v = new VendorNProduct();
	
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
		else if(type.equals(SodaType.COUNTRYTIME)){
			brands.add("Strawberry Lemonade");
			brands.add("Lemonade");
			brands.add("Pink Lemonade");
		}
		else{
			brands.add("No Brand Available");
		}	
		return brands;
	}

	public List getVendorProducts(){

		 		 vnp.add(new VendorNProduct("PEPSICO","Pepsi"));
                 vnp.add(new VendorNProduct("PEPSICO", "Mug Root Beer"));
                 vnp.add(new VendorNProduct("PEPSICO", "Mountain Dew"));
                 vnp.add(new VendorNProduct("COCACOLA", "Coca-Cola"));
                 vnp.add(new VendorNProduct("COCACOLA", "Sprite"));
                 vnp.add(new VendorNProduct("COCACOLA", "Fanta"));
                 vnp.add(new VendorNProduct("COCACOLA","Fresca"));
                 vnp.add(new VendorNProduct("DRPEPPERSNAPPLE","7up"));
                 vnp.add(new VendorNProduct("DRPEPPERSNAPPLE","A&W Root Beer"));
                 vnp.add(new VendorNProduct("DRPEPPERSNAPPLE","Dr. Pepper"));
                 vnp.add(new VendorNProduct("DRPEPPERSNAPPLE","Crush"));
                 vnp.add(new VendorNProduct("DASANI","Water"));
                 vnp.add(new VendorNProduct("COUNTRYTIME","Strawberry Lemonade"));
                 vnp.add(new VendorNProduct("COUNTRYTIME","Lemonade"));
                 vnp.add(new VendorNProduct("COUNTRYTIME","Pink Lemonade"));
		System.out.println(vnp.size()+" test size");
		return vnp;
	
	}

	public String getVen(){
		return v.getVendor();
	}

	public String getProd(){
		return v.getProduct();
	}
}
