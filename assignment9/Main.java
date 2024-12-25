class Counter{
	static int count = 0;
	
	public static synchronized void increment(){
	count++;
	}

	public static int getCount(){
	return count;
	}
}


class Thread1 implements Runnable{

	public void run(){
	for(int i=0; i<1000; i++){
	Counter.increment();
	}
}
}
class Thread2 implements Runnable{

	public void run(){
	for(int i=0; i<1000; i++){
	Counter.increment();
	}
	}
}

class Main{
	public static void main(String args[]){
Counter cnt=new Counter();
	Thread1 t1 = new Thread1();
	Thread2 t2 = new Thread2();
	Thread tr1=new Thread(t1);
	Thread tr2=new Thread(t2);
	tr1.start();
	tr2.start();
	try{
	tr1.join();
	tr2.join();
	}
	catch(Exception e){
	System.out.println(e);}

	System.out.println(cnt.getCount());
}
}