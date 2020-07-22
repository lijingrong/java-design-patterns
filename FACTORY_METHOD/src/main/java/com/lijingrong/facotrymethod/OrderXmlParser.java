package com.lijingrong.facotrymethod;

public class OrderXmlParser implements XmlParser{

    @Override
    public String parser() {
        System.out.println("Parser Order xml...");
        return "Order XML Message";
    }
}
