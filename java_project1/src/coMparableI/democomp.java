package coMparableI;
public class democomp implements Comparable<democomp>{
   String name;
   int id;
   int age;
public democomp(String name, int id, int age) {
	//super();
	this.name = name;
	this.id = id;
	this.age = age;
}
  public void display() {
	  System.out.println(name+ " "+id+" "+age);
  }
@Override
public int compareTo(democomp o) {
	// TODO Auto-generated method stub
	return this.age-o.age;
}
  
}
                                                                                            