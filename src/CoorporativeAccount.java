public class CoorporativeAccount extends Account {
	private String firmName;
	private String bulstat;

	public CoorporativeAccount(float sum, String firmName, String bulstat) {
		super(sum);
		this.firmName = firmName;
		this.bulstat = bulstat;
	}

	public CoorporativeAccount() {
		this(0, "", "");
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFname(String firmName) {
		this.firmName = firmName;
	}

	public String getBulstat() {
		return bulstat;
	}

	public void setBulstat(String bulstat) {
		if (CoorporativeAccount.class.isAssignableFrom(Account.class)) {
			this.bulstat = bulstat;
		} else {
			this.bulstat = "Not valid exception!";
		}
	}

	public void successor(Object x) throws Exception {
		if (x instanceof Account) {
			System.out.println(bulstat);
		}else {
			System.out.println("Not valid exception!");
		}
	}
}