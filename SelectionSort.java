import java.util.*;
import java.io.*;

public class SelectionSort{

	public static int[] array={9,8,7,6,5,4,3,2,1};

	public static void main(String[] args){
		
		for(int i=0;i<array.length;i++){
			int minimum=i;

			for(int j=i;j<array.length;j++){
				if(array[minimum]>array[j]){
					for(int k=0;k<array.length;k++){
						System.out.print(array[k]);
	
					}
					System.out.println("");

					minimum=j;


				}


			}
			swap(i,minimum);



		}

		for(int k=0;k<array.length;k++){
			System.out.print(array[k]);
	
		}
		System.out.println("");



	}

	public static void swap(int indexOne,int indexTwo){

		int temp=array[indexOne];
		array[indexOne]=array[indexTwo];
		array[indexTwo]=temp;

	}



















}
