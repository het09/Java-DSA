package CollectionSorting;

public class Emp implements Comparable<Emp> {
	int eid;
	String ename;
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int compareTo(Emp e) {
		
		return ename.compareTo(e.ename);
	}
	
	
}
