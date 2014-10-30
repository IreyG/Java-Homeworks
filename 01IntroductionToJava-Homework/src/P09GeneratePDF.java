import java.io.FileOutputStream;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;




public class P09GeneratePDF {
    private static String FILE = "DeckOfCards.pdf";

    public static void main(String[] args) {
        try{
            FontFactory.register("Consola.ttf", "MY_FONT");
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addContent(document);
            document.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void addContent(Document document) throws DocumentException {
        Paragraph p1 = new Paragraph("");
        createTable(p1);
        document.add(p1);
    }
    private static void createTable(Paragraph p1) throws BadElementException {
        PdfPTable table = new PdfPTable(4);
        for (int i = 2; i < 15; i++) {
            for (int j = 0; j < 4; j++) {
                Font myRedFont = FontFactory.getFont("MY_FONT", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 12, Font.NORMAL, BaseColor.RED);
                Font myFont = FontFactory.getFont("MY_FONT", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 12, Font.NORMAL);
                String ch = String.valueOf(i);
                PdfPTable singleCellTable = new PdfPTable(1);
                PdfPCell singleCell=null;
                PdfPCell cell = new PdfPCell();
                cell.setPadding(3);
                cell.setBorder(Rectangle.NO_BORDER);
                if (ch.equals("11")) {
                    ch = "J";
                } else if (ch.equals("12")) {
                    ch = "Q";
                } else if (ch.equals("13")) {
                    ch = "K";
                } else if (ch.equals("14")) {
                    ch = "A";
                } else {
                }
                switch (j) {
                    case 0: singleCell = new PdfPCell(new Phrase(ch+"♣", myFont)); break;
                    case 1: singleCell = new PdfPCell(new Phrase(ch+"♦", myRedFont)); break;
                    case 2: singleCell = new PdfPCell(new Phrase(ch+"♥", myRedFont)); break;
                    case 3: singleCell = new PdfPCell(new Phrase(ch+"♠", myFont)); break;
                    default: break;
                }
                singleCell.setFixedHeight(110f);
                singleCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                singleCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                singleCellTable.addCell(singleCell);
                cell.addElement(singleCellTable);
                table.addCell(cell);
            }
        }
        p1.add(table);
    }
}