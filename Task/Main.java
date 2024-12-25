import java.io.*;
class Main{
	public static void main(String args[]){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try{
	System.out.println("Enter source File name");
	String fname = br.readLine();
	File file = new File("c:\\project\\Task", fname);
	if(file.exists()){
	BufferedReader br1 = new BufferedReader(new FileReader(file));
	BufferedWriter bw = new BufferedWriter(new FileWriter("abc1.txt"));
	String str = br1.readLine();

	while(str!=null){
	bw.write(str+"\n");
	str = br1.readLine();
	}
	bw.close();
	System.out.println("Data Copied Successfully");
	}else{
	System.out.println("File Does not exists");
	}
	
	}catch(Exception e){
	System.out.println(e);
	}
	}

}