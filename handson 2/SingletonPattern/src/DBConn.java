
public class DBConn 
{	//Static reference variable
	private static DBConn instance=new DBConn();
	//No Args Constructor
	private DBConn() {
	}
	
	public static DBConn getInstance()
	{
		return instance;
	}
	
	public void showMessage()
	{
		System.out.println("From inside DBConn");
	}
}
