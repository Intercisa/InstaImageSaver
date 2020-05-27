package insta;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

import urlread.UrlReader;

public class ImageSaver {


	public void disvoverWeb(List<String> rootList) {
		int id = 1;
		String name = "pic-";
		for (String roots : rootList) {
			
			String rawHTML = UrlReader.readURL(roots);
		
			//search for the photos in the HTML 
			String regexPhotos = "(\"https:\\/\\/scontent-vie1-1.cdninstagram.com).+?\"";
			Pattern pattern = Pattern.compile(regexPhotos);
			Matcher matcher = pattern.matcher(rawHTML);
			
			while (matcher.find()) {
				String actualUrl = matcher.group();
				
				//downloads the photos 
					try {
						FileUtils.copyURLToFile(
								new URL(actualUrl.substring(1,actualUrl.length()-1)),
								new File("C:\\TEMPs\\Új mappa\\pics\\"+name+id+".png"),
										3000,
										100000
								);
						id++;
						System.out.println("image saved!");
					} catch (IOException e) {

					}
							
				}
			}
	}
}
