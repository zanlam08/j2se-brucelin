package com.how2java;
import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class App 
{
	 public static String[]  numlist2strlist(int[] number_list) { 
	 	// combine two string by  full connection
	 	
    	String[] return_str={"null"};
    	        

    	if( number_list.length >1) {
    		int int_length=number_list.length;
    		int[] right_list = new int[int_length-1];
    		System.arraycopy(number_list, 1, right_list, 0, int_length-1);
    		
    		int[] left_list = {number_list[0]};
    		//left_list[0]=;
    		
    		String[] array_str_right=numlist2strlist(right_list);
    		String[] array_str_left=numlist2strlist(left_list);
    		
    		int total_string_number=array_str_left.length * array_str_right.length;
    		return_str=new String[total_string_number];
    		
    		for(int i =0 ;i <array_str_left.length;i++)
    		  for(int j =0 ; j<array_str_right.length;j++) {
    		  	return_str[i*array_str_right.length +j] = array_str_left[i]+array_str_right[j];
    		  }    		    
      }
      else {
      	  digi2Letter Array_One=new digi2Letter(number_list[0]);
          String[] Letter_list=Array_One.getLetter();
//          System.out.println(Arrays.toString(Letter_list));

          if (Letter_list.length >1) {
          	return_str=Letter_list;
          }
    
      }
      System.out.println("Output=£º"+Arrays.toString(return_str));

      return return_str;

     } 
    

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        digi2Letter Array_One;
       /* for (int i=0, n=11; i < n; i++) {
        
          Array_One=new digi2Letter(i);
          char[] Letter_list=Array_One.getLetter();
          if (Letter_list.length >0) {
           System.out.println(i);
           System.out.println(Letter_list.length);
           System.out.println(Letter_list);
          }
        }
        */
        int[] arr={9,2,3};
        
        if(args.length>1) {
         arr=new int[args.length];
         for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(args[i]);
         }
        }
         
        System.out.println("Input=£º"+Arrays.toString(arr));
        numlist2strlist(arr); //translation function 
        	
        
    }   
}


class digi2Letter {   //mapping digital number 2-9 to Character Array
	public	 String[] Array_str;	

	public digi2Letter() {
		
  }
	public  digi2Letter(int digital) {
		 //char[] Array_chr={'0'};	

		 //Arrays.fill(Array_chr, 0, 0, '0');

		 if (digital>9 || digital<2) {
			System.out.println( "illegal Digital Input" );
			//Arrays.fill(Array_chr, 0, 0, Temp_Char);
		  Array_str= new String[1];
		  Array_str[0]="null";

	   }
		
		if (digital>1 && digital<7) {
			
			 int char_1=65+(digital-2)*3;
			 int char_2=char_1+1;
			 int char_3=char_1+2;
			  Array_str=  new String[3];
			  Array_str[0]=String.valueOf((char)char_1);
			  Array_str[1]=String.valueOf((char)char_2);
			  //(char)char_2;
			  Array_str[2]=String.valueOf((char)char_3);
			  //			  (char)char_3;	 
	      	     
	  }
	  if (digital==9) {
	   	 String array_1[]={"W","X","Y","Z"};
	     Array_str=array_1;
	  }
	  if (digital==7) {
	   	 String array_1[]={"P","Q","R","S"};
	     Array_str=array_1;
	  }
    if (digital==8) {
	   	 String array_1[]={"T","U","V"};
	     Array_str=array_1;
	  } 
		// return Array_chr;
  }
  public String[] getLetter(){
   return	Array_str;
  }
}