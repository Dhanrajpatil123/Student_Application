package studdentApp;

public class StudentData {

	private int sId;
	
	private String sName;
	
	private String sMobile;
	
	private String city;

	
	public StudentData() {
		super();
	}


	public StudentData(int sId, String sName, String sMobile, String city) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMobile = sMobile;
		this.city = city;
	}

	


	public StudentData(String sName, String sMobile, String city) {
		super();
		this.sName = sName;
		this.sMobile = sMobile;
		this.city = city;
	}

	
	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}



	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}



	public String getsMobile() {
		return sMobile;
	}



	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "StudentData [sId=" + sId + ", sName=" + sName + ", sMobile=" + sMobile + ", city=" + city + "]";
	}

	
	
}
