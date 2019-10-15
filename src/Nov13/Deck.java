package Nov13;

import java.util.List;

import java.util.ArrayList;

/**

* The Deck class represents a shuffled deck of cards.

* It provides several operations including

* initialize, shuffle, deal, and check if empty.

*/

public class Deck {

/**

* cards contains all the cards in the deck.

*/

private List<Card> cards;

/**

* size is the number of not-yet-dealt cards.

* Cards are dealt from the top (highest index) down.

* The next card to be dealt is at size - 1.

*/

private int size;

/**

* Creates a new <code>Deck</code> instance.<BR>

* It pairs each element of ranks with each element of suits,

* and produces one of the corresponding card.

* @param ranks is an array containing all of the card ranks.

* @param suits is an array containing all of the card suits.

* @param values is an array containing all of the card point values.

*/

public Deck(String[] ranks, String[] suits, int[] values) {

cards = new ArrayList<Card>();

for (int j = 0; j < ranks.length; j++) {

for (String suitString : suits) {

cards.add(new Card(ranks[j], suitString, values[j]));

}

}

size = cards.size();

shuffle();

}

/**

* Determines if this deck is empty (no undealt cards).

* @return true if this deck is empty, false otherwise.

*/

public boolean isEmpty() {

return size == 0;

}

/**

* Accesses the number of undealt cards in this deck.

* @return the number of undealt cards in this deck.

*/

public int size() {

return size;

}

/**

* Randomly permute the given collection of cards

* and reset the size to represent the entire deck.

*/

public void shuffle() {

for( int k = size - 1; k >= 0; k-- ) {

int r = (int)(Math.random() * k);

Card tmp = cards.get(r);

cards.set(r, cards.get(k));

cards.set(k, tmp);

}

/**

* Deals a card from this deck.

* @return the card just dealt, or null if all the cards have been

* previously dealt.

*/

public Card deal(){

	if (isEmpty()) {

		return null;

	}

	size--;

	Card c = cards.get(size);

	return c;

}

/**

* Generates and returns a string representation of this deck.

* @return a string representation of this deck.

*/


public String toString(){

String rtn = "size = " + size + "\nUndealt cards: \n";

for (int k = size - 1; k >= 0; k--) {

rtn = rtn + cards.get(k);

if (k != 0) {

rtn = rtn + ", ";

}

if ((size - k) % 2 == 0) {

// Insert carriage returns so entire deck is visible on console.

rtn = rtn + "\n";

}

}

rtn = rtn + "\nDealt cards: \n";

for (int k = cards.size() - 1; k >= size; k--) {

rtn = rtn + cards.get(k);

if (k != size) {

rtn = rtn + ", ";

}

if ((k - cards.size()) % 2 == 0) {

// Insert carriage returns so entire deck is visible on console.

rtn = rtn + "\n";

}

}

rtn = rtn + "\n";

return rtn;

}

}

}




class Card

{

//create variables to be used

private int value;

private char suit;

//This just initializes variables

public Card()

{

value = 0;

suit = 'a';

}

//This allows new values to be entered into the card method

public Card(int inVal, char inSuit)

{

value = inVal;

suit = inSuit;

}

//This method just gets the suit of the card

public Card(String aString, String aSuitString, int aI) {
	// TODO Auto-generated constructor stub
}

public String getSuit()

{

  

String name;

//This just switchs what suit is used

//It breaks once the suit is selected

switch(suit)

{

case 'h': name = "H";

break;

case 'd': name = "D";

break;

case 's': name = "S";

break;

case 'c': name = "C";

break;

default: return " ";

}

return name;

}

//This just returns the value of value

public int getValue()

{

return value;

}

//method to print turn the class into a string

public String toString()

{

//Will hold a value if the card is a face value

String card;

//Turns the face card values into characters

// Ex. Ace = A

switch(value)

{

case 1: card = "A";

break;

case 11: card = "J";

break;

case 12: card = "Q";

break;

case 13: card = "K";

break;

default: card = Integer.toString(value);

}

//Returns the shortened name of the card

// Ex. 10H = 10 of Hearts

return card + this.getSuit();

}

}
