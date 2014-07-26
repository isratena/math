 package math;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// finding prime numbers
		System.out.println("Find Prime numbers:");
				int counter=0;
				for(int i=2; i<1000; i++){  //outer loop
					for(int j=1; j<=i; j++){ //inner loop
						if(i%j==0){
							counter++;
						} //first if end
						
					} //inner loop end
					
					if(counter<=2){
						System.out.print(i + " ");
					} //second if end
				    counter = 0;
					
				} //outer loop end

			} //main method end

		}

	
		

	


