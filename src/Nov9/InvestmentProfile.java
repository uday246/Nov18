package Nov9;

public class InvestmentProfile {
	private String companyName;
	private double sharesHeld;
	public InvestmentProfile(String aCompanyName, double aSharesHeld) {
		super();
		companyName = aCompanyName;
		sharesHeld = aSharesHeld;
	}
	
	public InvestmentProfile(){
		companyName="Company co.";
		sharesHeld=100;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String aCompanyName) {
		companyName = aCompanyName;
	}

	public double getSharesHeld() {
		return sharesHeld;
	}

	public void setSharesHeld(double aSharesHeld) {
		sharesHeld = aSharesHeld;
	}
	public String influence(){
		if(sharesHeld<50)
			return "Minority";
		if(sharesHeld >= 50.0 && sharesHeld< 100.0){
			return "Majority ";
		}
		return "Sole Shareholder";
	}
	
}
