package com.shop.city.common.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * @author huanglei
 * @date 2013年9月18日 下午3:39:59
 */
@ApiModel("分页模型")
public class Query {
    /**
     * 数据偏移 (数据库用)
     */
    @ApiModelProperty(hidden = true)
    private int offset;

    /**
     * 每页记录
     */
    @ApiModelProperty(name = "limit", value = "每页记录")
    private int limit = 20;

    /**
     * 当前页
     */
    @ApiModelProperty(name = "page", value = "当前页")
    private int page = 1;

    /**
     * @return the offset
     */
    public int getOffset() {
        offset = (page - 1) * limit;
        return offset;
    }

    /**
     * @param offset
     *            the offset to set
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * @return the limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * @param limit
     *            the limit to set
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page
     *            the page to set
     */
    public void setPage(int page) {
        if (page <= 0) {
            page = 1;
        }
        this.page = page;
    }

    public Map<String, Object> transformToMap() {
        return BeanUtils.copyMap(this);
    }

}
