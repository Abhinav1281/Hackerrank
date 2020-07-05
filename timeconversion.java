package Hackerrank;
import java.util.*;

public class timeconversion {
	
	public static void convert(String s) throws Exception
	{
	      String s1="",s2="",m1="";
          int h=0,i=0,m=0,sec=0;
          for(i=0;i<(s.length());i++)
          {
              if(s.charAt(i)==':'){
                  i++;
                  break;
              }
              s1+=s.charAt(i);
              
          }
          h=Integer.parseInt(s1);
          s1="";
          
          for(;i<(s.length());i++)
          {
              if(s.charAt(i)==':'){
                  i++;
                  break;
              }
              s1+=s.charAt(i);
              
          }
          m=Integer.parseInt(s1);
          s1="";
          
          for(;i<(s.length()-2);i++)
          {
              if(s.charAt(i)==':'){
                  i++;
                  break;
              }
              s1+=s.charAt(i);
          }
          sec=Integer.parseInt(s1);
          s1="";
          if(h>=1 && h<=12)
          {
              if(m>=0 && m<=59)
              {
                  
                  m1=Integer.toString(m);
                  if(m<10)
                      m1="0"+m1;    
                  if(sec>=0 && sec<=59)
                  {
                      String sec1=Integer.toString(sec);
                      if(sec<10)
                          sec1="0"+sec1;   
                      s1+=s.charAt(s.length()-2);
                      s1+=s.charAt(s.length()-1);
                      if(s1.equalsIgnoreCase("PM")){
                          h+=12;
                          if(h==24)
                              h=12;
                      }
                      if(s1.equalsIgnoreCase("AM")) {
                        if(h==12)
                            h=0;
                        }
                    String h1=Integer.toString(h);
                    if(h<10)
                        h1="0"+h;
                   s2=h1+":"+m1+":"+sec1;
                  }
              }
          }
          
          
      
          
      
		System.out.println(s2);
		
		
	}
	
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		System.out.println("Enter time=");
		String s=sc.next();
		convert(s);
		

	}

}
