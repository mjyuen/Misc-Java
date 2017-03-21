/* Program prints out lines of "This Is Just To Say" by William Carlos Williams. 
 * By Michelle Yuen 
 */
import java.util.LinkedList;
import java.util.Scanner;

public class PlumPoem
{
    public static void main(String args[])
    {
        LinkedList<String> poem = new LinkedList<String>();
        
        poem.add("the plums");
        poem.add("that were in");
        poem.add("\nand which");
        poem.add("you were probably");
        poem.add("saving");
        poem.add("for breakfast");
        poem.add("\nForgive me");
        poem.add("they were delicious");
        poem.add("so sweet");
        poem.addFirst("I have eaten");
        poem.addLast("and so cold");
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Number of lines to print
        sc.close();
        if (num > poem.size())
        {
            System.out.println("Please type a number less than " + (poem.size() + 1));
        }
        
        System.out.println("This Is Just To Say");
        System.out.println("by William Carlos Williams\n");
        for (int i = 0; i < num; i++)
        {
            System.out.println(poem.pop());
        }
    }
}
        