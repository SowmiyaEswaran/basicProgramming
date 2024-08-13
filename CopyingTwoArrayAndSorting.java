package basicPrograms;

import java.util.Arrays;

public class CopyingTwoArrayAndSorting {

	public static void main(String[] args) {
		int[] a = {3,2,8,-12};
		int[] b = {1,0,-4,22,9};
		
		int[] c= new int[a.length + b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		Arrays.sort(c);
		
		System.out.println("output;"+ Arrays.toString(c));
	}

}
