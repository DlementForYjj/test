package test.net.catchpackage;

public class javaAndFiddler {
	
	public static void main(String[] args) {
		System.setProperty("http.proxyHost", "localhost"); 
		System.setProperty("http.proxyPort", "8888"); 
		System.setProperty("https.proxyHost", "localhost");
		System.setProperty("https.proxyPort", "8888");
	}
	
}
