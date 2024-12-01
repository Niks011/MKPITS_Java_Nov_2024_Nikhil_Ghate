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

	Student st = new Student();
	st.setName("Nikhil");
	st.setCollege("Sipna college of Engineering and Technology");
	st.setEmail("nikhilghate@gmail.com");
	st.setGrade(78%);
	st.setNumber(915419845);
	System.out.println(st.getName());
	System.out.println(st.getCollege());
	System.out.println(st.getbookName());
	System.out.println(st.getEmail());
	System.out.println(st.getGrade());
	System.out.println(st.getNumber());
	System.out.println();



	Course cr = new Course();
	cs.setCourseName("Java Full Stack");
	cs.setInstitute("Udemy");
	cs.setCourseNumber(769648017);
	cs.setPrice(2999);
	System.out.println(cs.getCourseName());
	System.out.println(cs.getInstitute());
	System.out.println(cs.getEmail());
	System.out.println(cs.getPrice());
	System.out.println(cs.getCourseNumber());

	}


}