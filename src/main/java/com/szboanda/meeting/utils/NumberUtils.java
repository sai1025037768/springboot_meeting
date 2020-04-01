package com.szboanda.meeting.utils;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class NumberUtils {
    /**
     * 日志
     */
    private static final Logger log = LogManager.getLogger(NumberUtils.class.getSimpleName());

    // -----------------------------------------------------------------------
    /**
     * 将字符串转换为int类型的数字，如果字符串不能转换成int类型数字将返回0
     *
     * @param str
     *            被操作的字符串
     * @return int 转换后的int类型的数字，如果字符串不能转换成int类型数字将返回0
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int toInt(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.toInt(str);
    }

    /**
     * 将字符串转换为int类型的数字，如果字符串不能转换成int类型数字将返回指定的默认值
     *
     * @param str
     *            被操作的字符串
     * @param defaultValue
     *            默认值
     * @return int 转换后的int类型的数字，如果字符串不能转换成int类型数字将返回默认值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int toInt(final String str, final int defaultValue) {
        return org.apache.commons.lang3.math.NumberUtils.toInt(str, defaultValue);
    }

    /**
     * 将字符串转换为long类型的数字，如果字符串不能转换成long类型数字将返回0L
     *
     * @param str
     *            被操作的字符串
     * @return long 转换后的long类型的数字，如果字符串不能转换成long类型数字将返回0L
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static long toLong(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.toLong(str);
    }

    /**
     * 将字符串转换为long类型的数字，如果字符串不能转换成long类型数字将返回指定的默认值
     *
     * @param str
     *            被操作的字符串
     * @param defaultValue
     *            默认值
     * @return long 转换后的long类型的数字，如果字符串不能转换成long类型数字将返回默认值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static long toLong(final String str, final long defaultValue) {
        return org.apache.commons.lang3.math.NumberUtils.toLong(str, defaultValue);
    }

    /**
     * 将字符串转换为float类型的数字，如果字符串不能转换成float类型数字将返回0.0f
     *
     * @param str
     *            被操作的字符串
     * @return float 转换后的float类型的数字，如果字符串不能转换成float类型数字将返回0.0f
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static float toFloat(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.toFloat(str);
    }

    /**
     * 将字符串转换为float类型的数字，如果字符串不能转换成float类型数字将返回指定的默认值
     *
     * @param str
     *            被操作的字符串
     * @param defaultValue
     *            默认值
     * @return float 转换后的float类型的数字，如果字符串不能转换成float类型数字将返回默认值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static float toFloat(final String str, final float defaultValue) {
        return org.apache.commons.lang3.math.NumberUtils.toFloat(str, defaultValue);
    }

    /**
     * 将字符串转换为double类型的数字，如果字符串不能转换成double类型数字将返回0.0d
     *
     * @param str
     *            被操作的字符串
     * @return double 转换后的double类型的数字，如果字符串不能转换成double类型数字将返回0.0d
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static double toDouble(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.toDouble(str);
    }

    /**
     * 将字符串转换为double类型的数字，如果字符串不能转换成double类型数字将返回指定的默认值
     *
     * @param str
     *            被操作的字符串
     * @param defaultValue
     *            默认值
     * @return double 转换后的double类型的数字，如果字符串不能转换成double类型数字将返回默认值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static double toDouble(final String str, final double defaultValue) {
        return org.apache.commons.lang3.math.NumberUtils.toDouble(str, defaultValue);
    }

    // -----------------------------------------------------------------------
    /**
     * 将字符串转换为byte类型的数字，如果字符串不能转换成byte类型数字将返回(byte) 0
     *
     * @param str
     *            被操作的字符串
     * @return byte 转换后的byte类型的数字，如果字符串不能转换成byte类型数字将返回(byte) 0
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static byte toByte(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.toByte(str);
    }

    /**
     * 将字符串转换为byte类型的数字，如果字符串不能转换成byte类型数字将返回指定的默认值
     *
     * @param str
     *            被操作的字符串
     * @param defaultValue
     *            默认值
     * @return byte 转换后的byte类型的数字，如果字符串不能转换成byte类型数字将返回默认值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static byte toByte(final String str, final byte defaultValue) {
        return org.apache.commons.lang3.math.NumberUtils.toByte(str, defaultValue);
    }

    /**
     * 将字符串转换为short类型的数字，如果字符串不能转换成short类型数字将返回(short) 0
     *
     * @param str
     *            被操作的字符串
     * @return short 转换后的short类型的数字，如果字符串不能转换成short类型数字将返回(short) 0
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static short toShort(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.toShort(str);
    }

    /**
     * 将字符串转换为short类型的数字，如果字符串不能转换成short类型数字将返回指定的默认值
     *
     * @param str
     *            被操作的字符串
     * @param defaultValue
     *            默认值
     * @return short 转换后的short类型的数字，如果字符串不能转换成short类型数字将返回默认值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static short toShort(final String str, final short defaultValue) {
        return org.apache.commons.lang3.math.NumberUtils.toShort(str, defaultValue);
    }

    /**
     * 使用字符串创建一个Number对象并返回，如果字符串格式错误将抛出NumberFormatException异常
     *
     * @param str
     *            被操作的字符串
     * @return Number 字符串转换成的Number对象
     * @throws NumberFormatException
     *             字符串格式错误时抛出
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static Number createNumber(final String str) throws NumberFormatException {
        return org.apache.commons.lang3.math.NumberUtils.createNumber(str);
    }

    // -----------------------------------------------------------------------
    /**
     * 使用字符串创建一个Float对象并返回，如果字符串格式错误将抛出NumberFormatException异常
     *
     * @param str
     *            被操作的字符串
     * @return Float 字符串转换成的Float对象
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static Float createFloat(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.createFloat(str);
    }

    /**
     * 使用字符串创建一个Double对象并返回，如果字符串格式错误将抛出NumberFormatException异常
     *
     * @param str
     *            被操作的字符串
     * @return Double 字符串转换成的Double对象
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static Double createDouble(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.createDouble(str);
    }

    /**
     * 使用字符串创建一个Integer对象并返回，如果字符串格式错误将抛出NumberFormatException异常
     *
     * @param str
     *            被操作的字符串
     * @return Integer 字符串转换成的Integer对象
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static Integer createInteger(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.createInteger(str);
    }

    /**
     * 使用字符串创建一个Long对象并返回，如果字符串格式错误将抛出NumberFormatException异常
     *
     * @param str
     *            被操作的字符串
     * @return Long 字符串转换成的Long对象
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static Long createLong(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.createLong(str);
    }

    /**
     * 使用字符串创建一个BigInteger对象并返回，如果字符串格式错误将抛出NumberFormatException异常
     *
     * @param str
     *            被操作的字符串
     * @return BigInteger 字符串转换成的BigInteger对象
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static BigInteger createBigInteger(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.createBigInteger(str);
    }

    /**
     * 使用字符串创建一个BigDecimal对象并返回，如果字符串格式错误将抛出NumberFormatException异常
     *
     * @param str
     *            被操作的字符串
     * @return BigDecimal 字符串转换成的BigDecimal对象
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static BigDecimal createBigDecimal(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.createBigDecimal(str);
    }

    // --------------------------------------------------------------------
    /**
     * 比较传入的一组long类型数字，返回其中最小值
     *
     * @param array
     *            一组用于比较的long类型的数字
     * @return long 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static long min(final long... array) {
        return org.apache.commons.lang3.math.NumberUtils.min(array);
    }

    /**
     * 比较传入的一组int类型数字，返回其中最小值
     *
     * @param array
     *            一组用于比较的int类型的数字
     * @return int 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int min(final int... array) {
        return org.apache.commons.lang3.math.NumberUtils.min(array);
    }

    /**
     * 比较传入的一组short类型数字，返回其中最小值
     *
     * @param array
     *            一组用于比较的short类型的数字
     * @return short 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static short min(final short... array) {
        return org.apache.commons.lang3.math.NumberUtils.min(array);
    }

    /**
     * 比较传入的一组byte类型数字，返回其中最小值
     *
     * @param array
     *            一组用于比较的byte类型的数字
     * @return byte 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static byte min(final byte... array) {
        return org.apache.commons.lang3.math.NumberUtils.min(array);
    }

    /**
     * 比较传入的一组double类型数字，返回其中最小值
     *
     * @param array
     *            一组用于比较的double类型的数字
     * @return double 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static double min(final double... array) {
        return org.apache.commons.lang3.math.NumberUtils.min(array);
    }

    /**
     * 比较传入的一组float类型数字，返回其中最小值
     *
     * @param array
     *            一组用于比较的float类型的数字
     * @return float 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static float min(final float... array) {
        return org.apache.commons.lang3.math.NumberUtils.min(array);
    }

    /**
     * 获取三个long类型的参数中的最小值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return long 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static long min(long a, final long b, final long c) {
        return org.apache.commons.lang3.math.NumberUtils.min(a, b, c);
    }

    /**
     * 获取三个int类型的参数中的最小值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return int 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int min(int a, final int b, final int c) {
        return org.apache.commons.lang3.math.NumberUtils.min(a, b, c);
    }

    /**
     * 获取三个short类型的参数中的最小值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return short 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static short min(short a, final short b, final short c) {
        return org.apache.commons.lang3.math.NumberUtils.min(a, b, c);
    }

    /**
     * 获取三个byte类型的参数中的最小值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return byte 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static byte min(byte a, final byte b, final byte c) {
        return org.apache.commons.lang3.math.NumberUtils.min(a, b, c);
    }

    /**
     * 获取三个double类型的参数中的最小值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return double 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static double min(final double a, final double b, final double c) {
        return org.apache.commons.lang3.math.NumberUtils.min(a, b, c);
    }

    /**
     * 获取三个float类型的参数中的最小值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return float 最小值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static float min(final float a, final float b, final float c) {
        return org.apache.commons.lang3.math.NumberUtils.min(a, b, c);
    }

    /**
     * 比较传入的一组long类型数字，返回其中最大值
     *
     * @param array
     *            一组用于比较的long类型的数字
     * @return long 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static long max(final long... array) {
        return org.apache.commons.lang3.math.NumberUtils.max(array);
    }

    /**
     * 比较传入的一组int类型数字，返回其中最大值
     *
     * @param array
     *            一组用于比较的int类型的数字
     * @return int 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int max(final int... array) {
        return org.apache.commons.lang3.math.NumberUtils.max(array);
    }

    /**
     * 比较传入的一组short类型数字，返回其中最大值
     *
     * @param array
     *            一组用于比较的short类型的数字
     * @return short 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static short max(final short... array) {
        return org.apache.commons.lang3.math.NumberUtils.max(array);
    }

    /**
     * 比较传入的一组byte类型数字，返回其中最大值
     *
     * @param array
     *            一组用于比较的byte类型的数字
     * @return byte 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static byte max(final byte... array) {
        return org.apache.commons.lang3.math.NumberUtils.max(array);
    }

    /**
     * 比较传入的一组double类型数字，返回其中最大值
     *
     * @param array
     *            一组用于比较的double类型的数字
     * @return double 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static double max(final double... array) {
        return org.apache.commons.lang3.math.NumberUtils.max(array);
    }

    /**
     * 比较传入的一组float类型数字，返回其中最大值
     *
     * @param array
     *            一组用于比较的float类型的数字
     * @return float 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static float max(final float... array) {
        return org.apache.commons.lang3.math.NumberUtils.max(array);
    }

    /**
     * 获取三个long类型的参数中的最大值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return long 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static long max(long a, final long b, final long c) {
        return org.apache.commons.lang3.math.NumberUtils.max(a, b, c);
    }

    /**
     * 获取三个int类型的参数中的最大值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return int 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int max(int a, final int b, final int c) {
        return org.apache.commons.lang3.math.NumberUtils.max(a, b, c);
    }












    /**
     * 获取三个short类型的参数中的最大值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return short 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static short max(short a, final short b, final short c) {
        return org.apache.commons.lang3.math.NumberUtils.max(a, b, c);
    }

    /**
     * 获取三个byte类型的参数中的最大值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return byte 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static byte max(byte a, final byte b, final byte c) {
        return org.apache.commons.lang3.math.NumberUtils.max(a, b, c);
    }

    /**
     * 获取三个double类型的参数中的最大值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return double 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static double max(final double a, final double b, final double c) {
        return org.apache.commons.lang3.math.NumberUtils.max(a, b, c);
    }

    /**
     * 获取三个float类型的参数中的最大值
     *
     * @param a
     *            被比较的第一个数
     * @param b
     *            被比较的第二个数
     * @param c
     *            被比较的第三个数
     * @return float 最大值
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static float max(final float a, final float b, final float c) {
        return org.apache.commons.lang3.math.NumberUtils.max(a, b, c);
    }

    // -----------------------------------------------------------------------
    /**
     * 判断字符串是否只包含数字字符
     *
     * @param str
     *            被测试的字符串
     * @return boolean 如果字符串只包含数字字符，则返回true，否则返回false
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static boolean isDigits(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.isDigits(str);
    }

    /**
     * 判断字符串是否是一个有效的Java数字格式的字符串，包括十进制，八进制和十六进制的字符串
     *
     * @param str
     *            被测试的字符串
     * @return boolean 如果是一个有效的Java数字格式的字符串，则返回true，否则返回false
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static boolean isNumber(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.isNumber(str);
    }

    /**
     * 判断字符串是否能够转换成数字
     *
     * @param str
     *            被测试的字符串
     * @return boolean 如果字符串能够转换成数字,则返回true，否则返回false
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static boolean isParsable(final String str) {
        return org.apache.commons.lang3.math.NumberUtils.isParsable(str);
    }

    /**
     * 比较两个int类型的参数，如果第一个参数大于第二个参数则返回1，如果第一个参数等于第二个参数则返回0，如果第一个参数小于第二个参数返回-1
     *
     * @param x
     *            被比较的第一个数
     * @param y
     *            被比较的第二个数
     * @return int 如果第一个参数大于第二个参数则返回1，如果第一个参数等于第二个参数则返回0，如果第一个参数小于第二个参数返回-1
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int compare(int x, int y) {
        return org.apache.commons.lang3.math.NumberUtils.compare(x, y);
    }

    /**
     * 比较两个long类型的参数，如果第一个参数大于第二个参数则返回1，如果第一个参数等于第二个参数则返回0，如果第一个参数小于第二个参数返回-1
     *
     * @param x
     *            被比较的第一个数
     * @param y
     *            被比较的第二个数
     * @return long 如果第一个参数大于第二个参数则返回1，如果第一个参数等于第二个参数则返回0，如果第一个参数小于第二个参数返回-1
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int compare(long x, long y) {
        return org.apache.commons.lang3.math.NumberUtils.compare(x, y);
    }

    /**
     * 比较两个short类型的参数，如果第一个参数大于第二个参数则返回1，如果第一个参数等于第二个参数则返回0，如果第一个参数小于第二个参数返回-1
     *
     * @param x
     *            被比较的第一个数
     * @param y
     *            被比较的第二个数
     * @return short 如果第一个参数大于第二个参数则返回1，如果第一个参数等于第二个参数则返回0，如果第一个参数小于第二个参数返回-1
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int compare(short x, short y) {
        return org.apache.commons.lang3.math.NumberUtils.compare(x, y);
    }

    /**
     * 比较两个byte类型的参数，返回 第一个参数减去第二个参数的差
     *
     * @param x
     *            被比较的第一个数
     * @param y
     *            被比较的第二个数
     * @return int 返回 第一个参数减去第二个参数的差
     *
     * @author 蔡楚涛
     * @version 2016-3-28
     * @since V0.2.0
     */
    public static int compare(byte x, byte y) {
        return org.apache.commons.lang3.math.NumberUtils.compare(x, y);
    }

    // ---------------------------------------------------------------------
    // 平台原有方法
    // ---------------------------------------------------------------------

    /**
     * 计算两个String数据之和 return d1 + d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal add(String d1, String d2) {
        if (!isNumeric(d1, d2)) {
            log.info("要进行相加的字符串为D1：" + d1 + "\tD2：" + d2 + "\t 其中包含非数字，不能进行运算。");
            return null;
        }
        return add(new BigDecimal(d1), new BigDecimal(d2));
    }

    /**
     * 计算两个Number数据之和 return d1 + d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal add(Number d1, Number d2) {
        return parseNumToBigDecimal(d1).add(parseNumToBigDecimal(d2));
    }

    /**
     * 计算两个BigDecimal数据之和 return d1 + d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal add(BigDecimal d1, BigDecimal d2) {
        return d1.add(d2);
    }

    /**
     * 计算两个String数据之差return d1 - d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal subtract(String d1, String d2) {
        if (!isNumeric(d1, d2)) {
            log.info("要进行相减的字符串为D1：" + d1 + "\tD2：" + d2 + "\t 其中包含非数字，不能进行运算。");
            return null;
        }
        return subtract(new BigDecimal(d1), new BigDecimal(d2));
    }

    /**
     * 计算两个Number数据之差return d1 - d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal subtract(Number d1, Number d2) {
        return parseNumToBigDecimal(d1).subtract(parseNumToBigDecimal(d2));
    }

    /**
     * 计算两个BigDecimal数据之差return d1 - d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal subtract(BigDecimal d1, BigDecimal d2) {
        return d1.subtract(d2);
    }

    /**
     * 计算两个String数据之乘return d1 * d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal multiply(String d1, String d2) {
        if (!isNumeric(d1, d2)) {
            log.info("要进行相乘的字符串为D1：" + d1 + "\tD2：" + d2 + "\t 其中包含非数字，不能进行运算。");
            return null;
        }
        return multiply(new BigDecimal(d1), new BigDecimal(d2));
    }

    /**
     * 计算两个Number数据之乘return d1 * d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal multiply(Number d1, Number d2) {
        return parseNumToBigDecimal(d1).multiply(parseNumToBigDecimal(d2));
    }

    /**
     * 计算两个BigDecimal数据之乘return d1 * d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal multiply(BigDecimal d1, BigDecimal d2) {
        return d1.multiply(d2);
    }

    /**
     * 计算两个String数据之除return d1/d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal divide(String d1, String d2) {
        if (!isNumeric(d1, d2)) {
            log.info("要进行相除的字符串为D1：" + d1 + "\tD2：" + d2 + "\t 其中包含非数字，不能进行运算。");
            return null;
        }
        return divide(new BigDecimal(d1), new BigDecimal(d2));
    }

    /**
     * 计算两个String数据之除return d1/d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal divide(String d1, String d2, int scale) {
        if (!isNumeric(d1, d2)) {
            log.info("要进行相除的字符串为D1：" + d1 + "\tD2：" + d2 + "\t 其中包含非数字，不能进行运算。");
            return null;
        }
        return divide(new BigDecimal(d1), new BigDecimal(d2), scale);
    }

    /**
     * 计算两个String数据之除return d1/d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal divide(String d1, String d2, int scale, int roundingMode) {
        if (!isNumeric(d1, d2)) {
            log.info("要进行相除的字符串为D1：" + d1 + "\tD2：" + d2 + "\t 其中包含非数字，不能进行运算。");
            return null;
        }
        return divide(new BigDecimal(d1), new BigDecimal(d2), scale, roundingMode);
    }

    /**
     * 计算两个Number数据之除return d1/d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal divide(Number d1, Number d2) {
        return parseNumToBigDecimal(d1).divide(parseNumToBigDecimal(d2));
    }

    /**
     * 计算两个Number数据之除return d1/d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @param roundingMode
     *            修约方式
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal divide(Number d1, Number d2, int roundingMode) {
        return parseNumToBigDecimal(d1).divide(parseNumToBigDecimal(d2), roundingMode);
    }

    /**
     * 计算两个BigDecimal数据之除return d1/d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal divide(BigDecimal d1, BigDecimal d2, int scale) {
        return divide(d1, d2, scale);
    }

    /**
     * 计算两个Number数据之除return d1/d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal divide(Number d1, Number d2, int scale, int roundingMode) {
        return parseNumToBigDecimal(d1).divide(parseNumToBigDecimal(d2), scale, roundingMode);
    }

    /**
     * 计算两个BigDecimal数据之除return d1/d2
     *
     * @param d1
     *            参数1
     * @param d2
     *            参数2
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal divide(BigDecimal d1, BigDecimal d2, int scale, int roundingMode) {
        return d1.divide(d2, scale, roundingMode);
    }

    /**
     * 多个String数字求和
     *
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal sum(String... args) {
        if (!isNumeric(args)) {
            log.info("要进行计算的字符串为：" + args + "\t包含非数字，不能进行计算！");
            return null;
        }
        List<Number> list = new ArrayList<Number>();
        for (String bg : args) {
            list.add(new BigDecimal(bg));
        }
        return sumNumberList(list);
    }

    /**
     * 多个Number数字求和
     *
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal sum(Number... args) {
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        for (Number num : args) {
            list.add(parseNumToBigDecimal(num));
        }
        return sumBigDecimalList(list);
    }

    /**
     * 多个BigDecimal数字求和
     *
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal sum(BigDecimal... args) {
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        for (BigDecimal bg : args) {
            list.add(bg);
        }
        return sumBigDecimalList(list);
    }

    /**
     * 多个数字求和
     *
     * @param args
     *            数据集合
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal sumStringList(List<String> args) {
        List<Number> list = new ArrayList<Number>();
        for (String bg : args) {
            if (!isNumeric(bg)) {
                log.info("要进行计算的字符串为：" + bg + "\t包含非数字，不能进行计算！");
                return null;
            }
            list.add(new BigDecimal(bg));
        }
        return sumNumberList(list);
    }

    /**
     * 多个数字求和
     *
     * @param args
     *            数据集合
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal sumNumberList(List<Number> args) {
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        for (Number bg : args) {
            list.add(parseNumToBigDecimal(bg));
        }
        return sumBigDecimalList(list);
    }



    /**
     * 多个数字求和
     *
     * @param args
     *            数据集合
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal sumBigDecimalList(List<BigDecimal> args) {
        BigDecimal result = new BigDecimal("0");
        for (BigDecimal bg : args) {
            result = add(result, bg);
        }
        return result;
    }

    /**
     * 多个String数据求平均值
     *
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(String... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length));
    }

    /**
     * 多个String数据求平均值
     *
     * @param scale
     *            小数位数
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(int scale, String... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length), scale);
    }

    /**
     * 多个String数据求平均值
     *
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(int scale, int roundingMode, String... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length), scale, roundingMode);
    }

    /**
     * 多个BigDecimal数据求平均值
     *
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(BigDecimal... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length));
    }

    /**
     * 多个BigDecimal数据求平均值
     *
     * @param scale
     *            小数位数
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(int scale, BigDecimal... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length), scale);
    }

    /**
     * 多个BigDecimal数据求平均值
     *
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(int scale, int roundingMode, BigDecimal... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length), scale, roundingMode);
    }

    /**
     * 多个Number数据求平均值
     *
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(Number... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length));
    }

    /**
     * 多个Number数据求平均值
     *
     * @param scale
     *            小数位数
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(int scale, Number... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length), scale);
    }

    /**
     * 多个Number数据求平均值
     *
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @param args
     *            可变长参数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal average(int scale, int roundingMode, Number... args) {
        return divide(sum(args), parseNumToBigDecimal(args.length), scale, roundingMode);
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageStringList(List<String> args) {
        return divide(sumStringList(args), parseNumToBigDecimal(args.size()));
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageStringList(List<String> args, int scale) {
        return divide(sumStringList(args), parseNumToBigDecimal(args.size()), scale);
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageStringList(List<String> args, int scale, int roundingMode) {
        return divide(sumStringList(args), parseNumToBigDecimal(args.size()), scale, roundingMode);
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageBigDecimalList(List<BigDecimal> args) {
        return divide(sumBigDecimalList(args), parseNumToBigDecimal(args.size()));
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageBigDecimalList(List<BigDecimal> args, int scale) {
        return divide(sumBigDecimalList(args), parseNumToBigDecimal(args.size()), scale);
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageBigDecimalList(List<BigDecimal> args, int scale, int roundingMode) {
        return divide(sumBigDecimalList(args), parseNumToBigDecimal(args.size()), scale, roundingMode);
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageNumberList(List<Number> args) {
        return divide(sumNumberList(args), parseNumToBigDecimal(args.size()));
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageNumberList(List<Number> args, int scale) {
        return divide(sumNumberList(args), parseNumToBigDecimal(args.size()), scale);
    }

    /**
     * 数据集合求平均值
     *
     * @param args
     *            数据集合
     * @param scale
     *            小数位数
     * @param roundingMode
     *            修约规则
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal averageNumberList(List<Number> args, int scale, int roundingMode) {
        return divide(sumNumberList(args), parseNumToBigDecimal(args.size()), scale, roundingMode);
    }

    /**
     * 对String数字进行四舍五入修约，或者给数字补零
     * >=5 进一位 1.5 --> 2
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfUp(String d1, int scale) {
        if (!isNumeric(d1)) {
            log.info("要进行四舍五入字符串为：" + d1 + "\t非数字，不能进行四舍五入。");
            return null;
        }
        return roundHalfUp(new BigDecimal(d1), scale);
    }

    /**
     * 对Number数字进行四舍五入修约，或者给数字补零
     * >=5 进一位 1.5 --> 2
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfUp(Number d1, int scale) {
        return parseNumToBigDecimal(d1).setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 对BigDecimal数字进行四舍五入修约，或者给数字补零
     * >=5 进一位 1.5 --> 2
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfUp(BigDecimal d1, int scale) {
        return d1.setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 对String数字进行五舍六入修约，或者给数字补零
     * >5 进一位 1.5 --> 1
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfDown(String d1, int scale) {
        if (!isNumeric(d1)) {
            log.info("要进行五舍六入字符串为：" + d1 + "\t非数字，不能进行五舍六入。");
            return null;
        }
        return roundHalfDown(new BigDecimal(d1), scale);
    }

    /**
     * 对Number数字进行五舍六入修约，或者给数字补零
     * >5 进一位 1.5 --> 1
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfDown(Number d1, int scale) {
        return parseNumToBigDecimal(d1).setScale(scale, BigDecimal.ROUND_HALF_DOWN);
    }

    /**
     * 对BigDecimal数字进行五舍六入修约，或者给数字补零
     * >5 进一位 1.5 --> 1
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfDown(BigDecimal d1, int scale) {
        return d1.setScale(scale, BigDecimal.ROUND_HALF_DOWN);
    }

    /**
     * 对String数字进行四舍六入五成双字修约，或者给数字补零
     * 修约方法四舍六进五成双 对于位数很多的近似数，当有效位数确定后，其后面多余的数字应该舍去，
     * 只保留有效数字最末一位，这种修约（舍入）规则是“四舍六入五成双”，也即“4舍6入5凑偶”这里“四”是指≤4 时舍去，
     * "六"是指≥6时进上，"五"指的是根据5后面的数字来定，当5后有数时，舍5入1；
     * 当5后无有效数字时，需要分两种情况来讲：①5前为奇数，舍5入1；②5前为偶数，舍5不进。（0是偶数）
     *
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfEven(String d1, int scale) {
        if (!isNumeric(d1)) {
            log.info("要进行四舍六入五成双字符串为：" + d1 + "\t非数字，不能进行四舍六入五成双。");
            return null;
        }
        return roundHalfEven(new BigDecimal(d1), scale);
    }

    /**
     * 对Number数字进行四舍六入五成双字修约，或者给数字补零
     * 修约方法四舍六进五成双 对于位数很多的近似数，当有效位数确定后，其后面多余的数字应该舍去，
     * 只保留有效数字最末一位，这种修约（舍入）规则是“四舍六入五成双”，也即“4舍6入5凑偶”这里“四”是指≤4 时舍去，
     * "六"是指≥6时进上，"五"指的是根据5后面的数字来定，当5后有数时，舍5入1；
     * 当5后无有效数字时，需要分两种情况来讲：①5前为奇数，舍5入1；②5前为偶数，舍5不进。（0是偶数）
     *
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfEven(Number d1, int scale) {
        return parseNumToBigDecimal(d1).setScale(scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 对BigDecimal数字进行四舍六入五成双字修约，或者给数字补零
     * 修约方法四舍六进五成双 对于位数很多的近似数，当有效位数确定后，其后面多余的数字应该舍去，
     * 只保留有效数字最末一位，这种修约（舍入）规则是“四舍六入五成双”，也即“4舍6入5凑偶”这里“四”是指≤4 时舍去，
     * "六"是指≥6时进上，"五"指的是根据5后面的数字来定，当5后有数时，舍5入1；
     * 当5后无有效数字时，需要分两种情况来讲：①5前为奇数，舍5入1；②5前为偶数，舍5不进。（0是偶数）
     *
     * @param d1
     *            要修约的原始数据
     * @param scale
     *            小数位数
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal roundHalfEven(BigDecimal d1, int scale) {
        return d1.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 转化数字类型为String
     * 2.5E4 --> 25000
     * @param num
     *            要转化的数字
     * @return String 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-10
     * @since V0.1.0
     */
    public static String parseNumberToString(Number num) {
        return parseNumToBigDecimal(num).toString();
    }

    /**
     * 转化数字类型为String
     * 2.5E4 --> 25000
     * @return String 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-10
     * @since V0.1.0
     */
    public static String parseNumberStrToString(String strNum) {
        if (isNumeric(strNum)) {
            return new BigDecimal(strNum).toString();
        } else {
            return strNum;
        }
    }

    /**
     * 转化数字格式为BigDecimal
     *
     * @param num
     *            要转化的数字
     * @return BigDecimal 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015-06-09
     * @since V0.1.0
     */
    public static BigDecimal parseNumToBigDecimal(Number num) {
        return new BigDecimal(String.valueOf(num));
    }

    /**
     * 判断是否为数字或科学计数法：如果是数字：返回true,否则返回false;
     *
     * @param args
     *            要判断的字符串
     * @return boolean 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015年6月9日
     * @since V0.1.0
     */
    public static boolean isNumeric(String... args) {
        for (String str : args) {
            if (!isNumeric(str)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否为数字或科学计数法：如果是数字：返回true,否则返回false;
     * @return boolean 返回结果
     * @throws
     *
     *             @author
     *             王吉红
     * @version 2015年6月9日
     * @since V0.1.0
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+.?[0-9]+E?[+,-]?[0-9]+");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }
}

