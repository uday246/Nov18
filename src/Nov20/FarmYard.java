package Nov20;

import java.util.Random;

interface Animal {
public String move();
public String behave();
public String speak();
public int getNumLegs();
public String getBodyCovering();
}


class Chicken implements Animal {
   private int numLegs;
   private String covering;

   Chicken(){
       numLegs = 2;
       covering = "feathers";
   }
   @Override
   public String move() {
      
       return "walks";
   }

   public String speak() {
       return "cluck";
   }

   public String behave() {
       return "pecks at ground";
   }  
  
   public int getNumLegs() {
       return numLegs;
   }
  
   public String getBodyCovering() {
       return covering;
   }
}


class Cow implements Animal{
   private int numLegs;
private String covering;
  
Cow(){
   numLegs = 4;
   covering = "hair";
}
public String move(){
   return "run";
}
public String speak(){
   return "moo";
}
public String behave(){
   return "wag tail";
}
  
public int getNumLegs() {
       return numLegs;
   }
  
   public String getBodyCovering() {
       return covering;
   }
}



public class FarmYard {
  
private Animal[] animals = new Animal[4];
private static final Random randomNumbers = new Random();
  
public FarmYard(){
   animals[0] = new Cow();
   animals[1] = new Cow();
   animals[2] = new Chicken();
   animals[3] = new Chicken();
}
  
public void describe(){
   for (Animal a: animals){
       System.out.println("I am a " + a.getClass().getName() + " with "
       + a.getNumLegs() + " legs, covered with " + a.getBodyCovering());
          
   }
}
  
public void simulate(){
   for (int i = 0; i < 5; i++){
       System.out.println(animals[randomNumbers.nextInt(4)].speak());
       System.out.println(animals[randomNumbers.nextInt(4)].behave());
       System.out.println(animals[randomNumbers.nextInt(4)].move());
   }
}

public static void main (String[] args) {
   FarmYard farm = new FarmYard();
   farm.describe();
   farm.simulate();
}
}

