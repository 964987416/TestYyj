package com.runoob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author yyj
 * @version CreateTime：2019年1月16日 下午2:44:14
 */
public class Temp {
	public static void main(String args[]) throws IOException {
		File f = new File("C:\\Users\\moose\\Desktop\\System.txt");
		InputStream ips = new FileInputStream(f);
		OutputStream ops = new FileOutputStream(
				"C:\\Users\\moose\\Desktop\\copySystem.txt");
		InputStreamReader isr = new InputStreamReader(ips, "GBK");
		OutputStreamWriter osw = new OutputStreamWriter(ops, "GBK");
		int len;
		char[] buf = new char[1024];

		while ((len = isr.read(buf)) != -1) {
			osw.write(buf);
			System.out.println(buf);
		}
		osw.close();
		isr.close();
		ops.close();
		ips.close();
	}
}
