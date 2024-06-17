/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diigitalsignaturen3;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.*;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.security.*;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlException;
/**
 *
 * @author HI
 */
public class NewClass {
    public static void main(String args[]){
       try {
            Security.addProvider(new BouncyCastleProvider());

            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA", "BC");
            keyGen.initialize(2048);
            KeyPair keyPair = keyGen.generateKeyPair();

            Signature signature = Signature.getInstance("SHA256withRSA", "BC");
            signature.initSign(keyPair.getPrivate());

            String message = "This is a message";
            signature.update(message.getBytes());
            byte[] sigBytes = signature.sign();

            System.out.println("Signature: " + new String(sigBytes));

            signature.initVerify(keyPair.getPublic());
            signature.update(message.getBytes());
            boolean verifies = signature.verify(sigBytes);
            System.out.println("Signature verifies: " + verifies);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
