package com.lijingrong.facotrymethod;

public class ErrorXmlParser implements XmlParser {

    @Override
    public String parser() {
        System.out.println("Parser Error Xml...");
        return "Error XML Message";
    }
}
