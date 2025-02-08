package testunit;
import calc.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostfixParserTest {
	 	@Test
	    public void testInfixToPostfix() {
	 		postfixParser parser = new postfixParser(); 
	 		
	        parser.InfixToPostfix("3+5*2-8");
	        
	        assertEquals("352*+8-", parser.getPostfix()); 
	        
	        calculator calcul= new calculator("3+5*2-8");
	        assertEquals( "352*+8-" ,calcul.getStr());
	      assertEquals( 5 , calcul.calculate());
	    }
	 	
}
