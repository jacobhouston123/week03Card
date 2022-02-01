/*
 * 
 * 
 * 
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        // instance of Card
        Card nineClubs = new Card("Clbs", 9);
        // setting the suti
        nineClubs.setSuit("diamonds");
        Card threeSpades = new Card("Spades", 3);
    }
}
