package com.briup.Test.stream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 检索一个文件夹中你想查找的文件类型的所有文件名
 * @author moose
 *
 */
public class FileDemo {

	private static final List<File> FILE_LIST = new ArrayList<File>();

	public static void main(String[] args) {

		read(new File("f:\\dota2"));
		for (File b : FILE_LIST) {
			System.out.println(b);
		}
		System.out.println(FILE_LIST.size());
	}

	public static void read(File file) {
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File tempFile : listFiles) {
				read(tempFile);
			}
		} else if (file.getName().endsWith(".jpg")) {
			FILE_LIST.add(file);
		}
	}

}
