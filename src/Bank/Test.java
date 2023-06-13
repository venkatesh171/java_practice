package Bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1, "venky", false, 215);
		
		/*
		customer.setId(1);
		customer.setName("venkatesh");
		customer.setIsLocked(true);
		customer.setBalance(250);
		*/
		/*
		 Customer customer = new Customer();
		 customer.id = 1;
		 customer.name = "venkatesh";
		 customer.isLocked = true;
		 customer.balance = 300;
		 System.out.println(customer.id);
		 System.out.println(customer.name);
		 System.out.println(customer.isLocked);
		 System.out.println(customer.balance);
		 */
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getIsLocked());
		System.out.println(customer.getBalance());
	}

}
