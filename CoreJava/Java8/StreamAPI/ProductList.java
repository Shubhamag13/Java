package StreammJava8;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
public static void main(String[] args) {
	Product product1 = new Product("Perfume",590,"Beard");
	Product product2 = new Product("Minoxidil",1210,"ManMatters");
	Product product3 = new Product("Soap",450,"Dettol");
	Product product4 = new Product("BodyWash",890,"Dove");
	Product product5 = new Product("FashWash",1100,"Dermco");
	Product product6 = new Product("Sunscreen",999,"Dot&Key");
	
	
	List<Product> list = new ArrayList<>();
	list.add(product1);
	list.add(product2);
	list.add(product3);
	list.add(product4);
	list.add(product5);
	list.add(product6);
	
	System.out.println(list);
	
	
	//Filter the product who has price less than 1000
	
	list.stream().filter(i->i.getProductPrice()<1000).forEach(i->System.out.println(i));
	
}
}
