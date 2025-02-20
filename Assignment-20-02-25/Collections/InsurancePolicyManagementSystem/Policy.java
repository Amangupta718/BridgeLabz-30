
class Policy{

	int policyNumber;
	String policyHolderName;
	int expiryDate;
	String coverageType;
	int premiumAmount;
	
	Policy(int policyNumber, String policyHolderName, int expiryDate, String coverageType, int premiumAmount){
	
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	
	}
	
	public void display(){
	
		System.out.println("Policy number is "+this.policyNumber);
		System.out.println("Policy Holder name is "+this.policyHolderName);
		System.out.println("Policy expiry date is "+this.expiryDate);
		System.out.println("Policy coverage type is "+this.coverageType);
		System.out.println("Policy premium amount is "+this.premiumAmount);
		System.out.println();
	
	}

} 