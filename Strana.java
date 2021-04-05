//check anachk function condition for anagram


package Hackerrank;
import java.util.*;

public class Strana {
	
	public static boolean anachk(String s1,String s2)
	{
		boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        return status;
	}
	public static List<String> queryaccept()
	{
		List<String> ls=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total queries:");
		int x=sc.nextInt();
		System.out.println("Enter values:");
		while(x>0)
		{
			String s=sc.next();
			s=s.toLowerCase();
			ls.add(s);
			x--;
		}
		return ls;
	}
	public static List<String> dictionaccept()
	{
		List<String> ls=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total dictionary variables:");
		int x=sc.nextInt();
		System.out.println("Enter values:");
		while(x>0)
		{
			String s=sc.next();
			s=s.toLowerCase();
			ls.add(s);
			x--;
		}
		return ls;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> d=dictionaccept();
		List<String> q=queryaccept();
		List<Integer> val= new LinkedList<>();
		for(int i=0;i<q.size();i++)
		{
			int v=0;
			for(int j=0;j<d.size();j++)
			{
				if(anachk(q.get(i),d.get(j))==true)
				{
					v++;
				}	
			}
			val.add(v);
		}
		System.out.println(val);
	}

}
