package com.shop.city.common.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeneralEnumTypeHandler<E extends Enum<?> & IntEnum> extends BaseTypeHandler<IntEnum> {
    private Class<E> clazz;

    public GeneralEnumTypeHandler(Class<E> clazz) {
        if (clazz == null){
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.clazz = clazz;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, IntEnum intEnum, JdbcType jdbcType) throws SQLException {
        ps.setInt(i,intEnum.getIntValue());
    }

    public <T extends Enum<?> & IntEnum>T convert(Class<T> clazz,int value){
        T[] enumConstants = clazz.getEnumConstants();
        for (T t : enumConstants){
            if (t.getIntValue() == value){
                return t;
            }
        }
        return null;
    }

    @Override
    public IntEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return this.convert(clazz,rs.getInt(columnName));
    }

    @Override
    public IntEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return this.convert(clazz,rs.getInt(columnIndex));
    }

    @Override
    public IntEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return this.convert(clazz,cs.getInt(columnIndex));
    }
}
