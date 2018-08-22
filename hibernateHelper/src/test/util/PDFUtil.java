package test.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPRow;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFUtil {
	public static final String FILE_DIR = "D:\\javaio\\";
	
	 public static final String DEST2 = "D:\\javaio\\\\testPdf.pdf";//文件路径
	
	
	public static void main(String[] args) throws DocumentException, IOException {
	    //Step 1—Create a Document.  
	    Document document = new Document();  
	    //Step 2—Get a PdfWriter instance.  
	    PdfWriter.getInstance(document, new FileOutputStream(FILE_DIR + "createSamplePDF.pdf"));  
	    //Step 3—Open the Document.  
	    document.open();  
	    //Step 4—Add content.  
	    BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
	    
	    Font fontTitle = new Font(baseFont, 25, Font.NORMAL);
	    fontTitle.setStyle(Font.BOLD);
	    Font fontLeftCell = new Font(baseFont, 18, Font.NORMAL);
	    fontLeftCell.setStyle(Font.BOLD);
        Font fontCell = new Font(baseFont, 14, Font.NORMAL);
        
	    Paragraph titleP = new Paragraph("中国共产党党员组织关系介绍信",fontTitle);
	    titleP.setAlignment(Paragraph.ALIGN_CENTER);
	    document.add(titleP);
	    
	    
	    //======================================   第一联   =========================================================
	    PdfPTable table = new PdfPTable(3); 
        table.setWidthPercentage(100); // 宽度100%填充
        table.setSpacingBefore(10f); // 前间距
        table.setSpacingAfter(10f); // 后间距

        ArrayList<PdfPRow> listRow = table.getRows();
        //设置列宽
        float[] columnWidths = { 2f, 25f, 1f };
        table.setWidths(columnWidths);
        
       
        //行1
        PdfPCell cells1[]= new PdfPCell[3];
        //单元格
        cells1[0] = new PdfPCell(new Paragraph("党",fontLeftCell));//单元格内容
        cells1[0].disableBorderSide(PdfPCell.BOTTOM);
        cells1[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        cells1[0].setPaddingTop(10);
//        cells1[0].setMinimumHeight(100);//党员格高度
//        cells1[0].setBorderColor(BaseColor.BLUE);//边框验证
//        cells1[0].setPaddingLeft(20);//左填充20
       
//        cells1[0].setVerticalAlignment(Element.ALIGN_MIDDLE);//垂直居中
//      
       
        cells1[1] = new PdfPCell(new Paragraph("",fontCell));
        cells1[1].setHorizontalAlignment(Element.ALIGN_RIGHT);//水平居中
        cells1[1].disableBorderSide(PdfPCell.BOTTOM);
        
        cells1[2] = new PdfPCell(new Paragraph(""));
        cells1[2].disableBorderSide(PdfPCell.BOTTOM);
        PdfPRow row1 = new PdfPRow(cells1);
        //行2
        PdfPCell cells2[]= new PdfPCell[3];
        cells2[0] = new PdfPCell(new Paragraph("员",fontLeftCell));
        cells2[0].disableBorderSide(PdfPCell.TOP);
        cells2[0].disableBorderSide(PdfPCell.BOTTOM);
        cells2[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        
        cells2[1] = new PdfPCell(new Paragraph("第________________号",fontCell));
        cells2[1].setHorizontalAlignment(Element.ALIGN_RIGHT);//水平居中
        cells2[1].disableBorderSide(PdfPCell.TOP);
        cells2[1].disableBorderSide(PdfPCell.BOTTOM);
        
        cells2[2] = new PdfPCell(new Paragraph(""));
        cells2[2].disableBorderSide(PdfPCell.TOP);
        cells2[2].disableBorderSide(PdfPCell.BOTTOM);
//        cells2[1].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        
        PdfPRow row2 = new PdfPRow(cells2);
        //行3
        PdfPCell cells3[]= new PdfPCell[3];
        cells3[0] = new PdfPCell(new Paragraph("介",fontLeftCell));
        cells3[0].disableBorderSide(PdfPCell.TOP);
        cells3[0].disableBorderSide(PdfPCell.BOTTOM);
        cells3[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        
        cells3[2] = new PdfPCell(new Paragraph("第",fontCell));
        cells3[2].disableBorderSide(PdfPCell.TOP);
        cells3[2].disableBorderSide(PdfPCell.BOTTOM);
        
        PdfPRow row3 = new PdfPRow(cells3);
//        cells3[0].setColspan(3);
        //行4
        PdfPCell cells4[]= new PdfPCell[3];
        cells4[0] = new PdfPCell(new Paragraph("绍",fontLeftCell));
        cells4[0].disableBorderSide(PdfPCell.TOP);
        cells4[0].disableBorderSide(PdfPCell.BOTTOM);
        cells4[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        
        cells4[1] = new PdfPCell(new Paragraph("               ____________________同志系中共_______________________,",fontCell));
        cells4[1].disableBorderSide(PdfPCell.TOP);
        cells4[1].disableBorderSide(PdfPCell.BOTTOM);
        
        cells4[2] = new PdfPCell(new Paragraph("一",fontCell));
        cells4[2].disableBorderSide(PdfPCell.TOP);
        cells4[2].disableBorderSide(PdfPCell.BOTTOM);
        
        PdfPRow row4 = new PdfPRow(cells4);
        //行5
        PdfPCell cells5[]= new PdfPCell[3];
        cells5[0] = new PdfPCell(new Paragraph("信",fontLeftCell));
        cells5[0].disableBorderSide(PdfPCell.TOP);
        cells5[0].disableBorderSide(PdfPCell.BOTTOM);
        cells5[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        
        cells5[1] = new PdfPCell(new Paragraph("组织关系由____________________转到_______________________",fontCell));
        cells5[1].disableBorderSide(PdfPCell.TOP);
        cells5[1].disableBorderSide(PdfPCell.BOTTOM);
        
        cells5[2] = new PdfPCell(new Paragraph("联",fontCell));
        cells5[2].disableBorderSide(PdfPCell.TOP);
        cells5[2].disableBorderSide(PdfPCell.BOTTOM);
        
        PdfPRow row5 = new PdfPRow(cells5);
        
        //行6
        PdfPCell cells6[]= new PdfPCell[3];
        cells6[0] = new PdfPCell(new Paragraph("存",fontLeftCell));
        cells6[0].disableBorderSide(PdfPCell.TOP);
        cells6[0].disableBorderSide(PdfPCell.BOTTOM);
        cells6[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        cells6[2] = new PdfPCell(new Paragraph("",fontCell));
        cells6[2].disableBorderSide(PdfPCell.TOP);
        cells6[2].disableBorderSide(PdfPCell.BOTTOM);
        PdfPRow row6 = new PdfPRow(cells6);
        
        
        //行7
        PdfPCell cells7[]= new PdfPCell[3];
        cells7[0] = new PdfPCell(new Paragraph("根",fontLeftCell));
        cells7[0].disableBorderSide(PdfPCell.TOP);
        cells7[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        cells7[0].setPaddingBottom(10);
        
        cells7[1] = new PdfPCell(new Paragraph("__年__月__日",fontCell));
        cells7[1].setHorizontalAlignment(Element.ALIGN_RIGHT);
        cells7[1].disableBorderSide(PdfPCell.TOP);
        
        cells7[2] = new PdfPCell(new Paragraph("",fontCell));
        cells7[2].disableBorderSide(PdfPCell.TOP);
        PdfPRow row7 = new PdfPRow(cells7);
        
        
        
        //把第一行添加到集合
        listRow.add(row1);
        listRow.add(row2);
        listRow.add(row3);
        listRow.add(row4);
        listRow.add(row5);
        listRow.add(row6);
        listRow.add(row7);
        //把表格添加到文件中
        document.add(table);
	    
        Paragraph tip1P = new Paragraph("(贴回执联处)",fontCell);
        tip1P.setAlignment(Paragraph.ALIGN_CENTER);
	    document.add(tip1P);
	    
        Paragraph spliteP = new Paragraph("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ",fontCell);
        spliteP.setAlignment(Paragraph.ALIGN_CENTER);
	    document.add(spliteP);
        
	    Paragraph tip2P = new Paragraph("(加盖骑缝章)",fontCell);
	    tip2P.setAlignment(Paragraph.ALIGN_RIGHT);
	    document.add(tip2P);
	    
	    
	    Paragraph title2P = new Paragraph("中国共产党党员组织关系介绍信",fontTitle);
	    title2P.setAlignment(Paragraph.ALIGN_CENTER);
	    document.add(title2P);
        
	    //======================================   第二联   =========================================================
	    PdfPTable table2 = new PdfPTable(3); 
        table2.setWidthPercentage(100); // 宽度100%填充
        table2.setSpacingBefore(10f); // 前间距
        table2.setSpacingAfter(10f); // 后间距

        ArrayList<PdfPRow> listRow2 = table2.getRows();
        //设置列宽
        float[] columnTb2Widths = {0f, 27f, 1f };
        table2.setWidths(columnTb2Widths);
       
        //行1
        PdfPCell cellsTb21[]= new PdfPCell[3];
        //单元格
        cellsTb21[0] = new PdfPCell(new Paragraph("党",fontLeftCell));//单元格内容
        cellsTb21[0].disableBorderSide(PdfPCell.BOTTOM);
        cellsTb21[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        cellsTb21[0].setPaddingTop(10);
       
        cellsTb21[1] = new PdfPCell(new Paragraph("",fontCell));
        cellsTb21[1].setHorizontalAlignment(Element.ALIGN_RIGHT);//水平居中
        cellsTb21[1].disableBorderSide(PdfPCell.BOTTOM);
        
//        cellsTb21[2] = new PdfPCell(new Paragraph(""));
//        cellsTb21[2].disableBorderSide(PdfPCell.BOTTOM);
        PdfPRow rowTb21 = new PdfPRow(cellsTb21);
        
//        //行2
//        PdfPCell cellsTb22[]= new PdfPCell[3];
//        cellsTb22[0] = new PdfPCell(new Paragraph("员",fontLeftCell));
//        cellsTb22[0].disableBorderSide(PdfPCell.TOP);
//        cellsTb22[0].disableBorderSide(PdfPCell.BOTTOM);
//        cellsTb22[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
        
//        cellsTb22[1] = new PdfPCell(new Paragraph("第________________号",fontCell));
//        cellsTb22[1].setHorizontalAlignment(Element.ALIGN_RIGHT);//水平居中
//        cellsTb22[1].disableBorderSide(PdfPCell.TOP);
//        cellsTb22[1].disableBorderSide(PdfPCell.BOTTOM);
//        
//        cellsTb22[2] = new PdfPCell(new Paragraph(""));
//        cellsTb22[2].disableBorderSide(PdfPCell.TOP);
//        cellsTb22[2].disableBorderSide(PdfPCell.BOTTOM);
////        cells2[1].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
//        
//        PdfPRow rowTb22 = new PdfPRow(cellsTb22);
        
        
        
//        //行3
//        PdfPCell cellsTb23[]= new PdfPCell[3];
//        cellsTb23[0] = new PdfPCell(new Paragraph("介",fontLeftCell));
//        cellsTb23[0].disableBorderSide(PdfPCell.TOP);
//        cellsTb23[0].disableBorderSide(PdfPCell.BOTTOM);
//        cellsTb23[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
//        
//        cellsTb23[2] = new PdfPCell(new Paragraph("第",fontCell));
//        cellsTb23[2].disableBorderSide(PdfPCell.TOP);
//        cellsTb23[2].disableBorderSide(PdfPCell.BOTTOM);
//        
//        PdfPRow rowTb23 = new PdfPRow(cellsTb23);
////        cells3[0].setColspan(3);
//        //行4
//        PdfPCell cellsTb24[]= new PdfPCell[3];
//        cellsTb24[0] = new PdfPCell(new Paragraph("绍",fontLeftCell));
//        cellsTb24[0].disableBorderSide(PdfPCell.TOP);
//        cellsTb24[0].disableBorderSide(PdfPCell.BOTTOM);
//        cellsTb24[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
//        
//        cellsTb24[1] = new PdfPCell(new Paragraph("               ____________________同志系中共_______________________,",fontCell));
//        cellsTb24[1].disableBorderSide(PdfPCell.TOP);
//        cellsTb24[1].disableBorderSide(PdfPCell.BOTTOM);
//        
//        cellsTb24[2] = new PdfPCell(new Paragraph("一",fontCell));
//        cellsTb24[2].disableBorderSide(PdfPCell.TOP);
//        cellsTb24[2].disableBorderSide(PdfPCell.BOTTOM);
//        
//        PdfPRow rowTb24 = new PdfPRow(cellsTb24);
//        //行5
//        PdfPCell cellsTb25[]= new PdfPCell[3];
//        cellsTb25[0] = new PdfPCell(new Paragraph("信",fontLeftCell));
//        cellsTb25[0].disableBorderSide(PdfPCell.TOP);
//        cellsTb25[0].disableBorderSide(PdfPCell.BOTTOM);
//        cellsTb25[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
//        
//        cellsTb25[1] = new PdfPCell(new Paragraph("组织关系由____________________转到_______________________",fontCell));
//        cellsTb25[1].disableBorderSide(PdfPCell.TOP);
//        cellsTb25[1].disableBorderSide(PdfPCell.BOTTOM);
//        
//        cellsTb25[2] = new PdfPCell(new Paragraph("联",fontCell));
//        cellsTb25[2].disableBorderSide(PdfPCell.TOP);
//        cellsTb25[2].disableBorderSide(PdfPCell.BOTTOM);
//        
//        PdfPRow rowTb25 = new PdfPRow(cellsTb25);
//        
//        //行6
//        PdfPCell cellsTb26[]= new PdfPCell[3];
//        cellsTb26[0] = new PdfPCell(new Paragraph("存",fontLeftCell));
//        cellsTb26[0].disableBorderSide(PdfPCell.TOP);
//        cellsTb26[0].disableBorderSide(PdfPCell.BOTTOM);
//        cellsTb26[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
//        cellsTb26[2] = new PdfPCell(new Paragraph("",fontCell));
//        cellsTb26[2].disableBorderSide(PdfPCell.TOP);
//        cellsTb26[2].disableBorderSide(PdfPCell.BOTTOM);
//        PdfPRow rowTb26 = new PdfPRow(cellsTb26);
//        
//        
//        //行7
//        PdfPCell cellsTb27[]= new PdfPCell[3];
//        cellsTb27[0] = new PdfPCell(new Paragraph("根",fontLeftCell));
//        cellsTb27[0].disableBorderSide(PdfPCell.TOP);
//        cellsTb27[0].setHorizontalAlignment(Element.ALIGN_CENTER);//水平居中
//        cellsTb27[0].setPaddingBottom(10);
//        
//        cellsTb27[1] = new PdfPCell(new Paragraph("__年__月__日",fontCell));
//        cellsTb27[1].setHorizontalAlignment(Element.ALIGN_RIGHT);
//        cellsTb27[1].disableBorderSide(PdfPCell.TOP);
//        
//        cellsTb27[2] = new PdfPCell(new Paragraph("",fontCell));
//        cellsTb27[2].disableBorderSide(PdfPCell.TOP);
//        PdfPRow rowTb27 = new PdfPRow(cellsTb27);
        
        
        
        listRow2.add(rowTb21);
//        listRow2.add(rowTb22);
//        listRow2.add(rowTb23);
//        listRow2.add(rowTb24);
//        listRow2.add(rowTb25);
//        listRow2.add(rowTb26);
//        listRow2.add(rowTb27);
        //把表格添加到文件中
        document.add(table2);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    document.close();
//		test(args);
	}
//	public static void test(String[] args) throws DocumentException, FileNotFoundException {
//        //创建文件
//        Document document = new Document();
//        //建立一个书写器
//        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(DEST2));
//        //打开文件
//        document.open();
//        //添加内容
//        document.add(new Paragraph("HD content here"));
//     
//        // 3列的表.
//      
//        
//        //关闭文档
//        document.close();
//        //关闭书写器
//        writer.close();
//    }
	
}
