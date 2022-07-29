package july28;

public class ProductDaoImpl {
	public static int updateId=-1;
	private Product[] productList=new Product[3];
	private int index=0;

	public ProductDaoImpl() {
	
	}
	
	public void addProduct(Product p) {
		if(index<3) {
		productList[index]=p;
		System.out.println("\nProduct added successfully.");
		index++;
		}
		else {
			System.out.println("You can only add 3 proucts.");
		}
	}
	
	public void viewAllProducts()
	{
		for(int i=0;i<index;i++) {
			System.out.println(productList[i].toString());
		}
	}
	
	public void update(int id,Product p) {
		for(int i=0;i<index;i++) {
			if(productList[i].getPid()==id) {
				productList[i]=p;
				System.out.println("Product updated successfully.");
				updateId=-1;
			}
		}
	}
	
	public boolean checkPid(int id) {
		for(int i=0;i<index;i++) {
			if(productList[i].getPid()==id && productList[i].getPid()!=updateId ) {
				return true;
			}
		}
		return false;
	}
	
	public void delete(int id) {
		for(int i=0;i<index;i++) {
			if(productList[i].getPid()==id) {
				for(int j=i;j<index-1;j++) {
					productList[i]=productList[i+1];
				}
				index-=1;
				System.out.println("Deleted successfully.");
				break;
			}
		}
	}
	public void viewProduct(int pno) {
		if(pno<=3 && pno>0)
		System.out.println(productList[pno-1]);
		
		else
			System.out.println("Product does not exists.");
	}
}
