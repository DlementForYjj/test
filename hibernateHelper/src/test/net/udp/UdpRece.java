package test.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpRece{
	public static void main(String[] args) throws Exception
	{ 
		//1,创建udp socket，设置端口
		DatagramSocket ds = new DatagramSocket(10000);
		//2，定义数据包，用于存储数据
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data,data.length);
		//3，通过服务的receive方法将收到的数据存入数据包中。
		ds.receive(dp);//阻塞方法，等待接收数据
		//4,使用数据包的方法取出其中对应的数据
		String ip = dp.getAddress().getHostAddress();
		String reData = new String(dp.getData(),0,dp.getLength());
		int port = dp.getPort();
		System.out.println(ip+"----"+reData+"-----"+port);
		//5,关闭资源
		ds.close();
	}
}