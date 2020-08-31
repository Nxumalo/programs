import java.io.*;



public class StudentRecord{

	String name;
	String studentNo;
	double[] mark=new double[3];
	double average=0;
	
	public StudentRecord(){
		name="No name yet";
		studentNo="no student number yet";
		


	}
	
	public StudentRecord(String initName, String initStudentNo, double test1, double test2,double test3){
			name=initName;
			studentNo=initStudentNo;
			setTestMrk(1, test1);
			setTestMrk(2, test2);
			setTestMrk(3, test3);




	}
	
	public String getName(){
		return name;	
	}
	
	public String getStudentNo(){

		return studentNo;
	}

	public double getAve(){

		return average;
	}

	public  double getTstMrk(int testNo){

		return mark[testNo-1];
	}

	public void setTestMrk(int testNo, double mrk){
		mark[testNo-1]=mrk;
	}
	
	
	public double computeAve(){

		double sum=0;
		for(int i=0;i<mark.length;i++){
			sum=sum+mark[i];

		
		}
		
		average=sum/mark.length;
		return average;

	}
	
	public void run(){

		System.out.println("Name : "+getName());
		System.out.println("Student number: "+ getStudentNo());
		computeAve();
		System.out.println("Test 1 mark: "+ getTstMrk(1));
		System.out.println("Test 2 mark: "+ getTstMrk(2));
		System.out.println("Test 3 mark: "+ getTstMrk(3));
		System.out.println("Average obtained: "+ getAve());
	
	}
	
	public static void main(String[] args){
		StudentRecord[] a = new StudentRecord("Bruce Nyoni","3459233",100,88,98);
		a.run();
	
		
	
	
	}


}
