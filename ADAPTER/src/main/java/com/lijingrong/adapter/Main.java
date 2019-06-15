package com.lijingrong.adapter;

public class Main {

    public static void main(String[] args) {
        OldPagination old = new OldPaginationImpl(1,20,10);
        NewPagination adapter = new NewPaginationAdapterImpl(old);
        ConsumeNewPagination.consume(adapter);
    }
}
