

import java.util.Hashtable;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		System.out.println("Enter What You Want To Translate (LOWERCASE): ");
		Scanner scan = new Scanner(System.in); 
		String word =scan.nextLine(); 
		func(word); 
	}
	
	public static  void func(String word)
	{
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
		Hashtable<Character, String> code = new Hashtable<Character, String>(); 
		int start = 97; 
		for(int i=0; i<morse.length; i++)
		{
			code.put((char)start, morse[i]); 
			start++; 
		}
		
		
		for(int y =0; y<word.length(); y++)
		{
			if(word.charAt(y)!=' ')
			{
				String end = code.get(word.charAt(y)); 
				System.out.print(end+" ");
			}else
			{
				System.out.print(" ");
			}
			
		}
	}
}
                                                                      