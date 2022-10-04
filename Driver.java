



public class Driver{

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  Polynomial p = new Polynomial(); 
			  System.out.println(p.evaluate(3)); 
			  double [] c1 = {6,0,0,5};
			  int [] c2= {1,2,3,4};
			  Polynomial p1 = new Polynomial(c1,c2); 
			  double [] c3 = {4,5,6,2}; 
			  int [] c4 = {1,2,3,4};
			  
			  Polynomial p2 = new Polynomial(c3,c4); 
			  Polynomial s = p1.add(p2); 
			  System.out.println("s(0.1) = " + s.evaluate(0.1)); 
			  if(s.hasRoot(1)) 
			   System.out.println("1 is a root of s"); 
			  else 
			   System.out.println("1 is not a root of s"); 
			 Polynomial p3 =new Polynomial();
			  p3=p.multiply(p1);
			  
			  
				  
				  
				  
				  
			  }
			  
			  }