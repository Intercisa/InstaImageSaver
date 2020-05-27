package main;

import java.util.List;

import input.InputUtil;
import insta.ImageSaver;
import insta.LinkCrawler;

public class Main {

	public static void main(String[] args) {
	
		ImageSaver crawler = new ImageSaver();
		LinkCrawler links = new LinkCrawler();
		//String rootURL = "https://www.instagram.com/terminalworld/"; //the root page 
		String rootURL = InputUtil.getInputLinkFromUser();
		
		//gives back the links for the photos 
		List<String> urlList = links.disvoverWeb(rootURL);
		
		//downloads the photos
		crawler.disvoverWeb(urlList);	
	}
}
