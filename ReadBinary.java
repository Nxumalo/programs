import java.util.*;
import java.io.*;

public class ReadBinary{


	public static void main(String[] args){
		String fileName="numbers.dat";
		ObjectInputStream inputStream;

		try{
	
			inputStream=new ObjectInputStream(new FileInputStream(fileName));
			int theInt=inputStream.readInt();

			while(theInt>=1){
				System.out.println(theInt);
				theInt=inputStream.readInt();

			}
			inputStream.close();
		}catch(FileNotFoundException e){
			System.out.println("Something happened as you can see");
			System.exit(0);

		}catch(IOException e){
			System.out.println("Embarrasments can be inevitable ");
			System.exit(0);

		}

	}






}
