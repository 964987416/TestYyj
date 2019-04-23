package com.briup.Test.recursion;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yyj
 * @version CreateTime：2018年1月9日 下午2:24:42
 * 使用递归的思想搜索文件
 * 文件搜索引擎
 * 可搜索一个文件夹中所有同类型文件的文件名（包括有子文件夹的情况）
 * 
 */
public class SearchFile {
	private final static List<File> FILE_LIST = new ArrayList<File>();
	
	public static void read(File file) {
		//如果f是一个文件夹 再将文件夹遍历 重新走进read方法 否则判断 文件是否以".jpg结尾"
		if (file.isDirectory()) {
			File[] filelist = file.listFiles();
			for (File f : filelist) {
				read(f);
			}
		} else {
			if (file.getName().endsWith(".jpg"))
				FILE_LIST.add(file);
		}
		
	}

	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		read(new File("f:\\小回忆dota2壁纸"));
		for (File b : FILE_LIST) {
			System.out.println(b);
		}
		System.out.println("总共查询到"+FILE_LIST.size()+"条数据");
		Long end = System.currentTimeMillis();
		System.out.println("耗时" + (end - start) + "毫秒");
	}
}
