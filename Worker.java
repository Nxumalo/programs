import java.io.*;

public class Worker{
	public String name;
	public int SalaryRate;
	public double pay=0;
	public int hours;


	public Worker (){
		name="No name yet";
		SalaryRate=0;
	
	}
	public Worker(String WorkerName,int wSalaryRate ){
		name=WorkerName;
		SalaryRate=wSalaryRate;

	}

	public void setName(String newName){
		name=newName;
		
	
	}

	public void setSalaryRate(int Rate){
		SalaryRate=Rate;
	
	}

	public String getName(){
		return name;
		
	}

	public int getRate(){
		return SalaryRate;
	}
	public void computePay(int hour){
		
		hours=hour;
		
		pay=40*SalaryRate;

		//return pay;
	}
	public void writeOutput(){
	
		System.out.println("Name: "+name );
		System.out.println("Salary rate/hour: "+ SalaryRate );
		System.out.println("hours worked: "+hours);
		System.out.println();
	}
}
