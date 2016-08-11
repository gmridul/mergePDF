package com.pdf.mergePDF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.pdf.commons.PDFUtils;

public class App {
    public static void main( String[] args ) {
		try {
			ArrayList<String> inputFiles = new ArrayList<String>();
	    	for(int i = 0; i < args.length-1; i++) {
	    		inputFiles.add(args[i]);
	    	}
	        
	    	PDFUtils.mergePDF(inputFiles, args[args.length-1]);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Unable to merge documents");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("At least 2 parameters required\n"
					+ "Parameters : FileToMerge1 FileToMerge2 ... FileToMergeN OutputFile");
		}
    }
}
