package cn.com.aiton.utils;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;

/**
 * Created by Administrator on 14-2-14.
 */
public class ByteUtils {
    /**
     * 将一维数组，转换成二维数据，也就是每条记录
     * @param bytes
     * @param row
     * @param column
     * @return
     */
    public static byte[][] oneArrayToTwoArray(byte[] bytes, int row, int column){
        byte[][] bta = new byte[row][column];
        for(int i=0;i<bytes.length;i++){
            bta[i /column][i% column] = bytes[i];
        }
        return bta;
    }
    //long类型转成byte数组
    public static byte[] longToByte(long number) {
        long temp = number;
        byte[] b = new byte[8];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Long(temp & 0xff).byteValue();//将最低位保存在最低位
            temp = temp >> 8; // 向右移8位
        }
        return b;
    }
    //byte数组转成long
    public static long byteToLong(byte[] b) {
        long s = 0;
        long s0 = b[0] & 0xff;// 最低位
        long s1 = b[1] & 0xff;
        long s2 = b[2] & 0xff;
        long s3 = b[3] & 0xff;
        long s4 = b[4] & 0xff;// 最低位
        long s5 = b[5] & 0xff;
        long s6 = b[6] & 0xff;
        long s7 = b[7] & 0xff;

        // s0不变
        s1 <<= 8;
        s2 <<= 16;
        s3 <<= 24;
        s4 <<= 8 * 4;
        s5 <<= 8 * 5;
        s6 <<= 8 * 6;
        s7 <<= 8 * 7;
        s = s0 | s1 | s2 | s3 | s4 | s5 | s6 | s7;
        return s;
    }
    /**
     * 注释：int到字节数组的转换！
     *
     * @param number
     * @return
     */
    public static byte[] intToByte(int number) {
        int temp = number;
        byte[] b = new byte[4];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Integer(temp & 0xff).byteValue();//将最低位保存在最低位
            temp = temp >> 8; // 向右移8位
        }
        return b;
    }
    /**
     * 注释：字节数组到int的转换！
     *
     * @param b
     * @return
     */
    public static int byteToInt(byte[] b) {
        int s = 0;
        int s0 = b[3] & 0xff;// 最低位
        int s1 = b[2] & 0xff;
        int s2 = b[1] & 0xff;
        int s3 = b[0] & 0xff;
        s3 <<= 24;
        s2 <<= 16;
        s1 <<= 8;
        s = s0 | s1 | s2 | s3;
        return s;
    }

    /**
     * 将Byte数组转成无符号整型
     * @param b
     * @return
     */
    public static int bytesUInt(byte b){
        return b&0xff;
    }

    /**
     * 注释：short到字节数组的转换！
     *
     * @param number
     * @return
     */
    public static byte[] shortToByte(short number) {
        int temp = number;
        byte[] b = new byte[2];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Integer(temp & 0xff).byteValue();//将最低位保存在最低位
            temp = temp >> 8; // 向右移8位
        }
        return b;
    }

    /**
     * 注释：字节数组到short的转换！
     *
     * @param b
     * @return
     */
    public static short byteToShort(byte[] b) {
        short s = 0;
        short s0 = (short) (b[0] & 0xff);// 最低位
        short s1 = (short) (b[1] & 0xff);
        s1 <<= 8;
        s = (short) (s0 | s1);
        return s;
    }
    /**   * float转换byte   *   * @param bb   * @param x   * @param index   */
    public static byte[] floatTobyteArray(float v) {
        ByteBuffer bb = ByteBuffer.allocate(4);
        byte[] ret = new byte[4];
        FloatBuffer fb = bb.asFloatBuffer();
        fb.put(v);
        bb.get(ret);
        return ret;
    }
    /**   * 通过byte数组取得float   *   * @param bb   * @param index   * @return   */
    public static float byteArrayToFloat(byte[] v) {
        ByteBuffer bb = ByteBuffer.wrap(v);
        FloatBuffer fb = bb.asFloatBuffer();
        return fb.get();
    }

    /**   * double转换byte   *   * @param bb   * @param x   * @param index   */
    public static byte[] doubleToByteArray(double x) {
        ByteBuffer bb = ByteBuffer.allocate(8);
        byte[] ret = new byte[8];
        DoubleBuffer fb = bb.asDoubleBuffer();
        fb.put(x);
        bb.get(ret);
        return ret;
    }

    /**   * 通过byte数组取得float   *   * @param bb   * @param index   * @return   */
    public static double byteArrayToDouble(byte[] b) {
        ByteBuffer bb = ByteBuffer.wrap(b);
        DoubleBuffer fb = bb.asDoubleBuffer();
        return fb.get();
    }

    /**
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String byteArrayToStringByUTF8(byte[] bytes) throws Exception{
        return new String(bytes,"UTF-8");
    }

    /**
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String byteArrayToStringByISO(byte[] bytes) throws Exception{
        return new String(bytes,"ISO-8859-1");
    }

    /**
     *
     * @param s
     * @return
     * @throws Exception
     */
    public static byte[] stringToByteArrayByUTF8(String s) throws Exception{
        return s.getBytes("UTF-8");
    }

    /**
     *
     * @param s
     * @return
     * @throws Exception
     */
    public static byte[] stringToByteArrayByISO(String s) throws  Exception{
        return s.getBytes("ISO-8859-1");
    }
    public static byte[] stringToByteArrayByASCII(String s) throws Exception{
        return s.getBytes("US-ASCII");
    }
}
