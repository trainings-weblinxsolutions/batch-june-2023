package inheritance;

public class DowncastingExample {
public static void main(String[] args) {
	
	Entertainment e;
	
	Movie m = new Movie();
	m.name="KGF";
	m.stuntMaster="Person";
	
	
	e = m; 
	
	System.out.println(e.name);
	//System.out.println(e.stuntMaster); - This will not work because Entertainment class doesnt have stuntMaster attribute 
	
	Drama d = new Drama();
	d.name="New Drama";
	e = d;
	System.out.println(e.name);
	
	
	// m = d; // Error - Type mismatch: cannot convert from Drama to Movie
	
	
	Entertainment ent1;	
	
	Drama d1 = new Drama();
	d1.name="New D1";
	ent1 = d1;
	
	System.out.println(ent1.name);
	
	//ent1 = new Movie();
	
	Drama d2 = (Drama)ent1; 
	//Type mismatch: cannot convert from Entertainment to Drama
	System.out.println(d2.name);

	
	
}
}

