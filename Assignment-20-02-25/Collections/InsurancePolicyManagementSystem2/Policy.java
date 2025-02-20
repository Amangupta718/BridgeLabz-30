public class Policy {
    final int policynumber;
    String policyholdername;
    String coveragetype;
    int expirydate;

    Policy(int policynumber,String policyholdername,String coveragetype,int expirydate){
        this.policynumber=policynumber;
        this.policyholdername=policyholdername;
        this.coveragetype=coveragetype;
        this.expirydate=expirydate;
    }
    public void setPolicyholdername(String s){
        this.policyholdername=s;
    }
    public void setCoveragetype(String s){
        this.coveragetype=s;
    }
    public void setExpirydate(int s){
        this.expirydate=s;
    }
    public String getPolicyholdername() {
        return this.policyholdername;
    }
    public String getCoveragetype() {
        return this.coveragetype;
    }
    public int getExpirydate() {
        return this.expirydate;
    }
    public void display(){
        System.out.println("Policy number :"+this.policynumber+" PolicyHolderName :"+this.policyholdername+" Coverage : "+this.coveragetype+" Expirydate : "+this.expirydate);
    }
}
