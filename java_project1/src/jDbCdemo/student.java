package jDbCdemo;

public class student {
	   int sid;
	     String sname;
	     int phy;
	     int chem;
	     float avg;
	     
		public student(int sid, String sname, int phy, int chem, float avg) {
			this.sid = sid;
			this.sname = sname;
			this.phy = phy;
			this.chem = chem;
			this.avg = avg;
		}
		public student() {
			
		}
		public static float average(int phy, int chem) {
			return ((phy+chem)/2);
			
		}
}
