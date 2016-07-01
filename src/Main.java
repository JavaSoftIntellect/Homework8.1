class Account {
	private float sum;

	public Account(float sum) {
		super();
		this.sum = sum;
	}

	public Account() {
		this(0);
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) throws NegativeMoneyException {
		if (sum < 0) {
			throw new NegativeMoneyException("Sum cannot be negative!");
		}
		this.sum = sum;
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		Account petar = new Account(150);
		try {
			petar.setSum(-20);
			System.out.println("Sum: " + petar.getSum());

		} catch (NegativeMoneyException exception) {
			System.out.println("Sum cannot be negative!");
			System.out.println();
		}

		PersonalAccount dimitar = new PersonalAccount(250, "Dimitar", "455020");
		dimitar.successor(dimitar);
		System.out.println();
	
		 CoorporativeAccount ivan = new CoorporativeAccount(350, "Ivan","879536");
		 ivan.successor(ivan);

	}
}