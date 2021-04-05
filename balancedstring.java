package Hackerrank;
import java.util.*;

public class balancedstring {
	
		
		public static void main(String []argh)
		{
			Scanner sc = new Scanner(System.in);
			
			while (sc.hasNext()) {
				String input=sc.next();
	            //Complete the code
	            Stack<Character> s=new Stack<>();
	            boolean isb=true;
	            for(int i=0;i<(input.length());i++)
	            {
	                char ch=input.charAt(i);
	                if(ch=='{'||ch=='('||ch=='[')
	                {
	                    s.push(ch);
	                    isb=false;
	                    
	                    continue;
	                }
	                else
	                {
	                	if(s.isEmpty()==false)
	                	{
		                	if(ch==')'&&s.peek()=='(')
		                	{
		                		s.pop();
		                		isb=true;
		                	}
		                	else if(ch=='}'&&s.peek()=='{')
		                	{
		                		s.pop();
		                		isb=true;
		                	}
		                	else if(ch==']'&&s.peek()=='[')
		                	{
		                		s.pop();
		                		isb=true;
		                	}
		                	else
		                		isb=false;
		                }
	                	else
	                	{
	                		isb=false;
	                		break;
	                	}
	                }
	                
	               
	            }
	            
	            if(!s.isEmpty())
	            	isb=false;
	            System.out.println(isb);
			}
			
		}
	}






