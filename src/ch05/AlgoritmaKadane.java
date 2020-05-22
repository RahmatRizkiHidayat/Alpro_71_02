package ch05;

public class AlgoritmaKadane{
		int[] arr1 = {-2, -5, 6, -2, -3, 1, 5, -6};
		int[] arr2 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
	public int kandane(int[] arrA) {
		int max_end_here = 0;
		int max_so_far = 0;
		for (int x = 0; x < arrA.length; x++) {
			max_end_here += arrA[x];
			if (max_end_here < 0) {
				max_end_here = 0;
			}
			if (max_so_far < max_end_here) {
				max_so_far = max_end_here;
			}
		}
		return max_so_far;
	}
	public int KandaneModify(int[] arrA) {
		int max_end_here = arrA[0];
		int max_so_far = arrA[0];
		for(int x=1;x<arrA.length;x++){
			max_end_here = Math.max(arrA[x], max_end_here+arrA[x]);
			max_so_far = Math.max(max_so_far,max_end_here);
		}
		return max_so_far;
	}	
	public void cetak(){
		for (int x = 0; x < arr1.length ; x++ ) {
			System.out.print(arr1[x]+", " );

		}
	}
	public void cetak2(){
		for (int x = 0; x < arr2.length ; x++ ) {
			System.out.print(arr2[x]+", " );

		}
	}
}