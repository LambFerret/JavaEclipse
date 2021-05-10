package java_20210510;

public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private int price;
	private boolean valid;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getSeq() {
		return seq;
	}

	public void setGroup(int group) {
		if (group > 10) {
			group = 10;
		}
		this.group = group;
	}

	public int getGroup() {
		return group;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isValid() {
		return valid;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getSdate() {
		return sdate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public String getEdate() {
		return edate;

	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getRegdate() {
		return regdate;
	}

}
