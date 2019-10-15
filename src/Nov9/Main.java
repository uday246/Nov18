package Nov9;

public class Main {
    //Method to call Game
    public static void game()
    {
        //Create the object for game
        Game game=new Game();

        //Call the play method
        game.play();
    }
}

class Game

{

private Parser parser;

    private Room currentRoom;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room garage, kids, master, living, office, upstairs;
      
        // create the rooms
        garage = new Room("in the room you park your car in","Emptiness",0);
        living = new Room("in the largest room in the house","A relaxing couch",100);
        kids = new Room("in a place where kids dwell","Droves of toys",30);
        master = new Room("in the safest place on earth","Comfortable looking bed",80);
        office = new Room("Where work gets done","Computer system",20);
        upstairs = new Room("in a very open room with two doors","Dirty clothes from the past 2 weeks",10);
        
        // initialise room exits
        garage.setExit("north", living);
        living.setExit("east", office);
        living.setExit("west", upstairs);
        living.setExit("south", garage);
        office.setExit("west", living);
        kids.setExit("north", upstairs);
        master.setExit("east", upstairs);
        upstairs.setExit("west", master);
        upstairs.setExit("south", kids);
        upstairs.setExit("east", living);
        currentRoom = garage;  // start game outside
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to Choose your adventure (family edition)!");
        System.out.println("This is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        /**
         * Cleaned up old code. Implemented new code to print current location
         */
        System.out.println();
        printLocationInfo();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if(commandWord.equals("look")) {
            look();
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }   
        else if (commandWord.equals("run")) {
            System.out.println("You can't run! This is your life now!");
        }   
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print all commands words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at your house.");
        System.out.println();
        System.out.println("Your command words are:");
        String str = parser.showCommands();
        System.out.println(str);
    }

    /** 
     * Try to go in one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
         /**
         * Cleaned up old code. Implemented new code to print current location
         */
            printLocationInfo();
        }
    }
    private void look()
    {
        System.out.println(currentRoom.getLongDescription());
    }
/**
 * This section prints out information about the current location
 * meaning it prints the exits for the player. (Current from 8.7 on)
 */
private void printLocationInfo()
/**
 * Created new method printLocationInfo() to help reduce code and
 * efficiently post printing the exits. 
 */
{
    System.out.println("You are " +
        currentRoom.getLongDescription());
    System.out.print("Exits: ");
    if(currentRoom.getExit("north") != null)
    System.out.print("north ");
    if(currentRoom.getExit("east") != null)
    System.out.print("east ");
    if(currentRoom.getExit("south") != null)
    System.out.print("south ");
    if(currentRoom.getExit("west") != null)
    System.out.print("west ");
    System.out.println();
}
/**
 * Created new method printLocationInfo() to help reduce code and
 * efficiently post printing the exits. (Code for Ex. 8.5 and 8.6)
private void printLocationInfo()
{
        System.out.println("You are " + currentRoom.getDescription());
        System.out.print("Exits: ");
        if(currentRoom.northExit != null) 
            System.out.print("north ");
        
        if(currentRoom.eastExit != null)
            System.out.print("east ");
        
        if(currentRoom.southExit != null) 
            System.out.print("south ");
        
        if(currentRoom.westExit != null) 
            System.out.print("west ");
            System.out.println();
}  
*/
    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }

}
