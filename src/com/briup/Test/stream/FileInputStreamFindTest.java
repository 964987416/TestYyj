package com.briup.Test.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yyj
 * @version CreateTime：2018年1月10日 下午3:10:16
 * 检索指定文件中指定字符串 并输出到文件中
 */
public class FileInputStreamFindTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\FileTest\\day20.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\moose\\Desktop\\FindTest.txt",true);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		BufferedWriter bw = new BufferedWriter(osw);
		int i = 0;
		String str = "输入流";
		Pattern p = Pattern.compile(str);
		String line = null;
		while ((line = br.readLine()) != null) {
			Matcher m = p.matcher(line); 
			while (m.find()) {
				System.out.println(line);
				System.out.print("start:" + m.start());
				System.out.println(" end:" + m.end());
				bw.write(line);
				i++;
			}
		}
		bw.flush();
		fis.close();
		isr.close();
		br.close();
		fos.close();
		osw.close();
		bw.close();
		System.out.println("检索完成");
		System.out.println("一共匹配到" + i + "次指定字符串");

	}
}
