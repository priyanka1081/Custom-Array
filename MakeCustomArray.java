package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakeCustomArray {
	
//	public int nextPalindrome(int num) {
//		int p=0;
//		int limit= Integer.MAX_VALUE;
//		
//		for(int i= num+1; i<limit; i++) {
//			
//			int r;
//			int sum=0;
//			int n= i;
//			
//			while(n>0) {
//				r=n%10;
//				sum= (sum*10)+r;
//				n/=10;
//			}
//			
//			if(i==sum) {
//				return i;
//			}
//		}
//		return p;
//	}
//	
//	public static void main(String[] args) {
//		demo d= new demo();
//		d.nextPalindrome(120);
//	}
	
	
	public static void main(String[] args) {
	       
		int[] arr1= {1, 2, 7, 4};
		String[] arr2= {"a", "b", "c", "d"};
		
		ArrayList<Integer> ar= new ArrayList<Integer>(Arrays.asList(1,2,3,4)) ;
		ar.add(3,7);
		ar.remove(2);
		
		ArrayList<Integer> ar2= new ArrayList<Integer>(Arrays.asList(1, 2, 7, 4)) ;
		
		System.out.println(ar);
		
		System.out.println(ar2.equals(ar));
		
		MyArray arr= new MyArray(4);
	System.out.println(arr.pushData(1));
	System.out.println(arr.pushData(2));
	System.out.println(arr.pushData(3));
	System.out.println(arr.pushData(4));
	
	System.out.println(arr.deleteData(3));
	System.out.println("***************");
	
	for(int k=0; k<3; k++) {
		System.out.println(arr.getData(k));
	}
		
//		int sum=8;
//		
//		demo d= new demo();
//		System.out.println(d.checkSum(arr1, sum));
//		
//		System.out.println(Math.pow(5, 200));
//		System.out.println(d.compareChars(arr1, arr2));
    }
	
//	public boolean compareChars(char[] arr1, char[] arr2) {
//		
//		
//		Map<String, Boolean> map1= new HashMap<String, Boolean>();
//		
//		for(int i=0; i<arr1.length; i++) {
//			if(!map1.containsKey(String.valueOf(arr1[i])))
//				map1.put(String.valueOf(arr1[i]), true);
//		}
//		
//		
//		for(int j=0; j<arr2.length; j++) {
//			if(map1.containsKey(String.valueOf(arr2[j]))) {
//				return true;
//			}
//		}
//		
//		return false;
//	}

	
	public boolean checkSum(int[] arr1, int sum) {
		
		int low= arr1[0];
		int high= arr1[arr1.length-1];
		
		while(low<high) {
			
		for (int i = 1; i < arr1.length; i++) {
			int check= low+high;
				//System.out.println(check);
				
				if(check==sum) {
					return true;
				}else if(check>sum) {
					high= arr1[arr1.length-(1 + i)];
				}else {
					low= arr1[i];
				}
			}
		}
		return false;
	}
	
	
	
}


class MyArray{
	private static int length=0;
	private int[] data;
	
	public MyArray(int size) {
		data= new int[size];
	}


	public Object getData(int index) {
		return this.data[index];
	}
	
	public int pushData(int item) {
		this.data[length]=item;
		length++;
		return length;
	}
	
	public int popData() {
		if(length>0) {
		this.data[length-1]=0;
		length--;
		}else {
			System.out.println("empty array");
		}
		return length;
	}
	
	public int deleteData(int index) {
		if(index<length && index!=length-1) {
			this.shiftItems(index);
			length--;
		}else if(index==length-1) {
			popData();
		}else {
			System.out.println("overflow index size");
		}
		return length;
	}
	
	public void shiftItems(int index) {
		for(int i=index; i<length; i++) {
			this.data[index]= this.data[index+1];
		}
		
	}
	
}




