public class DeckDemo_DL {
    public static void main(String[] args) {
        //declare and create an array of 52 cards - name it deck
        Card[] deck = new Card[52];

        //populate deck with instances of the class card - making a complete deck of cards
        DeckMethods.populateDeck(deck);

        //print the array deck
        System.out.println("------------Original Deck-----------------");
        DeckMethods.printDeck(deck);

        //shuffle the array deck
        DeckMethods.shuffleDeck(deck);

        //print the array deck (which is now shuffled)
        System.out.println("------------Shuffled Deck-----------------");
        DeckMethods.printDeck(deck);

        //declare and create two arrays of Cards each of length 5 name one array player1 and the other player2
        Card[] player1 = new Card[5];
        Card[] player2 = new Card[5];

        //deal (by using the method pop) alternating cards from deck, adding them to the arrays player1 and player2 
        //you are dealing 5 cards to each player 
        //alternating between the players
        for (int i=0; i<5; ++i) {
            DeckMethods.appendCard(player1, DeckMethods.popCard(deck)); 
            DeckMethods.appendCard(player2, DeckMethods.popCard(deck)); 
        }
        //print the arrays player 1 and player2
        System.out.println("------------Player 1 Deck-----------------");
        DeckMethods.printDeck(player1);
        System.out.println("------------Player 2 Deck-----------------");
        DeckMethods.printDeck(player2);
        //sort the arrays player1 and player2 based on the int stored in the instance variable
        //you will have to create your own method for this
        //check search and sorting file from Canvas
        DeckMethods.bubbleSort(player1);
        DeckMethods.bubbleSort(player2);

        //print the arrays player1 and player2
        System.out.println("------------Player 1 Deck-----------------");
        DeckMethods.printDeck(player1);
        System.out.println("------------Player 2 Deck-----------------");
        DeckMethods.printDeck(player2);
    }//end main

    
        
}//end class
