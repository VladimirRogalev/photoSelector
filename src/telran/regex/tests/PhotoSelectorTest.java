package telran.regex.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import telran.regex.tools.PhotoSelector;

class PhotoSelectorTest {
	// TODO tests:
	// 1.testAllEuropePictures
	// autumn picture
	// spring picture (2015)
	// all night picture
	// all night picture (18-24)
	// all night picture from chicago
	// jpg and png
	
	//Format: folder\\YYYYMMDD_hhmmss.ext
	private static final String[] pictures = { 
			"Paris\\20140101_090000.jpg",
			"Paris\\20140201_121005.jpg",
			"Paris\\20150301_211035.jpg",	
			"Paris\\20150401_110023.gif",	
			"Paris\\20150401_181705.jpg",	
			"Paris\\20150501_231035.gif",	
			"London\\20140205_090000.jpg",	
			"London\\20140205_121005.jpg",	
			"London\\20140601_211035.gif",
			"London\\20151001_110023.jpg",	
			"London\\20151001_121705.jpg",	
			"London\\20151001_231035.jpg",	
			"Chichago\\20150301_120001.png",
			"Chichago\\20151111_232000.png",
			};

	@Test
	void testAllEuropePictures() {
		String regex = "^(Paris|London)";
		String [] actual = PhotoSelector.selectPictures(pictures, regex);
		String [] expected = {		"Paris\\20140101_090000.jpg",
			"Paris\\20140201_121005.jpg",
			"Paris\\20150301_211035.jpg",	
			"Paris\\20150401_110023.gif",	
			"Paris\\20150401_181705.jpg",	
			"Paris\\20150501_231035.gif",	
			"London\\20140205_090000.jpg",	
			"London\\20140205_121005.jpg",	
			"London\\20140601_211035.gif",
			"London\\20151001_110023.jpg",	
			"London\\20151001_121705.jpg",	
			"London\\20151001_231035.jpg",	
			};
		
		assertEquals(expected, actual);
		
		
	}

}
