/* Program prints various Toni Morrison book names. Used for practice using
 * arraylists.
 * By Michelle Yuen
 */
import java.util.ArrayList;

public class ToniMorrisonBooks
{
    public static void main(String args[])
    {
        ArrayList<String> listToni = new ArrayList<String>();
        
        /* Add elements to the arraylist */
        listToni.add("The Bluest Eye");
        listToni.add("Beloved");
        listToni.add("Song of Solomon");
        listToni.add("Sula");
        listToni.add("A Mercy");
        listToni.add("Jazz");
        listToni.add("Recitatif");
        listToni.add("Tar Baby");
        listToni.add("God Help the Child"); // most recent published book
        
        System.out.println("The number of books in this list is: " + listToni.size());
        for (String b: listToni)
        {
            System.out.println(b + " by Toni Morrison");
        }
    }
}