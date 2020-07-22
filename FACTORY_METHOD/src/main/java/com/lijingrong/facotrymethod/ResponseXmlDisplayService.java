package com.lijingrong.facotrymethod;

public class ResponseXmlDisplayService extends DisplayService {

    @Override
    protected XmlParser getXmlParser() {
        return new ResponseXmlParser();
    }
}
