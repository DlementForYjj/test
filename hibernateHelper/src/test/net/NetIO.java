package test.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.Header;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;


public class NetIO {

	public static void main(String[] args) {
//		test();
		netDownload();
	}
	public static final  int     CONNECT_TIMEOUT = 10 * 1000;
	
	public static void test(){
		URL url;
		try {
			url = new URL("http://www.baidu.com");
			
			InputStream in = url.openStream();
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int len = -1;
			while ((len = in.read(buffer)) != -1)
			{
				output.write(buffer, 0, len);
			}
			 System.out.println(new String(output.toByteArray()));
		}catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void netDownload(){
		 String url = "http://103.7.29.197/vweixinp.tc.qq.com/1007_efd683683fdd41ea9a999ea9ad81f239.f10.mp4?vkey=E79319C2D663CACB3A26812DBE3DC05F33EE92DEA914480FB88A77EF92832D1EDA51FFD2B275A7E9&sha=0&save=1";
	        RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(CONNECT_TIMEOUT).setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(CONNECT_TIMEOUT).build();
	        CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
	        HttpGet get = new HttpGet(url);
	        try {
	            CloseableHttpResponse r = client.execute(get);
	            System.out.println("Status code: " + r.getStatusLine().getStatusCode());
	            if (HttpStatus.SC_OK == r.getStatusLine().getStatusCode()) {
	                InputStream inputStream = r.getEntity().getContent();
	                Header[] headers = r.getHeaders("Content-disposition");
	                if (null != headers && 0 != headers.length) {
	                    Header length = r.getHeaders("Content-Length")[0];
	                }
	            }
	        }catch (IOException e){
	        	e.printStackTrace();
	        }
	}
	
	
}
