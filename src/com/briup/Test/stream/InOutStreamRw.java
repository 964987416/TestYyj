package com.briup.Test.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author yyj
 * @version CreateTime：2018年1月10日 下午2:31:14
 * 
 */
public class InOutStreamRw {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\moose\\Desktop\\System.txt");
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\moose\\Desktop\\CopySystem.txt");
		InputStreamReader isr = new InputStreamReader(fis, "GBK");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(osw);

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			bw.write(line);
		}
		osw.flush();
		fis.close();
		isr.close();
		
		bw.close();
		fos.close();
		osw.close();;
		System.out.println("传输完成");

	}
}
