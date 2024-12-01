import java.util.Scanner;

class Book{
	int number;
	String name, address, email;

    public int getNumber(){
    return number;
    }
	public String getName(){
	 return name;
	}
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
	Book(String name, int number, String address,  String email){
	this.name=name;
    this.number=number;
    this.email=email;
    this.address=address;
    }
}

class Address{
	public static void main(String args[]){
	Book bs[] = new Book[5];
    bs[0]= new Book("Nikhil", 739180949, "Fortune mall, bardi, Nagpur", "nikhilghate@gmail.com");
	bs[1]= new Book("Kuldeep", 465464655, "Manewada, Nagpur", "kuldeepghate@gmail.com");
	bs[2]= new Book("Nikita", 574664655, "Manewada, Nagpur", "nikitaghate@gmail.com");
	bs[3]= new Book("Krishna", 465464655, "Manewada, Nagpur", "krishnaghate@gmail.com");
	bs[4]= new Book("Nilesh", 465464655, "Manewada, Nagpur", "nileshghate@gmail.com");

    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first '3' letters of Name");
    String let = sc.next();
	for(int i=0; i<bs.length; i++){
	 if(bs[i].getName().contains(let)){
	System.out.println(bs[i].getName());
	System.out.println(bs[i].getNumber());
	System.out.println(bs[i].getEmail());
	System.out.println(bs[i].getAddress());
	System.out.println();

	}
	}
}
}


