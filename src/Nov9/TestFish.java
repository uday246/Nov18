package Nov9;


class Lake{
	private String name;
	private Fish fish[];
	private int capacity;
	private int numFish;
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public int getNumFish() {
		return numFish;
	}
	public void setNumFish(int aNumFish) {
		numFish = aNumFish;
	}
	public boolean isFull(){
		return numFish==capacity; 
	}
	public Lake(String aName, int aCapacity) {
		super();
		name = aName;
		capacity = aCapacity;
		fish= new Fish[capacity];
	}
	public Lake(){
		
	}
	public String toString(){
		return name+" Lake containing "+numFish+" fish";
	}
	public void add(Fish f){
		if(numFish<capacity)
			fish[numFish++]=f;
		else{
			//finding removed slots
			int p=getSlot();
			if(p!=-1)
				fish[p]=f;
		}
			
	}
	private int getSlot() {
		for(int i=0;i<fish.length;i++)
			if(fish[i]==null)
				return i;
		return -1;
	}
	public Fish getHungryFish(){
		for(int i=0;i<numFish;i++){
			if(fish[i]!=null && fish[i].isHungry())
				return fish[i];
		}
		return null;
	}
	public void listFish(){
		for(int i=0;i<numFish;i++){
			if(fish[i]!=null)
				System.out.println(fish[i]);
		}

	}
}

class Fish {
	  private String species;
	  private int size;
	  private boolean hungry;

	  public Fish() {
	  }

	  public Fish(String species, int size) {
	    this.species = species;
	    this.size = size;
	    
	  }

	  public String getSpecies() {
	    return species;
	  }

	  public int getSize() {
	    return size;
	  }

	  public boolean isHungry() {
	    return hungry;
	  }

	  public void setHungry(boolean hungry) {
	    this.hungry = hungry;
	  }

	  public String toString() {
	    return "A "+(hungry?"hungry":"full")+" "+size+"cm "+species;
	  }
	}

public class TestFish {
public static void main(String[] args) {
	Lake l = new Lake("White", 10);
	l.add(new Fish("Pike", 35));
	l.add(new Fish("Bass", 6));
	Fish f = new Fish("Sunfish", 10);
	f.setHungry(true);
	l.add(f);
	System.out.println(l.getHungryFish());
	l.listFish();
	System.out.println(l);
}
}
