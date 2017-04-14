package InetAddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpRecv {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(3000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);//构造 DatagramPacket，用来接收长度为length的数据包。
		ds.receive(dp);
		String str = new String(dp.getData(), 0 , dp.getLength());
		System.out.println(str);
		System.out.println("IP:" + dp.getAddress().getHostAddress() + ",PORT:" + dp.getPort());;
		ds.close();
	}

}
