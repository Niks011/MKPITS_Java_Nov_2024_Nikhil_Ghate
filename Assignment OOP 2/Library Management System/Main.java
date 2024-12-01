class Main{
	public static void main(String args[]){
	
	
	Books bk = new Books();
	bk.setbookName("Power of Money");
	bk.setauthorName("Economist Paul Sheard");
	bk.setNumber(45);
	bk.Display();
	System.out.println();
	//System.out.println(bk.getbookName());
	//System.out.println(bk.getauthorName());
	//System.out.println(bk.getNumber());

	Patrons pt = new Patrons();
	pt.setName("Nikhil");
	pt.setDepartment("Information Technology");
	pt.setEmail("nikhilghate@gmail.com");
	pt.setrollNumber(205);
	pt.setNumber(915419845);
	System.out.println(pt.getName());
	System.out.println(pt.getDepartment());
	System.out.println(pt.getbookName());
	System.out.println(pt.getEmail());
	System.out.println(pt.getrollNumber());
	System.out.println(pt.getNumber());
	System.out.println();



	Staff st = new Staff();
	st.setName("Nikhil Ghate");
	st.setDepartment("Computer Science");
	st.setEmail("abc@gmail.com");
	st.setNumber(769648017);
	st.setId(255);
	System.out.println(st.getName());
	System.out.println(st.getDepartment());
	System.out.println(st.getEmail());
	System.out.println(st.getId());
	System.out.println(st.getNumber());

	}


}