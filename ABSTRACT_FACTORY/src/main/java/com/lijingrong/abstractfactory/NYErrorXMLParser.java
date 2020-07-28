package com.lijingrong.abstractfactory;

public class NYErrorXMLParser implements XmlParser {

    @Override
    public String parse() {
        System.out.println("NY Parsing error XML...");
        return "NY Error XML Message";
    }
}
