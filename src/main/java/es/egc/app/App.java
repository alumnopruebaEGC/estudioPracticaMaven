package es.egc.app;
import org.apache.log4j.*; 
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    static Logger log=Logger.getLogger(App.class); 
    
        
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        log.info("Returning 1");
        List<String> myList =
        Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
    	.stream()
    	.filter(s -> s.startsWith("c"))
    	.map(String::toUpperCase)
    	.sorted()
    	.forEach(System.out::println);
        
    }
    
     public static int getVal(){
     	return 1;
     }
     
     
     
}
