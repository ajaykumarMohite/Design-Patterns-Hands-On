
public class Main {

	public static void main(String[] args) 
	{
		// constructor is private So Below statement is not allowed
		//DBConn dbconn=new DBConn();
		
		DBConn dbconn=DBConn.getInstance();
		dbconn.showMessage();
	}
}
