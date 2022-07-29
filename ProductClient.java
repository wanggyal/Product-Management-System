package july28;

import java.util.Scanner;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************* Welcoe to Product Management Application ****************");

		ProductDaoImpl pList = new ProductDaoImpl();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter your choice:\n1 -> Add Product\n2 -> View All Products1"
					+ "\n3 -> View specific Product\n4 -> Update product\n5 -> Delete Product\n6 -> Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				int pid;
				//check if there exists a product with same pid
				while(true) {
					System.out.print("Enter Product id: ");
					pid = sc.nextInt();
					if(( pList).checkPid(pid)) {
						System.out.println("this product id(pid) already exist, Please enter new pid");
					}
					else
					break;
				}
				System.out.print("Enter Product name: ");
				String pname = sc.next();
				System.out.print("Enter Product quantity: ");
				int qty = sc.nextInt();
				System.out.print("Enter Product price: ");
				double price = sc.nextDouble();

				Product p = new Product(pid, pname, qty, price);
				pList.addProduct(p);
				break;
			}

			case 2: {
				System.out.println("\nAll products: ");
				pList.viewAllProducts();
				break;
			}

			case 3: {
				System.out.print("Which product do you want to view? ");
				int x = sc.nextInt();
				System.out.println("\nProduct " + x);
				pList.viewProduct(x);
				break;
			}
			case 4: {
				
				System.out.println("Enter the product id to update the product");
				int id=sc.nextInt();
				int pid;
				//check if there exists a product with same pid
				while(true) {
					System.out.print("Enter new Product id: ");
					pid = sc.nextInt();
					ProductDaoImpl.updateId=pid;
					if(( pList).checkPid(pid)) {
						System.out.println("this product id(pid) already exist, Please enter new pid");
					}
					else
					break;
				}
				System.out.print("Enter new Product name: ");
				String pname = sc.next();
				System.out.print("Enter new Product quantity: ");
				int qty = sc.nextInt();
				System.out.print("Enter new Product price: ");
				double price = sc.nextDouble();

				Product p = new Product(pid, pname, qty, price);
				pList.update(id, p);
				break;

			}
			case 5: {
				System.out.println("Enter the product id to delete the product");
				int pid=sc.nextInt();
				
				pList.delete(pid);
				break;
			}
			case 6: {
				System.out.println("************ Thank you for using this application ***************");
				System.exit(0);
			}
			default:
				System.out.println(
						"Enter your choice:\n1 -> Add Product\n2 ->View All Products1\n3 -> View specific Product\n4 -> Exit");

			}
		}

	}

}
