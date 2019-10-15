package Nov8;

import java.util.ArrayList;

public class CountRank {

private static final int NO_PAIR = 0;

private static final int ROYAL_FLUSH = 0;

private static final int STRAIGHT_FLUSH = 0;

private static final int FOUR_OF_A_KIND = 0;

private static final int THREE_OF_A_KIND = 0;

private static final int STRAIGHT = 0;

private static final int FLUSH = 0;

private int rankCount[];

private Hand hand;

private int count;

public CountRank(Hand h) {

hand = h;

rankCount = new int[15];

count = 15;

for (int i = 0; i < 15; i++) {

rankCount[i] = 0;

}

for (Card card : h.cards) {

rankCount[card.getRank()] += 1;

}

}

public boolean fourOfAKind() {

for (int i = 2; i < count; i++) {

if (rankCount[i] == 4) {

return true;

}

}

return false;

}

private int countPairs() {

int p = 0;

for (int i = 2; i < count; i++) {

if (rankCount[i] == 2) {

p++;

}

}

return p;

}

public boolean noPair() {

return true;

}

public boolean onePair() {

if (countPairs() == 1) {

return true;

}

return false;

}

public boolean twoPair() {

if (countPairs() == 2) {

return true;

}

return false;

}

public boolean threeOfAKind() {

for (int i = 2; i < count; i++) {

if (rankCount[i] == 3) {

return true;

}

}

return false;

}

public boolean Straight(int min, int max) {

for (int i = min; i <= max; i++) {

if (rankCount[i] != 1) {

return false;

}

}

return true;

}

public boolean Flush() {

if (hand.getCard(0).getSuit() == hand.getCard(1).getSuit()) {

if (hand.getCard(0).getSuit() == hand.getCard(2).getSuit()) {

if (hand.getCard(0).getSuit() == hand.getCard(3).getSuit()) {

if (hand.getCard(0).getSuit() == hand.getCard(4).getSuit()) {

return true;

}

}

}

}

return false;

}

public boolean FullHouse() {

boolean isOnePair = onePair();

boolean isThreeOfAKind = threeOfAKind();

if (isOnePair == true && isThreeOfAKind == true) {

return true;

}

return false;

}

public boolean straightFlush() {

int suit = hand.cards.get(0).getSuit();

for (Card c : hand.cards) {

if (c.getSuit() != suit) {

return false;

}

}

for (int i = 2; i <= 10; i++) {

if (Straight(i, i + 4) == true) {

return true;

}

}

return false;

}

public boolean royalFlush() {

boolean isFlush = Flush();

if (isFlush == false) {

return isFlush;

}

if (Straight(10, 14) == true) {

return true;

}

return false;

}

public int category() {

int category = NO_PAIR;

if (royalFlush())

category = ROYAL_FLUSH;

else if (straightFlush())

category = STRAIGHT_FLUSH;

else if (fourOfAKind())

category = FOUR_OF_A_KIND;
else if (threeOfAKind()) 
category = THREE_OF_A_KIND; 
else if (straight()) 
	category = STRAIGHT; 
else if (Flush()) category = FLUSH;

return category;

}

private boolean straight() {
	return false;
}

class Hand {

public ArrayList<Card> cards;

// Uses an arraylist to represent a hand of 5 cards

public Hand() {

cards = new ArrayList<Card>(5);

}

public Hand(Card first, Card second, Card third, Card fourth, Card fifth) {

cards.add(first);

cards.add(second);

cards.add(third);

cards.add(fourth);

cards.add(fifth);

}

public Card getCard(int i) {

return cards.get(i);

}

public int category() {

return -1;

}

// Adds a card to the end of the hand

public void addCard(Card card) {

if (cards.size() != 5)

cards.add(card);

}

// Returns cards in a string format

public String toString() {

return cards.toString();

}

}

class Card {

// Instance variables

private final int rank;

private final int suit;

// Constant variables for suit names

private final static int CLUBS = 0;

private final static int DIAMONDS = 1;

private final static int HEARTS = 2;

private final static int SPADES = 3;

public Card(int rank, int suit) {

this.rank = rank;

this.suit = suit;

}

// Returns the rank

public int getRank() {

return this.rank;

}

// Sets the rank

public void setRank(int rank) {

rank = rank;

}

// Returns the suit

public int getSuit() {

return this.suit;

}

// Sets the suit

public void setSuit(int suit) {

suit = suit;

}

// Formats the card using unicode

public String toString() {

String out = " ";

// Uses unicode for each suit depending on the card

if (suit == CLUBS)

out += '\u2663'; // Unicode char for black club

else if (suit == DIAMONDS)

out += '\u2662'; // white diamond. Closest to red

else if (suit == HEARTS)

out += '\u2661'; // white heart

else if (suit == SPADES)

out += '\u2660'; // black spade

// If the rank is below 11, uses the actual number

if (rank < 11)

out += rank;

else if (rank == 11)

out += 'J';

else if (rank == 12)

out += 'Q';

else if (rank == 13)

out += 'K';

else

out += 'A';

return out;

}

}

}