/*
 * Check for balanced parentheses in a string.
 */
package brackets;

/**
 *
 * @author Ali
 */
import java.util.*;

public class Brackets 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println(brackets("([(((((((((())))))))))])"));
    }
    
    private static int brackets(String s)
    {
        if(s.isEmpty())
            return 0;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            
            else if((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && stack.empty())
                return 0;
            
            else if(s.charAt(i) == ')')
            {
                if(stack.pop() != '(')
                    return 0;
            }
            
            else if(s.charAt(i) == ']')
            {
                if(stack.pop() != '[')
                    return 0;
            }
            
            else if(s.charAt(i) == '}')
            {
                if(stack.pop() != '{')
                    return 0;
            }
        }
        
        if(stack.isEmpty())
            return 1;
        else
            return 0;            
    }
    
}
