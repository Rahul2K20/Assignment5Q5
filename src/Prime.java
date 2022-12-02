public class Prime {
public boolean isPrime(int number) {
	 
 boolean prime = false; 
 for(int i=2; i<=number/2; ++i) {
	 if(number%i==0) {
		 prime = true;
		 break;
	 }
 }
 if (!prime) {
	 return true;
 }
 else {
	 return false; 
 }
}
}


