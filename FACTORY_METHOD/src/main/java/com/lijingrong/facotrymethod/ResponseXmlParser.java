package com.lijingrong.facotrymethod;

public class ResponseXmlParser implements XmlParser {

    @Override
    public String parser() {
        System.out.println("Parser Response xml...");
        return "Response XML Message";
    }
}
