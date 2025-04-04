package oOPS;

public class studmark1 {
   
	String name="";
	int studid;
	int markscc;
	int marksml;
	
	public studmark1(String name,int studid,int markscc,int marksml){
		this.name=name;
		this.studid=studid;
		this.markscc=markscc;
		this.marksml=marksml;
	}
	String name1="";
	int res=0;
	int avg=0;
	public int calculate() {
		avg=(marksml+markscc)/2;
		return avg;
	}
	public String high() {
	
		return "The average marks scored by "+name+" is " +avg;
	}
}
