package javaday3;

public class Largest2ndElementArray {

	public static int Largest2nd_Element(int[] a, int total) {
		// TODO Auto-generated method stub
		
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+ Largest2nd_Element(a,6));  
		System.out.println("Second Largest: "+ Largest2nd_Element(b,7));  
		}

}
		
