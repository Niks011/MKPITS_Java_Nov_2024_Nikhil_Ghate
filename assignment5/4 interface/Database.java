interface DatabaseOperation{
	void create();
	void read();
	void update();
	void delete();
}

class MySQLDatabase implements DatabaseOperation
{
	public void create(){
	System.out.println("SQL query for create table");
	}
	public void read(){
	System.out.println("SQL query for read data");
	}
	public void update(){
	System.out.println("SQL query for update details");
	}
	public void delete(){
	System.out.println("SQL query for delete data");
	System.out.println();
	}
}

class OracleDatabase implements DatabaseOperation
{
	public void create(){
	System.out.println("Oracle query for create table");
	}
	public void read(){
	System.out.println("Oracle query for read data");
	}
	public void update(){
	System.out.println("Oracle query for update details");
	}
	public void delete(){
	System.out.println("Oracle query for delete data");
	}

}

class Database{
	public static void main(String args[]){
	DatabaseOperation db = new MySQLDatabase();
	db.create();
	db.read();
	db.update();
	db.delete();

	DatabaseOperation dbo = new OracleDatabase();
	dbo.create();
	dbo.read();
	dbo.update();
	dbo.delete();
	}
}