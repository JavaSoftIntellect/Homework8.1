public class PersonalAccount extends Account {
	private String name;
	private String egn;

	public PersonalAccount(float sum, String name, String egn) {
		super(sum);
		this.name = name;
		this.egn = egn;
	}

	public PersonalAccount() {
		this(0, "", "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getEgn() {
		return egn;
	}

	public void setEgn(String egn) throws Exception {
	
	}

	public void successor(Object x) throws Exception {
		if (x instanceof Account) {
			System.out.println(egn);
		} else {
			System.out.println("Not valid exception");
		}
	}
}