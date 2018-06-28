package com.peppa.yec.demo.util;

import java.util.List;

/**
 * @author zyf
 */
public class ListPage {
    private Integer offset;
    private Integer pageNo;
    private Integer pageSize;
    private Integer count;
    private Integer pageCount;
    private List list;

    public Integer getOffset() {
        return offset;
    }


    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        this.offset = (pageNo-1) * pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
        this.pageCount = (count + pageSize -1) / pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
