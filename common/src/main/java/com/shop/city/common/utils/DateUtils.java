package com.shop.city.common.utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class DateUtils {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat sDate=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
    private static final SimpleDateFormat wdate=new SimpleDateFormat("yyyy-MM-dd");

    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd  HH:mm");

    /**
     * 获取当前时间
     *
     * @return
     */
    public static long getCurrentTime() {
        return System.currentTimeMillis() / 1000;
    }

    /**
     * 获取链式类型的日期： yyyy-mm-dd  HH:mm:ss
     *
     * @return
     * @author Moon Yang
     * @since 2018-05-11
     */
    public static String getDate(Long time) {
        if(time == null){
            return null;
        }
        return sDate.format(new Date(time*1000));
    }

    /**
     * 获取链式类型的日期： yyyymmdd
     *
     * @return
     * @author Moon Yang
     * @since 2018-05-11
     */
    public static String getLinkDate() {
        return sdf.format(new Date());
    }

    /**
     * 获取指定时间戳的链式格式yyyymmdd
     *
     * @param times
     * @return
     */
    public static String getLinkDate(Long times) {
        return sdf.format(new Date(times));
    }

    /**
     * 获取指定时间戳的链式格式:yyyy-mm-dd
     * @param times
     * @return
     */
    public static String getLinkWorkDate(Long times) {
        return wdate.format(new Date(times));
    }

    /**
     * 将日期的long类型,加上月份时长，算出最后的日期 ，例如：药品的生产日期，和过期月数，算出最后的过期时间
     *
     * @return
     * @author Moon Yang
     * @since 2018-05-15
     */
    public static long parse(long ymd, Integer keepMonth) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(ymd);
        cal.add(Calendar.MONTH, keepMonth);
        Date date = cal.getTime();
        return date.getTime();
    }

    public static long parseAddDay(long ymd, Integer day) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(ymd);
        cal.add(Calendar.DAY_OF_MONTH, day);
        Date date = cal.getTime();
        return date.getTime();
    }

    public static Long parseTime(Long time) {
        if (time == null) {
            return null;
        }
        Long date = time / 1000L;
        return date;
    }

    /**
     * 获取当天凌晨0点秒数
     *
     * @param
     * @return java.lang.Long
     * @date 2018/6/8
     */
    public static Long getMilliseconds() {
        Long current = System.currentTimeMillis();
        Long zero = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();
        return zero / 1000;
    }

    /**
     * 获取当天23:59分秒数
     *
     * @param
     * @return java.lang.Long
     * @date 2018/6/8
     */
    public static Long getMillisecondsEnd() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
                23, 59, 59);
        Date date = calendar.getTime();
        return date.getTime()/1000;
    }

    /**
     * 计算结束时间，开始时间与单次时长，开始时间为毫秒数，单次时长为小时
     *
     * @param
     * @return java.lang.Long
     * @date 2018/6/8
     */
    public static Long getMillisecondsFinish(Long startTime, Integer hour) {
        return (startTime + hour * 3600000) / 1000;
    }

    /**
     * 根据时间戳计算当天凌晨毫秒数
     *
     * @param
     * @return java.lang.Long
     * @date 2018/7/26
     */
    public static Long getStartMilliseconds(Long startTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        //时
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        //分
        calendar.set(Calendar.MINUTE, 0);
        //秒
        calendar.set(Calendar.SECOND, 0);
        //毫秒
        calendar.set(Calendar.MILLISECOND, 0);
        //返回凌晨毫秒数
        return calendar.getTimeInMillis() / 1000;
    }

    /**
     * 根据时间戳计算当天7:00毫秒数
     *
     * @param
     * @return java.lang.Long
     * @date 2018/7/26
     */
    public static Long getStartMillisecondsAtSeven(Long startTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        //时
        calendar.set(Calendar.HOUR_OF_DAY, 7);
        //分
        calendar.set(Calendar.MINUTE, 0);
        //秒
        calendar.set(Calendar.SECOND, 0);
        //毫秒
        calendar.set(Calendar.MILLISECOND, 0);
        //返回凌晨毫秒数
        return calendar.getTimeInMillis() / 1000;
    }

    /**
     * 根据时间戳计算当天21:59毫秒数
     *
     * @param
     * @return java.lang.Long
     * @date 2018/7/26
     */
    public static Long getEndMillisecondsAtTen(Long startTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        //时
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        //分
        calendar.set(Calendar.MINUTE, 59);
        //秒
        calendar.set(Calendar.SECOND, 59);
        //毫秒
        calendar.set(Calendar.MILLISECOND, 999);
        //返回凌晨毫秒数
        return calendar.getTimeInMillis() / 1000;
    }

    /**
     * 根据时间戳计算当天23:59毫秒数
     *
     * @param
     * @return java.lang.Long
     * @date 2018/7/26
     */
    public static Long getEndMilliseconds(Long startTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        //时
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        //分
        calendar.set(Calendar.MINUTE, 59);
        //秒
        calendar.set(Calendar.SECOND, 59);
        //毫秒
        calendar.set(Calendar.MILLISECOND, 999);
        //返回23:59毫秒数
        return calendar.getTimeInMillis() / 1000;
    }

    /**
     * 获取当前月第一天的00:00:00毫秒数
     * @param
     * @date 2018/8/30
     * @return java.lang.Long
     */
    public static Long getStartMillisecondsMonth(){
        //获取当前月第一天：
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH),
                00, 00, 00);
        return c.getTimeInMillis()/1000;
    }

    /**
     * 获取当前月最后一天的23:59:59毫秒数
     * @param
     * @date 2018/8/30
     * @return java.lang.Long
     */
    public static Long getEndMillisecondsMonth(){
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        //将小时至0
        ca.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至0
        ca.set(Calendar.MINUTE, 59);
        //将秒至0
        ca.set(Calendar.SECOND,59);
        //将毫秒至0
        ca.set(Calendar.MILLISECOND, 999);
        return ca.getTimeInMillis()/1000;
    }

    public static String paseMillToDate(Long time){
        if (time == null || time == 0 ){
            return "";
        }
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis((System.currentTimeMillis()/1000)*1000);
        Date date = c.getTime();
        return dateFormat.format(date);
    }

    // 获得某天最大时间 2017-10-15 23:59:59
    public static Date getEndOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        ;
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    // 获得某天最小时间 2017-10-15 00:00:00
    public static Date getStartOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 把long 转换成 日期 再转换成String类型
     */
    public static String transferLongToDate( Long millSec) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(millSec);
        return sdf.format(date);
    }
    public static String dateToString(Date data, String formatType) {
        return new SimpleDateFormat(formatType).format(data);
    }

    public static String getDatePoor(Date endDate, Date nowDate) {

        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - nowDate.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        // long sec = diff % nd % nh % nm / ns;
        return  day + "天" + hour + "小时" + min + "分钟";
    }

}
