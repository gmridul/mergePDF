package com.mridul.pdf.mergePDF;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

public class App {
	public static void main( String[] args ) {
		try {
	    	PDFMergerUtility mergePDF = new PDFMergerUtility();
	    	for(int i = 0; i < args.length-1; i++) {
	    		mergePDF.addSource(args[i]);
	    	}
	    	mergePDF.setDestinationFileName(args[args.length-1]);
	    	mergePDF.mergeDocuments(null);
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
