package Nov9;
class Houses{
	private static String locations[]={"Hyd","Blr","Delhi"};
	private static int noHousesForSale[]={5,4,7};
	public void noForSale(String city){
		boolean found=false;
		System.out.println("City : "+city);
		for(int i=0;i<locations.length;i++){
			if(locations[i].equalsIgnoreCase(city)){
				found=true;
				System.out.println("Homes for sale : "+noHousesForSale[i]);

			}
		}
		if(!found){
			System.out.println("No homes for sale!");
		}
	}
}
public class TestHouses {
	public static void main(String[] args) {
		Houses h = new  Houses();
		h.noForSale("Hyd");
		h.noForSale("KLR");
	}
}
