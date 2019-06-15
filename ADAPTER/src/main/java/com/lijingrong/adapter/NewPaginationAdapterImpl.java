package com.lijingrong.adapter;

public class NewPaginationAdapterImpl implements NewPagination {

    private OldPagination oldPagination;

    public NewPaginationAdapterImpl(OldPagination oldPagination) {
        this.oldPagination = oldPagination;
    }

    @Override
    public long offset() {
        return oldPagination.pageIndex() * oldPagination.pageSize();
    }

    @Override
    public long total() {
        return oldPagination.total();
    }

    @Override
    public int pageSize() {
        return oldPagination.pageSize();
    }
}
