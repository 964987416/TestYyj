package com.briup.Test.stream;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yyj
 * @version CreateTime：2018年1月9日 下午4:23:24
 * 
 */
public class InOutStream {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		byte[] buf = new byte[1024];
		int i = 0;
		while ((i = in.read(buf, 0, buf.length)) != -1) {
			System.out.println("i=" + i);
		}
		System.out.println(i);
	}

}
