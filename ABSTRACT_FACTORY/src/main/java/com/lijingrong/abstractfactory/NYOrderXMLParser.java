package com.lijingrong.abstractfactory;

public class NYOrderXMLParser implements XmlParser {

    @Override
    public String parse() {
        System.out.println("NY Parsing order XML...");
        return "NY Order XML Message";
    }
}
