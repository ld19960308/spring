package transaction;

public class Account {
	private Integer id;
	private String AccountNo;
	private float Blance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public float getBlance() {
		return Blance;
	}
	public void setBlance(float blance) {
		Blance = blance;
	}

}
