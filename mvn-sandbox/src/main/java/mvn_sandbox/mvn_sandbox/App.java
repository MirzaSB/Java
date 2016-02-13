package mvn_sandbox.mvn_sandbox;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String example = "how do we get each of these words";
        String[] res1 = example.split("");
        
        String description = "Want to be famous? Simply tweet "
                + "about Java and use the hashtag #treet. "
                + "I'll use your tweet in a new @treehouse "
                + "course about data structures.";
        String[] res2 = description.split("[^\\w#@']+");
        
    }
}
