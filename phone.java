import java.util.Scanner;
public class phone {
	Scanner scan =  new Scanner (System.in);
	private double weight ;
	private String screen;
	private double speedFastCharge;
	
	phone (){
		System.out.println ("Please enter type of Screen (Super Amooled or IPS) ");
		this.screen=scan.nextLine ();
		System.out.println ("Please enter the weight :");
		this.weight=scan.nextDouble();
		System.out.println ("Please enter speed of charging in a hour");
		this.speedFastCharge=scan.nextDouble();
		
	}
	String getScreen() {
		return this.screen;
	}
	double getWeight() {
		return this.weight;
	}
	double getSpeed () {
		return this.speedFastCharge;
	}
	}

	


