package com.ordo.codingExercise;


public class WordReverser {

	
	
	public static String reverseWords(String input)
	{		
		if(input == null)
		return "String is null";
		
		String temp[];
		StringBuilder strbuilder = new StringBuilder();				
		temp = input.split(" ");
		int tempLength = temp.length;
		
		for(int i = 0; i<tempLength;i++)
		{
			strbuilder.append(reverse(temp[i]));
			if(i!=tempLength-1)
			strbuilder.append(" ");
			
		}	
		return strbuilder.toString();
				
	}
	
	public static String reverse(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
	
	
}
