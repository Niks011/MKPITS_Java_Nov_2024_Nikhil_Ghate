class Counter{
	static int count = 0;
	
	public synchronized void increment(){
	count++;
	}

	public int getCount(){
	return count;
	}
	
}

class Main{
	public static void main(String args[]){
	Counter count = new Counter();
	Thread t1 = new Thread(()->{
	for(int i=0; i<1000; i++){
	count.increment();}
	});

	Thread t2 = new Thread(()->{
	for(int i=0; i<1000; i++){
	count.increment();}
	});

	Thread t3 = new Thread(()->{
	for(int i=0; i<1000; i++){
	count.increment();}
	});

	Thread t4 = new Thread(()->{
	for(int i=0; i<1000; i++){
	count.increment();}
	});

	Thread t5 = new Thread(()->{
	for(int i=0; i<1000; i++){
	count.increment();}
	});

	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	
	try{
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	t5.join();

	}catch(Exception e){
	System.out.println(e);}
	System.out.println("Final count is "+ count.getCount());
	}
}