package Bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer.orginazion = "ford";
		Customer customer1 = new Customer(1, "venky", false, 215);
		Customer customer2 = new Customer(2, "ali", false, 230);
		
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
		System.out.println(customer1.getId());
		System.out.println(customer1.getName());
		System.out.println(customer1.getIsLocked());
		System.out.println(customer1.getBalance());
		System.out.println(customer1.orginazion);
		System.out.println(customer2.orginazion);
	}

}
