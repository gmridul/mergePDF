package com.pdf.commons;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

public class PDFUtils {
	public static void mergePDF(List<String> inputFiles, String outputFile) throws FileNotFoundException, IOException {
		PDFMergerUtility mergePDF = new PDFMergerUtility();
    	for(String inputFile : inputFiles) {
    		mergePDF.addSource(inputFile);
    	}
    	mergePDF.setDestinationFileName(outputFile);
    	mergePDF.mergeDocuments(null);
	}
}
