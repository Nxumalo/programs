import javax.swing.JOptionPane;

public class MobileCost52 {
	public double priceSMS;
	public double priceDATA;
	public double ratio;
	public double pricePMB;
	public int im;
	public int mb=(1024*1024);
	public int CHAR_amount=140;
	private String inputSMS;
	public String input1;
	public String input2;
	private String inputMB;
	public String SMScost;
	public String MBcost;
	
	public void setPriceSMS(String priceS){
		inputSMS=priceS;
	}
	public String getSMSprice(){
		return inputSMS;
	}
	public void setPriceMB(String priceM){
		inputMB=priceM;
		
	}
	public String getPriceMB(){
		return inputMB;
	}
	
	public void userInputs(){
		
          input1=JOptionPane.showInputDialog("Please enter the price of an SMS");
          setPriceSMS(input1);
          
          		
          
          input2=JOptionPane.showInputDialog("Please enter the price of a MB");
          setPriceMB(input2);
          SMScost=getSMSprice().substring(1);
          MBcost=getPriceMB().substring(1);
          priceSMS=Double.parseDouble(SMScost);                        
  		  priceDATA=Double.parseDouble(MBcost);
	}
	public void computeNumIMs(){
		priceSMS=Double.parseDouble(SMScost);                        
		priceDATA=Double.parseDouble(MBcost);                        
		
                priceSMS=(priceSMS/priceDATA);                                  
                ratio=mb*priceSMS;                            
                pricePMB=ratio/CHAR_amount;	                                            
                im= (int) pricePMB; 
	}
	public void userOutput(){
		JOptionPane.showMessageDialog(null,"IM's you would send for that price= "+ im);
               System.exit(0);

	}
}
	
