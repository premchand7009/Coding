package PracticeQuestion;
import java .util.Scanner;
class Product{
	int prodId,quantity;
	double price ;
	static double totalPrice;
	Product(int prodId,int quantity,double price){
		this.prodId=prodId;
		this.quantity=quantity;
		this.price=price;
		totalPrice+=(quantity*price);
	}
	void displayData() {
		System.out.println("Product Id:"+prodId+" Quantity:"+quantity+" Price:"+price);
	}
}
public class Q4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		Product P[]=new Product[3];
		for(int i=0;i<P.length;i++) {
			System.out.print("Enter Product Id:");
			int p=sc.nextInt();
			System.out.print("Enter Quantity:");
			int q=sc.nextInt();
			System.out.print("Enter Price:");
			double pr=sc.nextDouble();
			P[i]=new Product(p,q,pr);
		}
		System.out.println("Details of Products");
		for(int i=0;i<P.length;i++) {
			P[i].displayData();
		}
		System.out.println("Total Billed Amount:"+Product.totalPrice);

	}

}
