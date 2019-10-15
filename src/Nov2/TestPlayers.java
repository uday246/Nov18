package Nov2;

class Player{
	private int goals;
	private int stops;
	private String name;
	public Player(int aGoals, int aStops, String aName) {
		super();
		goals = aGoals;
		stops = aStops;
		name = aName;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int aGoals) {
		goals = aGoals;
	}
	public int getStops() {
		return stops;
	}
	public void setStops(int aStops) {
		stops = aStops;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	
	
}
public class TestPlayers {
public static void main(String[] args) {
	Player p[]=new Player[4];
	p[0]= new Player(3,1,"Player1");
	p[1]= new Player(1,2,"Player2");
	p[2]= new Player(4,0,"Player3");
	p[3]= new Player(0,4,"Player4");
	topGoals(p);
	topStops(p);
}

private static void topStops(Player[] aP) {
	int max=-1,index=0;
	for(int i=0;i<aP.length;i++){
		if(max<aP[i].getStops())
		{
			max=aP[i].getStops();
			index=i;
		}
	}
	System.out.println("Player with top stops : "+aP[index].getName());
	System.out.println("No of stops: "+aP[index].getStops());
	
}

private static void topGoals(Player[] aP) {
	int max=-1,index=0;
	for(int i=0;i<aP.length;i++){
		if(max<aP[i].getGoals())
		{
			max=aP[i].getGoals();
			index=i;
		}
	}
	System.out.println("Player with top goals : "+aP[index].getName());
	System.out.println("No of goals: "+aP[index].getGoals());	
}
}
