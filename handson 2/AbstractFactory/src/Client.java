
public class Client 
{
	public static void main(String[] args) {
		
		
		//audi methods
		Factory audiFactory=Factory.getFactoryType("AUDI");
		Headlight audiHeadlight=audiFactory.makeHeadlight();
		Tire audiTire=audiFactory.makeTire();
		
		//mercedes methods
		Factory mercedesFactory=Factory.getFactoryType("MERCEDES");
		Headlight mercedesHeadlight=mercedesFactory.makeHeadlight();
		Tire mercedesTire=mercedesFactory.makeTire();
	}
}
