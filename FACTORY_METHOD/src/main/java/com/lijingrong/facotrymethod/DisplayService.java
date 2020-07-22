package com.lijingrong.facotrymethod;

public abstract class DisplayService {

    public void display() {
        XmlParser xmlParser = getXmlParser();
        String message = xmlParser.parser();
        System.out.println(message);
    }

    protected abstract XmlParser getXmlParser();
}
