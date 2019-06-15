package com.lijingrong.adapter;

public class ConsumeNewPagination {

    public static void consume(NewPagination newPagination) {
        System.out.format("offset:%d,total:%d,pageSize:%d",
                newPagination.offset(), newPagination.total(), newPagination.pageSize());
    }
}
