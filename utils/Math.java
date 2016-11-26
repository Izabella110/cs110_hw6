package utils;
public class Math {
	public static int factorialRec (int x){
		if(x==0){
			return 1;
		}
        return x*factorialRec(x-1);
	}
	public static int factorialLoop(int x){
		int p = 1;
		for (int i = x; i > 0 ; i-- ) {
			p = p*i;					
		}
		return p;
	}
}