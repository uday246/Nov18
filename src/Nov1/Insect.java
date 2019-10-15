package Nov1;

public class Insect {
public static final String NONAME="no name";
public static final double NOWINGS=0.0;
private String name;
private double wingLength;
private boolean terrestrial;
public Insect(){
	
}
public Insect(String aName, double aWingLength, boolean aTerrestrial) {
	super();
	name = aName;
	wingLength = aWingLength;
	terrestrial = aTerrestrial;
}
public String getName() {
	return name;
}
public void setName(String aName) {
	name = aName;
}
public double getWingLength() {
	return wingLength;
}
public void setWingLength(double aWingLength) {
	wingLength = aWingLength;
}
public boolean isTerrestrial() {
	return terrestrial;
}
public void setTerrestrial(boolean aTerrestrial) {
	terrestrial = aTerrestrial;
}
@Override
public String toString() {
	return "Insect [name=" + name + ", wingLength=" + wingLength + ", terrestrial=" + terrestrial + "]";
}
public static void main(String[] args)
{
    // test overloaded constructor
    Insect ins1 = new Insect("honeybee",11.0, true); // name, wing length, terrestrial
    Insect ins2 = new Insect("water beetle", NOWINGS, false);
    
    // test wing length accessor
    System.out.println(ins1.getName() + " wing length = " + ins1.getWingLength() + "mm");
    System.out.println(ins2.getName() + " wing length = " + ins2.getWingLength() + "mm");
    
    // test terrestrial accessor
    if (ins1.isTerrestrial() == true)
        System.out.println(ins1.getName() + " is terrestrial.");
    else
        System.out.println(ins1.getName() + " is not terrestrial.");

    if (ins2.isTerrestrial() == true)
        System.out.println(ins2.getName() + " is terrestrial.");
    else
        System.out.println(ins2.getName() + " is not terrestrial.");
    
    // test wing length mutator
    System.out.println("Doubling " + ins1.getName() + " wing length.");
    ins1.setWingLength(ins1.getWingLength() * 2.0);
    
    // test terrestrial mutator
    System.out.println("Changing " + ins2.getName() + " to terrestrial.");
    ins2.setTerrestrial(true);
    
    // test toString
    System.out.println("Final state of insects: ");
    System.out.println(ins1);
    System.out.println(ins2);
}

}
