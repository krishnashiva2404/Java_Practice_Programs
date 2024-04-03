package programs;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenWebPageByRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime rt=Runtime.getRuntime();
		String url="https://www.facebook.com/";
		if(Desktop.isDesktopSupported()) {
			Desktop desktop=Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
			}catch(IOException | URISyntaxException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
