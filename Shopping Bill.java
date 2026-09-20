//Develop a JAVA program for a shopkeeper which helps him to generate the bill for the customer by accepting the customer name,his address, his tel. No., the items 
//purchased, their unit price and the quantity of each item and compute the bill amount assuming the customer has bought three item. Display the bill with all the 
//information like shop name, tel no. Of shop, customer name, his address, his tel no. , the items purchased, unit price of each item and quantity and the total for
//each item as well as the total bill amount in proper format like a bill you see when you buy something from shop. The description of variables should be written//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Product 
{
private String pname;
private int qty;
private double price;
private double totalPrice;
Product(String pname, int qty, double price, double totalPrice) 
{
this.pname = pname;
this.qty = qty;
this.price = price;
this.totalPrice = totalPrice;
}
public String getPname()
{
return pname;
}
public int getQty() 
{
return qty;
}
public double getPrice() 
{
return price;
}
public double getTotalPrice() 
{
return totalPrice;
}
public static void displayFormat() 
{
System.out.print("Name Quantity Price Total Price");
}
public void display() 
{
System.out.format("%-9s %8d %10.2f %10.2f",pname, qty, price, totalPrice);
}
}
public class ShoppingBill
{
public static void main(String[] args) 
{
String productName = null;
int quantity = 0;
double price = 0.0;
double totalPrice = 0.0;
double overAllPrice = 0.0;
char choice = '\0';
Scanner scan = new Scanner(System.in);
List product = new ArrayList();
do 
{
System.out.println("Enter product details,");
System.out.print("Name: ");
productName = scan.nextLine();
System.out.print("Quantity: ");
quantity = scan.nextInt();
System.out.print("Price (per item): ");
price = scan.nextDouble();
totalPrice = price * quantity;
overAllPrice += totalPrice;
product.add( new Product(productName, quantity, price, totalPrice) );
System.out.print("Want to add more item? (y or n): ");
choice = scan.next().charAt(0);
scan.nextLine();
}
while (choice == 'y' || choice == 'Y');
Product.displayFormat();
for (Product p : product) 
{
p.display();
}
System.out.println("
Total Price = " + overAllPrice);
scan.close();

}

}
