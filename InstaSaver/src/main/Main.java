package main;

import java.util.List;

import input.InputData;
import input.InputUtil;
import insta.ImageSaver;
import insta.LinkCrawler;

public class Main {

	public static void main(String[] args) {
	
		ImageSaver crawler = new ImageSaver();
		LinkCrawler links = new LinkCrawler();
		//String rootURL = "https://www.instagram.com/terminalworld/"; //the root page 
		InputData data = InputUtil.getInputFromUser();
		
		//gives back the links for the photos 
		List<String> urlList = null;
		
		
		switch (data.getType()) {
		case PAGE: {
		 urlList = links.disvoverWeb(data.getInputString());
		 crawler.disvoverWeb(urlList);	
	
		}
		case PHOTO: {
			urlList = List.of(data.getInputString());
			//downloads the photos
			 crawler.disvoverWeb(urlList);	

		}
		default:
			throw new IllegalArgumentException("Unexpected somethin");
		}

	}
}
