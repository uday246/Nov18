package Nov13;

public class RegionRevenue {
	static  double revenue[][] = { { 500243, 210100 }, { 456900, 189990 }, { 786333, 396440 }, { 954020, 450020 }, };
	static String name[]={"North","South","West","East"};
	public static void main(String[] args) {
		String res= getHighestMarginRegion(revenue);
		System.out.println(res+" has highest profit margin");
	}
	private static String getHighestMarginRegion(double[][] aRevenue) {
		double max=-1;
		int loc=-1;
		for(int i=0;i<4;i++){
			double margin=(revenue[i][0]-revenue[i][1])/revenue[i][0];
			margin*=100;
			if(max<margin){
				max=margin;
				loc=i;
			}
		}
		return name[loc];
	}
}
