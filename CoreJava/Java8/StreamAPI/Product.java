package StreammJava8;

public class Product {
private String productName;
private double productPrice;
private String productBrand;


	public Product(String string, double i, String string2) {
	this.productName=string;
	this.productPrice=i;
	this.productBrand=string2;
}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + ", productBrand="
				+ productBrand + "]\n" ;
	}
	
	
	

}
