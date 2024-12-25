class Thread1 extends Thread{
	public synchronized void run(){

	for(int num=0; num<=10; num++){
	if(num%2==0){
	System.out.println("Even no is "+ num);
	}
	}
}
}

class Thread2 extends Thread{
	public synchronized void run(){

	for(int num=0; num<=10; num++){
	if(num%2!=0)
	System.out.println(num);
	}
	}
}

class Main{
	public static void main(String args[]){
	Thread1 t1= new Thread1();
	Thread2 t2= new Thread2();
	t1.start();
	t2.start();
	}
}