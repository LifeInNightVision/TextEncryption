package com.code.apk;

//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;

import java.util.Random;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class StrByt{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		StrByt zeobject = new StrByt();

		System.out.println(zeobject.encoderMethod("I must admit, you have a good eye for and knowledge about encryption technologies"));		
		System.out.println(zeobject.decoderMethod("ViB6aGZnIG5xenZnLCBsYmggdW5pciBuIHRiYnEgcmxyIHNiZSBuYXEgeGFianlycXRyIG5vYmhn"
		+"IHJhcGVsY2d2YmEgZ3Jwdb7gCWFieWJ0dnJm"));
	}
	
	public String encoderMethod(String Plain){
		return toLevelTwo(rot(Plain));
	}
	
	public String decoderMethod(String EncryText){
		return rot(fromLevelTwo(EncryText));
	}
	
	private String rot(String input){
		String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            output = output + c;
        }
		return output;
	}
	
	private String toLevelTwo(String Plain){		
		String KeyStringE = "b7gC";
		String EncString = new BASE64Encoder().encode(Plain.getBytes());				

		Random rnumb = new Random();
		StringBuffer sb = new StringBuffer(EncString); //trying to either avoid using string buffers OR fixing the spacing issue
		String Final = sb.insert(rnumb.nextInt(EncString.length()), KeyStringE).toString();
		return Final;	
	}
	
	private String fromLevelTwo(String EncryText){
		String KeyStringD = "b7gC";
		String TheRightSize = EncryText.replace(KeyStringD, ""); 
	try {
		byte[] blah = new BASE64Decoder().decodeBuffer(TheRightSize);
		return new String(blah);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();	
	}
	return null;		
	}
	
	
	

}
