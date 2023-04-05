package top.imzlxiao.market.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * @Author: Longxiao Zhang
 * @Date: 2023/3/20 15:34
 * @Description 加密工具
 */
public final class MD5 {


    public static String encrypt(String strSrc) {
        try {
            char hexChars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            byte[] bytes = strSrc.getBytes();

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(bytes);
            bytes = md.digest();
            int len = bytes.length;
            char[] chars = new char[len * 2];
            int k = 0;
            //高四位第四位分别转换为16进制
            for (int i = 0; i < bytes.length; i++) {
                byte b = bytes[i];
                chars[k++] = hexChars[b >>> 4 & 0xf];
                chars[k++] = hexChars[b & 0xf];
            }
            return new String(chars);


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException("MD5加密出错===>" + e);
        }
    }
}
