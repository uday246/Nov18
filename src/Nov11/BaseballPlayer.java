package Nov11;

public class BaseballPlayer {
	 String name;
	 String position;
	 int numAtBats;
	 int numSingles;
	 int numDoubles;
	 int numTriples;
	 int numHomeRuns;
	 double battingAverage;
	
	public void computeBattingAverage(){
		if(numAtBats==0)
			battingAverage=0;
		else
			battingAverage = (numSingles+numDoubles+numTriples+numHomeRuns)/(double)numAtBats;
		
	}
	
}
