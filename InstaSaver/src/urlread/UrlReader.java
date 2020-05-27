package urlread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlReader {
	
	private UrlReader() {}

	public static String readURL(String w) {
		StringBuilder rawHTML = new StringBuilder();

		try {
			URL url = new URL(w);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String inputLine = "";

			while ((inputLine = in.readLine()) != null) {
				rawHTML.append(inputLine);

			}

			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return rawHTML.toString();

	}
	
	
}
