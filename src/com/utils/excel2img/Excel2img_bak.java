package com.utils.excel2img;

import com.aspose.cells.ImageFormat;
import com.aspose.cells.ImageOrPrintOptions;
import com.aspose.cells.SheetRender;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import java.io.File;

public class Excel2img_bak {

	public static void ConvertToImage() {

		String dataDir = getDataDir(Excel2img_bak.class);
		// Create a new Workbook object
		// Open a template excel file
		Workbook book = null;
		try {
			// book = new Workbook(dataDir + "2018各项目情况.xlsx");
			book = new Workbook("D:\\20180702_Game10002_DataReport.xls");
			// Get the first worksheet
			// Worksheet sheet = book.getWorksheets().get(0);
			Worksheet sheet = book.getWorksheets().get(0);
			sheet.getPageSetup().setLeftMargin(-20);
			sheet.getPageSetup().setRightMargin(0);
			sheet.getPageSetup().setBottomMargin(0);
			sheet.getPageSetup().setTopMargin(0);

			// Define ImageOrPrintOptions
			ImageOrPrintOptions imgOptions = new ImageOrPrintOptions();
			// Specify the image format
			imgOptions.setImageFormat(ImageFormat.getJpeg());
			imgOptions.setCellAutoFit(true);
			imgOptions.setOnePagePerSheet(true);
			// imgOptions.setDesiredSize(1000,800);
			// Render the sheet with respect to specified image/print options
			SheetRender render = new SheetRender(sheet, imgOptions);

			// Render the image for the sheet
			// render.toImage(0, dataDir + "SheetImage.jpg");
			render.toImage(0, "D:\\SheetImage.jpg");
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

		String dataDir = getDataDir(Excel2img_bak.class);
		// Create a new Workbook object
		// Open a template excel file
		Workbook book = null;
		try {
			// book = new Workbook(dataDir + "2018各项目情况.xlsx");
			book = new Workbook(filepath);
			// Get the first worksheet
			// Worksheet sheet = book.getWorksheets().get(0);
			Worksheet sheet = book.getWorksheets().get(0);

			// Define ImageOrPrintOptions
			ImageOrPrintOptions imgOptions = new ImageOrPrintOptions();
			// Specify the image format
			imgOptions.setImageFormat(ImageFormat.getJpeg());
			imgOptions.setCellAutoFit(true);
			imgOptions.setOnePagePerSheet(true);
			imgOptions.setDesiredSize(2000, 1600);
			// Render the sheet with respect to specified image/print options
			SheetRender render = new SheetRender(sheet, imgOptions);

			// Render the image for the sheet
			// render.toImage(0, dataDir + "SheetImage.jpg");
			render.toImage(0, picpath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getDataDir(Class c) {
		File dir = new File(System.getProperty("user.dir"));

		System.out.println("shake" + dir.getAbsolutePath());

		dir = new File(dir, "src");
		dir = new File(dir, "main");
		dir = new File(dir, "resources");

		for (String s : c.getName().split("\\.")) {
			dir = new File(dir, s);
		}

		if (dir.exists()) {
			System.out.println("Using data directory: " + dir.toString());
		} else {
			dir.mkdirs();
			System.out.println("Creating data directory: " + dir.toString());
		}

		return dir.toString() + File.separator;
	}

	public static void main(String[] args) {
		ConvertToImage();
	}
}