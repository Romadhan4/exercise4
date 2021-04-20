
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vivo a = new Vivo ();
		System.out.println ("Phone 1");
		System.out.println ("Detail Information");
		System.out.println ("Merk :"+a.getMerk());
		System.out.println ("Type of phone :"+a.getMerk());
		System.out.println ("Ram :"+a.getRam()+"GB");
		System.out.println ("Type of screen:"+a.getScreen());
		System.out.println ("Weight of phne:"+a.getWeight()+"gr");
		System.out.println ("Speed charging in one minute:"+a.getSpeed()+"%");
		System.out.println ("Price per Item :"+"RM"+a.getPrice());
		System.out.println ("Total units to buy:"+a.getUnits());
		System.out.println ("Total price RM:"+a.getTotal());

		System.out.println ();
		
		Samsung b = new Samsung ();
		System.out.println ("Phone 2");
		System.out.println ("Detail Information");
		System.out.println ("Merk :"+b.getMerk());
		System.out.println ("Type of phone :"+b.getTypeHP());
		System.out.println ("Ram :"+b.getRam()+"GB");
		System.out.println ("Type of screen :"+b.getScreen());
		System.out.println ("Weight of phne:"+b.getWeight()+"gr");
		System.out.println ("Speed charging in one minute:"+b.getSpeed()+"%");
		System.out.println ("Price per Item :"+"RM"+b.getPrice());
		System.out.println ("Total units to buy:"+b.getUnits());
		System.out.println ("Total price :RM"+b.getTotal());
		
	
		
	}

}




	

