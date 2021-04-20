import java.util.Scanner;

public class Vivo extends phone {
	private String merk,typeHp;
	private int Ram,units,price ;
	private double  totalPrice;
	
	Scanner scan = new Scanner (System.in);
	
	Vivo(){
		this.merk = "Vivo";
		System.out.println ("Please enter the type of Vivo (V15/Reno4)");
		this.typeHp= scan.nextLine();
		while (this.typeHp.equalsIgnoreCase("V15") == false && this.typeHp.equalsIgnoreCase("Reno4") == false) {
			System.out.println("Wrong input! input again!");
			System.out.print("Please enter the Ram: ");
			this.typeHp = scan.nextLine();
	}
	System.out.println ("Please enter the Ram:");
	this.Ram=scan.nextInt();
	while (this.Ram != 8 && this.Ram != 12) {
		System.out.println("Wrong !enter 8 0r 12 GB");
		System.out.print("Please enter the RAM(8/12): ");
		this.Ram = scan.nextInt();
	}
	if (merk.equalsIgnoreCase("Vivo") ) {
		if (typeHp.equalsIgnoreCase("V15")) {
			if (Ram == 8) {
				this.price = 1699;
			}
			else if (Ram==12) {
				this.price=1800;
			}
		}
		else if (typeHp.equalsIgnoreCase("Reno4")) {
			if (Ram == 8 ) {
				this.price=1799;
			}
			else if (Ram==12) {
				this.price=1999;
			}
		}
				System.out.println(" Please how many phone you want to buy ?");
				this.units=scan.nextInt();
				this.totalPrice=this.price* this.units;
				System.out.println ();
			}}
			
			String getMerk () {
				return this.merk;
			}
			String getTypeHP() {
				return this.typeHp;
			}
			Integer getRam () {
				return this.Ram;
			}
			double getPrice () {
				return this.price;
			}
			Integer getUnits () {
				return this.units;
			}
			double getTotal() {
				return this.totalPrice;
			}
		

	}
