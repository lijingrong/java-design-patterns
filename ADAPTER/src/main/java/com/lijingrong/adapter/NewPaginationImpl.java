package com.lijingrong.adapter;

public class NewPaginationImpl implements NewPagination {

    private long offset;
    private long total;
    private int pageSize;

    public NewPaginationImpl(long offset, long total, int pageSize) {
        this.offset = offset;
        this.total = total;
        this.pageSize = pageSize;
    }

    @Override
    public long offset() {
        return 0;
    }

    @Override
    public long total() {
        return 0;
    }

    @Override
    public int pageSize() {
        return 0;
    }
}
