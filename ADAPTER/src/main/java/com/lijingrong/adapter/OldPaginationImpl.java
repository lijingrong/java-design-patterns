package com.lijingrong.adapter;

public class OldPaginationImpl implements OldPagination {

    private long pageIndex;
    private long total;
    private int pageSize;

    public OldPaginationImpl(long pageIndex, long total, int pageSize) {
        this.pageIndex = pageIndex;
        this.total = total;
        this.pageSize = pageSize;
    }

    @Override
    public long pageIndex() {
        return pageIndex;
    }

    @Override
    public int pageSize() {
        return pageSize;
    }

    @Override
    public long total() {
        return total;
    }
}
