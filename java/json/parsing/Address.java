package json.parsing;

public class Address {
	private  String state;
	private String country;
	private Details Det;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Details getDet() {
		return Det;
	}
	public void setDet(Details det) {
		Det = det;
	}
	
}
