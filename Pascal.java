import java.util.*;
import java.io.*;

public class Pascal{

	int[][] a;
	int maxRows=9;
	
	public void run(){
		createRagged();
		StoreValues();
		display();	
		
	
	}
	
	public void createRagged(){
		a=new int[maxRows+1][];
		for(int row=0;row<maxRows;row++){
			a[row]=new int[row+1];	
		}	
	
	}
	
	public void StoreValues(){
		for(int row=0;row<maxRows;row++){
			for(int col=0;col<a[row].length;col++){
				if((col==0) || (col==row)){
					a[row][col]=1;
				}
				else{
					a[row][col]=a[row-1][col-1]+a[row-1][col];
				}
			}
		}	
	
	}
	
	public void placeLeading(int num,int max){
		int noOfSpaces=max-num;
		for(int i=0;i<noOfSpaces;i++){
			System.out.print("\t");
		}
	}
	
	public void display(){
		for(int i=0;i<maxRows;i++){
			placeLeading(i,maxRows);
			for(int j=0;j<a[i].length;j++){
				System.out.print("\t"+a[i][j]+"\t");
			}
			System.out.println("");
		}
	
	}
	
	public static void main(String[] args){
			Pascal a=new Pascal();
			a.run();
	}
	





















}
