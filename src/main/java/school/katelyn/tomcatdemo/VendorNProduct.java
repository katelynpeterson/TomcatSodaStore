package school.katelyn.tomcatdemo;

public class VendorNProduct{

	private String vendor ="";
	private String product ="";
	
	public VendorNProduct(String v, String p){
		setVendor(v);
		setProduct(p);
	}

	public String getVendor(){
		return vendor;
	}

	public String getProduct(){
		return product;
	}

	public void setVendor(String ven){
		this.vendor = ven;
	}

	public void setProduct(String prod){
		this.product = prod;
	}
}
