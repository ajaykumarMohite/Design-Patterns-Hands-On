import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		chatMediator.setUsers(new ArrayList<>());
		BasicUser bUser=new BasicUser(chatMediator,"Ajay");
		PremiumUser pUser=new PremiumUser(chatMediator,"Virat");
		BasicUser user1=new BasicUser(chatMediator, "VIrat");
		
		chatMediator.addUser(Virat);
		chatMediator.addUser(Ajay);
		Virat.sendMessage("Hi All,My name is Virat");
	}
}
