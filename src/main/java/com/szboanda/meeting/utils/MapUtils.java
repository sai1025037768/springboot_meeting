package com.szboanda.meeting.utils;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class MapUtils {

    /**
     * 获取整型值
     *
     * @param map
     * @param key
     * @return
     */
    public static int getInt(Map<String, Object> map, String key) {
        int result;
        Object value = map.get(key);
        if (value instanceof String) {
            result = NumberUtils.createInteger((String) value);
        } else {
            result = value == null ? 0 : (Integer) value;
        }
        return result;
    }

    /**
     * 获取长整型值
     *
     * @param map
     * @param key
     * @return
     */
    public static long getLong(Map<String, Object> map, String key) {
        long result;
        Object value = map.get(key);
        if (value instanceof String) {
            result = NumberUtils.createLong((String) value);
        } else {
            result = value == null ? 0 : (Long) value;
        }
        return result;
    }

    /**
     * 获取浮点数值
     *
     * @param map
     * @param key
     * @return
     */
    public static float getFloat(Map<String, Object> map, String key) {
        float result;
        Object value = map.get(key);
        if (value instanceof String) {
            result = NumberUtils.createFloat((String) value);
        } else {
            result = value == null ? 0F : (Float) value;
        }
        return result;
    }

    /**
     * 获取浮点数值
     *
     * @param map
     * @param key
     * @return
     */
    public static double getDouble(Map<String, Object> map, String key) {
        double result;
        Object value = map.get(key);
        if (value instanceof String) {
            result = NumberUtils.createDouble((String) value);
        } else {
            result = value == null ? 0D : (Double) value;
        }
        return result;
    }

    /**
     * 获取浮点数值
     *
     * @param map
     * @param key
     * @scale scale 进度数
     * @return
     */
    public static BigDecimal getBigDecimal(Map<String, Object> map, String key, int scale) {
        BigDecimal result;
        Object value = map.get(key);
        if (value instanceof String) {
            result = NumberUtils.createBigDecimal((String) value);
        } else {
            result = value == null ? new BigDecimal("0") : new BigDecimal(getString(map, key));
        }
        return result.setScale(scale);
    }

    /**
     * 获取string值
     *
     * @param map
     * @param key
     * @return
     */
    public static String getString(Map<String, Object> map, String key) {
        return map.get(key) == null ? "" : "" + map.get(key);
    }

    /**
     * 获取布尔值
     *
     * @param map
     * @param key
     * @return
     */
    public static boolean getBoolean(Map<String, Object> map, String key) {
        boolean result;
        Object value = map.get(key);
        if (value instanceof String) {
            result = Boolean.valueOf((String) value);
        } else {
            result = value == null ? false : (Boolean) value;
        }
        return result;
    }

    /**
     * 获取布尔值
     *
     * @param map
     * @param key
     * @return
     */
    public static char getChar(Map<String, Object> map, String key) {
        return map.get(key) == null ? null : (Character) map.get(key);
    }

    /**
     * 获取java.utils.date值
     *
     * @param map
     * @param key
     * @return
     */
    public static java.util.Date getUtilDate(Map<String, Object> map, String key) {
        return map.get(key) == null ? null : (java.util.Date) map.get(key);
    }

    /**
     * 获取java.utils.date值
     *
     * @param map
     * @param key
     * @return
     */
    public static java.sql.Timestamp getTimestamp(Map<String, Object> map, String key) {
        return map.get(key) == null ? null : (java.sql.Timestamp) map.get(key);
    }

}