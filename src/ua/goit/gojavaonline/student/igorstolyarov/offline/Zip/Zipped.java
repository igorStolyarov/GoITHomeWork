package ua.goit.gojavaonline.student.igorstolyarov.offline.Zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

    public class Zipped {
        public static File srcFile;
        public static ZipOutputStream zos;
        public static byte[] buffer;

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("Test String");

        for (File file : srcFile.listFiles()) {
            FileInputStream fis = new FileInputStream(file);
            zos.putNextEntry(new ZipEntry(srcFile.getName()));
            int length;
            while ((length = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, length);
            }
            zos.closeEntry();
            fis.close();
        }

        File f = new File("e:\\test.zip");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
        ZipEntry e = new ZipEntry("Velo.docx");
        out.putNextEntry(e);

        byte[] data = sb.toString().getBytes();
        out.write(data, 0, data.length);
        out.closeEntry();

        out.close();
    }
}