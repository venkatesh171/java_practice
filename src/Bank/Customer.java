package Bank;

public class Customer {
	private int id;
	private String name;
	private boolean isLocked;
	private float balance;
	public static String orginazion;
	
	public Customer(int id, String name, boolean isLocked, float balance) {
		this.id = id;
		this.name = name;
		this.isLocked = isLocked;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
}
