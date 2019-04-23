package com.briup;
/**
 * tcp协议客户端
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class TCPClientTest {

	public static void main(String[] args) {
		// 1、创建socket
		Socket s = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			s = new Socket("127.0.0.1", 10001);
			// 2、获取输入、输出流
			InputStream is = s.getInputStream();
			//OutputStream os = s.getOutputStream();
			// 3、封装流
			br = new BufferedReader(new InputStreamReader(is));
			
			// bw=new BufferedWriter( new OutputStreamWriter(os));
			 
			// 4、读、写数据
			String line = br.readLine();
			 System.out.println("client: "+line);
			/*Date d = new Date();
			bw.write(d.toLocaleString());
			bw.flush();*/

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 5、关闭资源
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				if (s != null)
					s.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
