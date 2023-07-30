import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainClass {
    public static void main(String[] args)throws IOException, IOException{
        File oldFile=new File("C:\\Users\\KIIT\\Downloads\\TAPAS MUKHERJEE DAY9.pdf");
        PDDocument document= PDDocument.load(oldFile);
        Splitter splitter=new Splitter();
        List<PDDocument> splitPages=splitter.split(document);
        int num=1;
        for(PDDocument myDoc:splitPages){
            myDoc.save("C:\\Users\\KIIT\\Documents\\project\\split_0"+num+".pdf");
            num++;
            myDoc.close();
        }
        System.out.println("Split Done");
    }
}
