package telran.regex.tools;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {
	   public static void main(String[] args) {
	        if (args.length != 2) {
	            System.out.println("Usage: java PhotoSelector <regex> <comma-separated file paths>");
	            return;
	        }
	        
	        String regex = args[0];
	        String[] pictures = args[1].split(",");
	        
	        String[] selectedPictures = selectPictures(pictures, regex);
	        
	        for (String picture : selectedPictures) {
	            System.out.println(picture);
	        }
	    }
	
	public static String[] selectPictures(String[] picture, String regex) {
	
		 Pattern pattern = Pattern.compile(regex);
	        Matcher matcher;
	        StringBuilder builder = new StringBuilder();
	        for (int i = 0; i < picture.length; i++) {
	            matcher = pattern.matcher(picture[i]);
	            if (matcher.find()) {
	                builder.append(picture[i]);
	                builder.append(",");
	                
	            }
	        }
	        String[] selectedPictures = builder.toString().split(",");
	        return selectedPictures;
	}
	

}