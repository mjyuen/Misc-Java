/* Program explores various Hashtable functions for practice */
/* Key is the author and the value is a book they've written */
/* By Michelle Yuen */

import java.util.Hashtable;

public class LitPractice 
{
    public static void main(String[] args)
    {
        //String bookValue; // name of the book is a value
        //String authorKey; // key is the author's last name
        
        // Create the hashtable
        Hashtable<String, String> hTable = new Hashtable<String, String>();
        
        // Add various pairs
        hTable.put("Achebe", "Things Fall Apart");
        hTable.put("Austen", "Emma");
        hTable.put("Eliot", "Middlemarch"); // using Evans' pseudonym
        hTable.put("Dickens", "Oliver Twist");
        hTable.put("Sewell", "Black Beauty");
        hTable.put("Garcia Marquez", "One Hundred Years of Solitude");
        hTable.put("Wells", "The Invisible Man");
        hTable.put("Ellison", "Invisible Man");
        hTable.put("Fitzgerald", "This Side of Paradise");
        
        System.out.println(hTable.get("Fitzgerald"));
        System.out.println("The size of the hashtable is: " + hTable.size());
        System.out.println(hTable.toString());
    }
}