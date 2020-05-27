package insta;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import urlread.UrlReader;

public class LinkCrawler {
	private List<String> urlList;
	
	public LinkCrawler() {
		urlList = new ArrayList<String>();
	}

	public List<String> disvoverWeb(String root) {

			String rawHTML = UrlReader.readURL(root);
			
			//regex for finding the links of the photos 
			String regexLinks = "\"shortcode\":\".+?\"";
			
			Pattern pattern = Pattern.compile(regexLinks);
			Matcher matcher = pattern.matcher(rawHTML);
			
			while (matcher.find()) {
				String rawlUrl = matcher.group();
				//builds up the working link 
				String actualUrl = "https://www.instagram.com/p/"+rawlUrl.substring(13, rawlUrl.length()-1);
				
				System.out.println(actualUrl);
				
				urlList.add(actualUrl);

			}
			return urlList;
		}

}
