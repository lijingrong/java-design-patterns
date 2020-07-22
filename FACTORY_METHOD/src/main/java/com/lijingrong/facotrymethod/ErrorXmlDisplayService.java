package com.lijingrong.facotrymethod;

public class ErrorXmlDisplayService extends DisplayService {

    @Override
    protected XmlParser getXmlParser() {
        return new ErrorXmlParser();
    }
}
