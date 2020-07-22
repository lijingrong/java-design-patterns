package com.lijingrong.facotrymethod;

public class OrderXmlDisplayService extends DisplayService {

    @Override
    protected XmlParser getXmlParser() {
        return new OrderXmlParser();
    }
}
