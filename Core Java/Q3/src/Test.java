import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]) {
		
		List<MobileConnection> mobileConnections = new ArrayList<MobileConnection>();
		
		MobileConnection mc1 = new MobileConnection(123456789, "Airtel", "Prepaid");
		MobileConnection mc2 = new MobileConnection(123456789, "Idea", "Prepaid");
		MobileConnection mc3 = new MobileConnection(123456789, "Bsnl", "Postpaid");
		
		mobileConnections.add(mc1);
		mobileConnections.add(mc2);
		mobileConnections.add(mc3);
		
		display(mobileConnections);
	}

	private static void display(List<MobileConnection> mobileConnections) {
		// TODO Auto-generated method stub
		for(MobileConnection m : mobileConnections) {
			System.out.println(m);
		}
	}

}
