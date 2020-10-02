package ArrayListEx;

public class Country {
	String CountryName;
	int contrycode;
	int NoOfStates;
	
	@Override
	public String toString() {
		return "CountryName=" + CountryName + "  contrycode=" + contrycode + "  NoOfStates=" + NoOfStates
				;
	}
	public Country(String countryName, int contrycode, int noOfStates) {
		super();
		CountryName = countryName;
		this.contrycode = contrycode;
		NoOfStates = noOfStates;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public int getContrycode() {
		return contrycode;
	}
	public void setContrycode(int contrycode) {
		this.contrycode = contrycode;
	}
	

}
