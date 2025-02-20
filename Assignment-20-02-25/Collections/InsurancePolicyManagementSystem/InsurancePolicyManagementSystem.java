import java.util.*;

class InsurancePolicyManagementSystem{
	
	HashSet<Policy> hs;
	LinkedHashSet<Policy> ls;
	TreeSet<Policy> ts;


	InsurancePolicyManagementSystem(){
		
		this.hs = new HashSet<>();
		this.ls = new LinkedHashSet<>();
		this.ts = new TreeSet<>(new Comparator<Policy>(){
			//overiding the compare method of Treeset
			@Override
			public int compare(Policy p1, Policy p2){
				return p1.expiryDate-p2.expiryDate;
			}
		});
	
	}

	public void add(Policy p){
	
		for(Policy po : hs){
			if(po.policyNumber == p.policyNumber && !po.policyHolderName.equals(p.policyHolderName) ){
				System.out.println("Cannot add another user with used policy number");
				return;
			}
		
		}
		
		hs.add(p);
		ls.add(p);
		
		ts.add(p);
	
	}
	
	public void retrieveAllUnique(){
	
		Iterator<Policy> it = ls.iterator();
		
		while(it.hasNext()){
			Policy p = it.next();
			p.display();
		}
	}
	
	public void retrieveExpiring(){
	
		Iterator<Policy> it = ts.iterator();
		while(it.hasNext()){
			Policy p = it.next();
			if(p.expiryDate <= 30){
				p.display();
			}
			else
				break;
		}
	
	}
	
	public void retrieveCoverage(String coverageType){
	
		Iterator<Policy> it = ls.iterator();
		while(it.hasNext()){
			Policy p = it.next();
			if(p.coverageType.equals(coverageType)){
				p.display();
			}
		}
	
	}
	
	public void retrieveDuplicates(int policyNumber){
	
		Iterator<Policy> it = ls.iterator();
		while(it.hasNext()){
			Policy p = it.next();
			if(p.policyNumber == policyNumber){
				p.display();
			}
		}
	
	}
	
	public void remove(Policy p){
	
		hs.remove(p);
		ts.remove(p);
		ls.remove(p);
	
	}
	

}