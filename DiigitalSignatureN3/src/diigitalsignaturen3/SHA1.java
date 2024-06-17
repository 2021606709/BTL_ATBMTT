/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diigitalsignaturen3;

import hashFunc.signature;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/**
 *
 * @author HI
 */
public class SHA1 {

    private static int BUFFER_SIZE = 32 * 1024;

    public static void main(String[] args) throws Exception {

    }

    public String md(String al, String f) throws Exception {
//        BufferedInputStream file = new BufferedInputStream(new FileInputStream(f));
//        MessageDigest md = MessageDigest.getInstance(al);
//        DigestInputStream in = new DigestInputStream(file, md);
//        int i;
//        byte[] buffer = new byte[BUFFER_SIZE];
//        do {
//            i = in.read(buffer, 0, BUFFER_SIZE);
//        } while (i == BUFFER_SIZE);
//        md = in.getMessageDigest();
//        in.close();
//
//        return new BigInteger(md.digest());
        String al1 = signature.hashAlg(al, f);
        return al1;
    }
}
