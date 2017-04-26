package test.net.udp;

import java.net.*;
public class  UdpSend
{
	public static void main(String[] args) throws Exception
	{
		//1,创建udp服务，通过DatagramSocket对象
		DatagramSocket ds = new DatagramSocket(8888);
		//2,确定数据，并封装为数据包。
		byte[] data = "udp test data".getBytes();
		DatagramPacket dp = new DatagramPacket(data,data.length,InetAddress.getByName("localhost"),10000);
		//3，通过socket服务的send()方法，将已有的数据包发送出去。
		ds.send(dp);
		//4，关闭资源
		ds.close();
	}
	public static void sop(String str){
		System.out.println(str);
	}
}



