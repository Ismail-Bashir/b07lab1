import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import java.lang.String;


//import java.util.Arrays;

import java.lang.Math;

public class Polynomial {
	
	
	
	

	public double[] coefficients=new double[20];
	public int[] exponents=new int[20];
	//public File myFile;
	
	
	public Polynomial() {
		
	
	   double[] array= {0,0,0,0,0,0,0};
	   
	   this.coefficients=Arrays.copyOf(array,array.length);
		
		
	}


	public Polynomial(double[] coefficients,int[] exponents){

	       this.coefficients=Arrays.copyOf(coefficients,coefficients.length);
	       this.exponents=Arrays.copyOf(exponents,exponents.length);
	       
	       
	}
	public Polynomial(File myFile) throws IOException {
		
		File newFile=myFile;
		
		BufferedReader br= new BufferedReader(new FileReader(newFile));
		
		
		String myString=br.readLine();
		
		String[] aString=myString.split("[+-]");
		
		
		
		for(int i=0;i<aString.length;i++) {
			
			if(aString[i].length()==1) {
				
				this.coefficients[i]=Double.parseDouble(aString[i]);
				this.exponents[i]=0;
			}
			
			if(aString[i].length()>0) {
				
				this.coefficients[i]=aString[i].charAt(1);
				this.exponents[i]=aString[i].charAt(2);
				
				
			}
		}
		 
		
		
		
		
		
		
		
	}
	
	
	


	public Polynomial  add(Polynomial p){
		
		
		
    //Polynomial p2=new Polynomial();
    
    ArrayList<Double> tempCoeff=new ArrayList<Double>();
    ArrayList<Integer> tempExpon=new ArrayList<Integer>();
    
    
	for(int i=0;i<p.coefficients.length;i++){

	if(this.exponents[i]==p.exponents[i]) {
		
		
		tempCoeff.add(p.coefficients[i]+this.coefficients[i]);
		tempExpon.add(p.exponents[i]+this.exponents[i]);
	}
	if(this.exponents[i]>p.exponents[i]) {
		
		tempCoeff.add(p.coefficients[i]);
		tempExpon.add(p.exponents[i]);
		tempCoeff.add(this.coefficients[i]);
		tempExpon.add(this.exponents[i]);
	}
	
	else {
		tempCoeff.add(this.coefficients[i]);
		tempExpon.add(this.exponents[i]);
		tempCoeff.add(p.coefficients[i]);
		tempExpon.add(p.exponents[i]);
	
	
	}}
    double[] myArray=new double[tempCoeff.size()];
    int[] myArray2=new int[tempCoeff.size()];
	
	for(int i=0;i<tempCoeff.size();i++) {
		
		
    myArray[i]=tempCoeff.get(i);
    myArray2[i]=tempExpon.get(i);
    
    
		
		
	}
	Polynomial p2= new Polynomial(myArray,myArray2);
	return p2;
	
	
	}

	public double evaluate(double x){


	int lengthPolynomial=this.coefficients.length;
	double sum=0.0;

	for(int i=0;i<lengthPolynomial;i++){

	sum+=this.coefficients[i]*Math.pow(x,this.exponents[i]);



	}
	return sum;

	}


	public boolean hasRoot(double y){


	double temp=this.evaluate(y);

	if(temp==0.0){
	return true;


	}
	else{
	return false;

	}


	}
	
public Polynomial multiply(Polynomial p) {	
	
	 
	 int x=p.coefficients.length;
	 int y=this.coefficients.length;
	 
	 
	 
	 int size;
	
	  if(x>y) {
		  
		 size=y; 
		  
	  }
	  else {
		  
		  size=x;
		  
		  
	  }
	
	 ArrayList<Double> myCoeff= new ArrayList<Double>();
	 ArrayList<Integer> myExpon=new ArrayList<Integer>();
	 
	
	for(int i=0;i<size;i++) {
		
	  for(int k=0;k<size;k++) {	
		  
		  
		  if(p.coefficients.length<this.coefficients.length) {
			
			myCoeff.add(p.coefficients[i]*this.coefficients[k]);
			myExpon.add(p.exponents[i]*this.exponents[k]);
			
			}}}
	   double[] coeffArray=new double[size*2];
	   int[] exponArray=new int[size*2];
	  
	  for(int i=0;i<myExpon.size();i++) {
		  double sumCoeff=0;
		  int sumExpon=0;
		  int temp=myExpon.get(i);
		  for(int z=0;z<myExpon.size();z++) {
			  
			  if(myExpon.get(z)==temp) {
				  
				sumCoeff+=  myCoeff.get(i)+myCoeff.get(z);
				sumExpon+=myExpon.get(i)+myCoeff.get(z);
				  
				  }
		  }
		  
		  coeffArray[i]=sumCoeff;
		  exponArray[i]=sumExpon;
		  
		  
		  
	  }
	  
	  Polynomial newPolynomial=new Polynomial(coeffArray,exponArray);
	  
	  
		
	return newPolynomial;	
		
		
	}

public void saveTofile(String fileName) throws IOException {
	
	BufferedWriter br=new BufferedWriter(new FileWriter("fileName"));
	
	for(int i=0;i<coefficients.length;i++) {
		
		br.write(coefficients[i]+"x");
		br.write(exponents[i]);
		
		
	}
	
	br.close();
	
	
}


public double[] getCoefficients() {
	return coefficients;
}


public void setCoefficients(double[] coefficients) {
	this.coefficients = coefficients;
}


public int[] getExponents() {
	return exponents;
}


public void setExponents(int[] exponents) {
	this.exponents = exponents;
}



      //return newPolynomial;
	
	
	
	}
	
	
