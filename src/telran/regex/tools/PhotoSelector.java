package telran.regex.tools;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {
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
