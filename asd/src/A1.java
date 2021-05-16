package asd.src;
import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
		int[] array1 = {2,1,4,7,9,0,5,7,3,8};
		Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
		String[] array2 = {"acd", "dwe", "cer","byi"};
		int size = array2.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < array2.length; j++) {
				if (array2[i].compareTo(array2[j]) > 0) {
					String temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
		}
        System.out.println(Arrays.toString(array2));
	}
}
