package st;

import java.util.Comparator;

	public class NameComparator implements Comparator<Studentclass>{

	    @Override
	    public int compare(Studentclass s1, Studentclass s2) {
	        return s1.getName().compareTo(s2.getName());

	}
}