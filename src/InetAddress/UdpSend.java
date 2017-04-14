package InetAddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSend {

	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket(); //构造数据报套接字并将其绑定到本地主机上任何可用的端口
		String str = "hello , world";
		
		//构造数据报包,用来将长度为length的包发送到指定主机上的指定端口号。
		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),InetAddress.getByName("192.168.199.168"),3000);
		ds.send(dp);
		ds.close(); //关闭连接
	}

}
