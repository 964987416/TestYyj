package com.utils.excel2img;
/**
 * 读取excel文件转换为图片
 * 
 */

import com.aspose.cells.ImageFormat;
import com.aspose.cells.ImageOrPrintOptions;
import com.aspose.cells.SheetRender;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;


public class Excel2img {

	public static void ConvertToImage() {

		
		Workbook book = null;
		try {
			book = new Workbook("E:/FileTest/SpringFrameWork.xlsx");
			Worksheet sheet = book.getWorksheets().get(0);
			sheet.getPageSetup().setLeftMargin(-20);
			sheet.getPageSetup().setRightMargin(0);
			sheet.getPageSetup().setBottomMargin(0);
			sheet.getPageSetup().setTopMargin(0);

			ImageOrPrintOptions imgOptions = new ImageOrPrintOptions();
			imgOptions.setImageFormat(ImageFormat.getJpeg());
			imgOptions.setCellAutoFit(true);
			imgOptions.setOnePagePerSheet(true);
			
			SheetRender render = new SheetRender(sheet, imgOptions);
			render.toImage(0, "C:/Users/moose/Desktop/test.jpg");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param filepath
	 *            .xls或者.xlsx文件的路径
	 * @parampicpath jpg或者png图片的路径
	 */
	public static void ConvertToImage(String filepath, String picpath) {

		Workbook book = null;
		try {
			book = new Workbook(filepath);
			Worksheet sheet = book.getWorksheets().get(0);
			ImageOrPrintOptions imgOptions = new ImageOrPrintOptions();
			imgOptions.setImageFormat(ImageFormat.getJpeg());
			imgOptions.setCellAutoFit(true);
			imgOptions.setOnePagePerSheet(true);
			imgOptions.setDesiredSize(5000, 3000);
			SheetRender render = new SheetRender(sheet, imgOptions);

			render.toImage(0, picpath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

	public static void main(String[] args) {
		long i = Math.round(100 * Math.random());
		String str = "E:/FileTest/Test.xls";
		String str1 ="C:/Users/moose/Desktop/test"+i+".jpg" ;
		ConvertToImage(str,str1);
		System.out.println("method1 success");
		
		ConvertToImage();
		System.out.println("method2 success");
	}
}