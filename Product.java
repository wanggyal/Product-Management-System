package july28;

public class Product {
	private int pid;
	private String pName;
	private int qty;
	private double price;
	
	public Product(int pid, String pName, int qty, double price) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.qty = qty;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
}
