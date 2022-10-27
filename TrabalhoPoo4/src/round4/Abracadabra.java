package round4;

public class Abracadabra {

	public static void main(String[] args) {
		int par=0;
		int impar=0;
		int A[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<A.length;i++) {
			if(A[i] % 2==0) {
				par++;
				
			}else {
				impar++;
			}
		}
		System.out.println("Percentual de pares:"+par*100/100+"0%.\nPercentual de impares:"+impar*100/100+"0%.");

	}

}
