import java.io.*;
/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>


This class is a subclass of ShapeBase class. It inherits methods from the super class and also overides some methodes. Its purpose however is to draw an arrow with a head facing the right direction. It has two constructors, two accessors and two mutators. The first constructor is to accomodate for no input and the second one is to accomodate with input. It takes in the number to set for the base of the arrow head, the lenght of the tail, the offset which tells it where to start drawing this arrow. It also takes in the lenght of the sides of the arrow head. 
*/
	
public class RightArrow extends ShapeBase{

	public int tail;				//sets the tail length
	public int base;				//sets the base lenght
	public int counter;				//sets the counter
	public int startOfLine = getBase();		//sets the startOfLine 
/**
This is the contructor which accomodates for no input from the user
sets tail lenght and base lenght to 0
*/	
	public RightArrow(){
		super();				//calls the super class with no attributes
		tail=0;					//sets tail to 0
		base=0;					//sets base to 0
		

	}
/**
This contructor takes in the offset, the tail lenght and  the base length. 
*/
	public RightArrow(int theOffset,int initTail,int initBase){
		super(theOffset);				//calls the super class with the offset attribute
		tail=initTail;					//sets tail length to lenght provided
		base=initBase;					//sets the base lenght to base provided
		


	}
/**
This is the set method for setTail
@param tailLen which is the lenght of the tail
*/	
	public void setTail(int tailLen ){
		tail=tailLen;					//sets tail to tailLen
		
	}
/**
The set method for the setBase
@param baselen which is the base length
*/	
	public void setBase(int baselen){
		base=baselen;					//sets base lenght to baselen

	}
/**
The get method for tail length
@return tail which is the tail length
*/
	public int getTail(){
		return tail;					//returns the tail length

	}
/**
The get method for Base length
@return base which is the base length
*/
	public int getBase(){
		return base;					//returns base
		
	}
/**
This method evolks the methods drawtop, drawbase and drawbottom which allows for the arrow to be drawn when required length are provided.
*/
	public void drawHere (){                     
		     	  
		drawTop ();  					//evolks drawTop
		drawBase (); 					//evolks drawBase
		drawBottom();					//evolks drawBottom
		     
              
	   //drawHorizontalLine ();    
    	}    
                  
	/**private void drawHorizontalLine (){
   
        skipSpaces (getOffset ());
        for (int count = 0 ; count < width ; count++)
            System.out.print ('-');
      	    System.out.println ();
    	}

	*/
/**
The drawBase method which draws the horizontal line or rather the tail of the arrow
*/	
	private void drawBase () {
   
        	//skipSpaces (getOffset ());
       		for (int count = 0 ; count < base ; count++){
        		System.out.print ('*');
             		
       		 }
		//counter=counter+startOfLine+4;
		//System.out.print('*');
		//System.out.println ();
		int last= getBase();
		int pro=last;
		skipSpaces(pro+2);
		System.out.print('*');
		System.out.println();
		/**startOfLine=getBase();
		counter=counter+startOfLine;
		skipSpaces(counter+3);
		System.out.println('*');*/
		
	}
/**
This method draws the Top of the arrow head. 
*/
	public void drawTop(){
	 
        //startOfLine == number of spaces to the
        //first '*' on a line. Initially set to the
        //number of spaces before the topmost '*'.
       int startOfLine = getBase();				//sets StartOfline to getBase
        skipSpaces (startOfLine);				//calls skipSpaces with attribute StartOfline
	//System.out.println(getBase());
	//System.out.println(startOfLine);
        System.out.println ('*'); //top '*'
        int lineCount = base / 2 - 1; //height above base
        //insideWidth == number of spaces between the
        //two '*'s on a line.
        int insideWidth = 1;
	counter=insideWidth;
        for (int count = 0 ; count < lineCount ; count++)    
        {                                                    
            //Down one line, so the first '*' is one more    
            //space to the left. 
	    boolean hey=true;
	    int k=startOfLine;
	                            
            startOfLine++; 						//increment start of line
	                                  
            skipSpaces (startOfLine);   				//adjast spaces                   
            //System.out.print ('*');                          
            skipSpaces (insideWidth);                        		//adjast spaces
            System.out.println ('*');                        		// draws more
           // Down one line, so the inside is 2 spaces wider.
            insideWidth = insideWidth + 2;  				//increments the inside width
	    counter=counter+2;                 				//increments the counter
        }                                                    
       }
/**
This method draws the bottom  of the arrow head.
*/
	public void drawBottom(){
		startOfLine=getBase();					//sets startOfLine to getBase()
		counter=counter+startOfLine;				//sets the counter
		//System.out.println(counter);
		//System.out.println(startOfLine);
		int endOfline=startOfLine;				//sets the end of the line
		skipSpaces(counter+2);					//adjust spaces
		System.out.println('*');				//draws
		int lineCounto=base/2-1;				//sets line count
		int insideWidtho=counter;				//sets inside width
		int thewidth=1;						//sets the width
		for (int i=0;i<lineCounto;i++){
			counter--;					//decrement the counter
			//skipSpaces(counter);
			//System.out.println('*');
			skipSpaces(insideWidtho);			//adjustspaces
			
			System.out.println('*');			//draws
			insideWidtho=insideWidtho-3;			//adjust inside width
			thewidth=thewidth+2;				//increment thewidth

		}
		System.out.println();


	}
/**
	 public void drawHere (){                         
                                                   
       		 for (int count = 0 ; count < offset ; count++){
           		 System.out.print (' ');                   
       			 System.out.println ('*');                     
   		 }                                                 
	}

*/
/**
This method sets the skip spaces which skips spaces required by user
*/	
       private static void skipSpaces (int number){
      
        	for (int count = 0 ; count < number ; count++){
              	  	System.out.print (' ');
      		 }	
      }

}







