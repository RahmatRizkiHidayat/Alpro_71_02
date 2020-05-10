package ch03;
import java.util.Scanner;

public class PembagiTerkecil{
	int a=3;
	int nilai;
	int terkecil;

	public int getNilai(){
		return nilai;
	}

	public void cetak(){
		while(a<=nilai){
			if (nilai%a==0) {
				terkecil=a;
            	System.out.println(terkecil+" Jadi pembagi terkecil selain 1 da 2 adalah"+nilai);
            	break;
			}else{
				a=a+1;
                	if(nilai%a==0){
                		terkecil=a;
                		System.out.println(terkecil+" Jadi pembagi terkecil selain 1 da 2 adalah "+nilai);
						break;
				}
			}a++;
		}
	}
}