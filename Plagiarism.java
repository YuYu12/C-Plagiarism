import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * work with download group
 */
public class Plagiarism{
	private String tokens;
	private BigInteger intSimHash;
	private String strSimHash;
	private int hashbits = 64;
	public Plagiarism(String tokens) throws IOException{
		this.tokens = tokens;
		
		
		
	}
	public Plagiarism(String tokens, int hashbits) throws IOException{
		this.tokens = tokens;
		this.hashbits = hashbits;
		
		
		
		
	}		
	HashMap<String, Integer> wordMap = new HashMap<String,Integer>();
	
	public BigInteger plagiarism() throws IOException{
		int[] v= new int[this.hashbits];
		
		
		
	
		
	}
	public static void main(String[] args) throws IOException{
		    
	}
}