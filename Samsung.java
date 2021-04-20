import java.util.Scanner;
public class Samsung extends phone{
	Scanner scan = new Scanner (System.in);
	
	private String merk,typeHp;
	private int Ram,units,price ;
	private double  totalPrice;
	
	
	
	Samsung(){
		this.merk = "Samsung";
		System.out.println ("Please enter the type of Samsung (Galaxy s21+ or Galaxy s21)");
		this.typeHp= scan.nextLine();
		while (this.typeHp.equalsIgnoreCase("Galaxy s21+") == false && this.typeHp.equalsIgnoreCase("Galaxy s21") == false) {
			System.out.println("Wrong input! Please input again!");
			System.out.print("Please enter the Ram: ");
			this.typeHp = scan.nextLine();
	}
	System.out.println ("Please enter the Ram:");
	this.Ram=scan.nextInt();
	while (this.Ram != 8 && this.Ram != 12) {
		System.out.println("Wrong! enter 8 or 12 GB");
		System.out.print("Please enter the RAM(8/12): ");
		this.Ram = scan.nextInt();
	}
	if (merk.equalsIgnoreCase("Samsung") ) {
		if (typeHp.equalsIgnoreCase("Galaxy s21+")) {
			if (Ram == 8) {
				this.price = 1699;
			}
			else if (Ram==12) {
				this.price=1800;
			}
		}
		else if (typeHp.equalsIgnoreCase("Galaxy s21")) {
			if (Ram == 8 ) {
				this.price=1799;
			}
			else if (Ram==12) {
				this.price=1999;
			}
		}
				System.out.println (" Please how many phone you want to buy ?");
				this.units=scan.nextInt();
				this.totalPrice=this.price * this.units;
				System.out.println();
				
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


