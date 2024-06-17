 // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Supported Files", "pdf", "docx", "doc", "exe", "xls", "xlsx", "jpg", "png", "mp3", "mp4", "flv", "ico", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String attach = file.toString();
            txtFileCheck.setText(attach);
            extension = getFileExtension(file);

            try {
                if (extension.equals("doc") || extension.equals("docx")) {
                    readWordFile(file);
                } else if (extension.equals("xls") || extension.equals("xlsx")) {
                    readExcelFile(file);
                } else if (extension.equals("pdf")) {
                    readPdfFile(file);
                } else if (extension.equals("jpg") || extension.equals("png")) {
                    readImageFile(file);
                } else {
                    System.out.println("Unsupported file type.");

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

import static diigitalsignaturen3.Form.readExcelFile;
import static diigitalsignaturen3.Form.readImageFile;
import static diigitalsignaturen3.Form.readWordFile;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

