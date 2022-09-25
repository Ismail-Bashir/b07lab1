import java.util.Arrays;

//import java.util.Arrays;

import java.lang.Math;

public class Polynomial {
	
	
	
	

	public double[] coefficients;
	
	
	public Polynomial() {
		
	
	   double[] array= {0,0,0,0,0,0,0};
	   
	   this.coefficients=Arrays.copyOf(array,array.length);
		
		
	}


	public Polynomial(double[] array){

	       this.coefficients=Arrays.copyOf(array,array.length);
	       
	       
	}


	public Polynomial  add(Polynomial p){
    Polynomial p2=new Polynomial();
	for(int i=0;i<p.coefficients.length;i++){

	p2.coefficients[i]+=p.coefficients[i];
	}

	
	for(int i=0;i<this.coefficients.length;i++) {
		
		
    p2.coefficients[i]+=this.coefficients[i];
		
		
	}
	return p2;
	
	
	}

	public double evaluate(double x){


	int lengthPolynomial=this.coefficients.length;
	double sum=0.0;

	for(int i=0;i<lengthPolynomial;i++){

	sum+=this.coefficients[lengthPolynomial-i-1]*Math.pow(x,(lengthPolynomial-i-1));



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
	
	
	
	
	
	

}