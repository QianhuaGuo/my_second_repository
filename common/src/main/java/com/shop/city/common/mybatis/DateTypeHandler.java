package com.shop.city.common.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;

/**
 * 日期时间转换为时间戳秒
 * java.util.Date 与 int(11)转换类型处理
 */
public class DateTypeHandler extends BaseTypeHandler<Date> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType) throws SQLException {
        ps.setLong(i,parameter.getTime()/1000);
    }

    @Override
    public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Long time = rs.getLong(columnName);
        if (time != null || time !=0L){
            return new Date(time * 1000);
        }
        return null;
    }

    @Override
    public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Long time = rs.getLong(columnIndex);
        if (time != null || time != 0L){
            return new Date(time * 1000);
        }
        return null;
    }

    @Override
    public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Long time = cs.getLong(columnIndex);
        if (time != null || time != 0L){
            return new Date(time * 1000);
        }
        return null;
    }
}
