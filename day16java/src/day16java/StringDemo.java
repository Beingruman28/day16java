package day16java;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st string example
      String s = "hello";
     System.out.println("print 1st String: " + s);
     System.out.println("Length of 1st String : "+ s.length());
      
     // 2nd string example
     String s1 = new String("  World");
     System.out.println("Print 2nd String :" + s1);
     
     //3rd string example
     String s2 = (s + s1);
      System.out.println("the concat string is :" + s2);    
	
      //4th string example
      String s3 = s.concat(s1);
      System.out.println("the concat string is :" + s3);  
      
      String s4 = String.join("",s1,s+2);  
      System.out.println("the concat string using join is :" + s4);   
      
      //5th string example
      String s5 = "Welcome";
      String s6 = "Programmers";
      String s7 = "welcome";
      String s8 = "Welcome";
      //equals()
      System.out.println(s5.equals(s7));   
      System.out.println("the strings are equal :" + s5.equals(s8) );
      //== operator
      System.out.println(s6==s7);   
     //compareTo
      System.out.println(s5.compareTo(s8));//0  
      System.out.println(s7.compareTo(s6));//1(because s1>s3)  
      System.out.println(s8.compareTo(s7));//-1(because s3 < s1 )  
      
      ////6th string example
      String s100 = "SachinTendulkar";    
      System.out.println("Original String: " + s100);  
      System.out.println("Substring starting from index 6: " +s100.substring(6)); //Tendulkar    
      System.out.println("Substring starting from index 0 to 6: "+s100.substring(0,6));  //Sachin  
      }  
      
	}
