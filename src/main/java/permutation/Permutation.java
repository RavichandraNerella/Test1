package permutation;

public class Permutation {

	
	public void permute(String str,int l, int r){
		
		    if (l == r) 
	            System.out.println(str); 
	        else { 
	            for (int k = l; k <= r; k++) { 
	                str = swap(str, l, k); 
	                permute(str, l + 1, r); 
	                str = swap(str, l, k); 
	            } 
	        } 
		
		
		
	}
	
	public String swap(String x , int i, int j){
		
		char[] t = x.toCharArray();
		
		char temp = t[i];
		t[i] = t[j];
		t[j] = temp;
		String z="";
		
		for(int k =0; k<x.length();k++){
			z= z + t[k];
		}
		
		return z;
		
	}
	
	
	public static void main(String[] args) {

	String str = "abc";
	
	Permutation pt = new Permutation();
	
	pt.permute(str,0,str.length()-1);
		
		
		
	
	
	}

	
}
