package ch07;

public class AlgoritmaBlocks {
	int [] arr = new int [] {82,12,41,38,19,26,9,48,20,55,8,32,3};     
    int temp = 0;

    public void cetak(){
    	System.out.print(" Array Yang Dimasukan : ");    
        for (int x = 0; x < arr.length; x++) {     
            System.out.print(arr[x] + ", ");    
        }    
            
            
        for (int x = 0; x < arr.length; x++) {     
            for (int y = x+1; y < arr.length; y++) {     
               if(arr[x] < arr[y]) {    
                   temp = arr[x];    
                   arr[x] = arr[y];    
                   arr[y] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
                
        System.out.print("\n Urutan Array Setelah Di Block Sort : ");    
        for (int x = 0; x < arr.length; x++) {     
            System.out.print(arr[x] + ", ");    
        }
        	System.out.println();    
    }
}