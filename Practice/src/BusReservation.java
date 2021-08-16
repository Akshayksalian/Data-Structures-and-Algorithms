
import java.util.*;

import Multiaxles.multiaxle;

public class BusReservation implements multiaxle{
	
	public static void main(String [] args) throws Exception {
		
		int slbus=460;
		int seatbus=885;
		int totalbus=slbus+seatbus;
		int avgprice=650;
		String sin = "Single axle";
		
		BusReservation b = new BusReservation();
		
		System.out.println("Welcome to Praveens Bus Travels");
		
		boolean eight = false;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Bus ID :");
		int busid=s.nextInt();
		
		multyofeight(eight);
		
		if(busid%8==0) { 
			eight=true;
		}
		
		System.out.println("Enter the type of Bus :");
		String bustype=s.nextLine();
		
		System.out.println("Enter the trip route");
		String busroute=s.nextLine();
		
		System.out.println("Enter thr Category of Bus :");
		String buscat=s.nextLine();
		
		
		
		System.out.println("Enter the axle");
		String busaxle=s.nextLine();
		
		if(busaxle==null || busaxle!=sin) {
			b.hasmultiaxle();
		} else {
			System.out.println("Single axle");
		}
		
		s.close();
		
		System.out.println("                          ");
		
		System.out.println("For Verfication please go through your entered details");
		
		System.out.println("Bus Id = "+busid);
		System.out.println("Bus Type = "+bustype);
		System.out.println("Bus Category = "+buscat);
		System.out.println("Bus Price = "+avgprice);
		System.out.println("Bus route = "+busroute);
		System.out.println("Bus axle = "+busaxle);
		
		System.out.println("              ");
		System.out.println("Additional information about Praveens Bus Travels");
		System.out.println("Total number of buses in South Karnataks "+totalbus);
		System.out.println("Sleeper Buses "+slbus);
		System.out.println("Seater Buses "+seatbus);
		
	}

	@Override
	public void hasmultiaxle() {
		System.out.println("Bus is multiaxle");
		
	}
	
	
	public static void multyofeight(boolean b) throws Exception {				   	// We don't want to use try catch here so we use throws 	
		
		if(b) {
			throw new Exception("Its not Multiple of 8");              // We are creating error here 
		}	
	}
}




