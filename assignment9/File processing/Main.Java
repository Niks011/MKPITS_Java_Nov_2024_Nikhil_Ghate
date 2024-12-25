import java.io.*;

class Thread1 extends Thread{
	public void run(){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try{
	File file = new File("abc.txt");
	BufferedReader bfr = new BufferedReader(new FileReader(file));
	String str = bfr.readLine();
	System.out.println(str.length());
	}catch(Exception e){	
	System.out.println(e);}
	}
}

class Thread2 extends Thread{
	public void run(){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try{
	File file = new File("abc1.txt");
	BufferedReader bfr = new BufferedReader(new FileReader(file));
	String str = bfr.readLine();
	System.out.println(str.length());
	}catch(Exception e){	
	System.out.println(e);}
	}
}

class Main{
	public static void main(String args[]){
	Thread1 th = new Thread1();
	Thread2 th2 = new Thread2();
	th.start();
	th2.start();
	}
}