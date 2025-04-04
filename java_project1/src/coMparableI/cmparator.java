package coMparableI;

import java.util.Comparator;

public class cmparator implements Comparator<democomp>{
	@Override
	public int compare(democomp s1,democomp s2) {
		return s1.id-s2.id;
	}
      
}
