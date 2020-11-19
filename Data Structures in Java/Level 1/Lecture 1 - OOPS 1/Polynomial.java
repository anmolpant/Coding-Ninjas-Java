package classes_and_objects;
	/* Signature of four required functions is given in the code. You can create other functions as well if you need.
	*  Also you should submit your code even if you are not done with all the functions. 
	*/

	// Main used internally is shown here just for your reference.
	/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int degree1[] = new int[n];
			for(int i = 0; i < n; i++){
				degree1[i] = s.nextInt();
			}
			int coeff1[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff1[i] = s.nextInt();
			}
			Polynomial first = new Polynomial();
			for(int i = 0; i < n; i++){
				first.setCoefficient(degree1[i],coeff1[i]);
			}
			n = s.nextInt();
			int degree2[] = new int[n];
			for(int i = 0; i < n; i++){
				degree2[i] = s.nextInt();
			}
			 int coeff2[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff2[i] = s.nextInt();
			}
			Polynomial second = new Polynomial();
			for(int i = 0; i < n; i++){
				second.setCoefficient(degree2[i],coeff2[i]);
			}
			int choice = s.nextInt();
			Polynomial result;
			switch(choice){
			// Add
			case 1: 
				 result = first.add(second);
				result.print();
				break;
			// Subtract	
			case 2 :
				 result = first.subtract(second);
				result.print();
				break;
			// Multiply
			case 3 :
				 result = first.multiply(second);
				result.print();
				break;
			}

		}
	  */


	public class Polynomial {
	    private int[] coeffa;
	    private int degree;
	    
	    
	    public Polynomial(){
	        coeffa = new int[5];
	        degree = -1;
	    }

		
		/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
		 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
		 *  is already present in the polynomial then previous coefficient is replaced by
		 *  new coefficient value passed as function argument
		*/
		public void setCoefficient(int degree, int coeff){
	        if (degree >= coeffa.length){
	            restructure(degree);
	        }
	        
	        coeffa[degree] = coeff;
	        
	        if (degree >= this.degree){
	            this.degree = degree;
	        }
			
		}
		
		// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
		public void print(){
			for(int i = 0; i<coeffa.length; i++){
	            if (coeffa[i]!=0){
	                System.out.print(coeffa[i] + "x" + i + " "); //check format of printing.
	            }
	        }
		}

		
		// Adds two polynomials and returns a new polynomial which has result
		public Polynomial add(Polynomial p){
	        
	        Polynomial x = new Polynomial();
	        
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        
	        while(i<p.coeffa.length && j<this.coeffa.length){
	            x.setCoefficient(k, p.coeffa[i] + this.coeffa[j]);
	            k++;
	            i++;
	            j++;
	        }
	        
	        while (i<p.coeffa.length){
	            x.setCoefficient(k, p.coeffa[i]);
	            i++;
	            k++;
	        }
	        
	        while (j<this.coeffa.length){
	            x.setCoefficient(k, this.coeffa[j]);
	            j++;
	            k++;
	        }
	        
	        return x;
	        
		}
		
		// Subtracts two polynomials and returns a new polynomial which has result
		public Polynomial subtract(Polynomial p){
	        Polynomial x = new Polynomial();
	        
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        
	        while(i<p.coeffa.length && j<this.coeffa.length){
	            x.setCoefficient(k, p.coeffa[i] - this.coeffa[j]);
	            k++;
	            i++;
	            j++;
	        }
	        
	        while (i<p.coeffa.length){
	            x.setCoefficient(k, p.coeffa[i]);
	            i++;
	            k++;
	        }
	        
	        while (j<this.coeffa.length){
	            x.setCoefficient(k, -this.coeffa[j]);
	            j++;
	            k++;
	        }
	        
	        return x;
				
		}
		
		// Multiply two polynomials and returns a new polynomial which has result
		public Polynomial multiply(Polynomial p){
	        
	        Polynomial x = new Polynomial();
	        
	        for(int i = 0; i<p.coeffa.length;i++){
	            for(int j = 0; j<this.coeffa.length; j++){
	                if (i+j<=x.degree){
	                    x.setCoefficient(i+j, x.coeffa[i+j] + p.coeffa[i] * this.coeffa[j]);
	                    
	                }
	                
	                else{
	                    x.setCoefficient(i+j, p.coeffa[i] * this.coeffa[j]);
	                }
	            }
	        }
	        
	        return x;
	        
	        
			//return p;
		}
	    
	    private void restructure(int degree){
	        int[] temp = coeffa;
	        coeffa = new int[degree+1];
	        for(int i = 0; i<temp.length; i++){
	            coeffa[i] = temp[i];
	        }
	    }

	}

