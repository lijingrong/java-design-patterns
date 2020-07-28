package com.lijingrong.abstractfactory;

public class NYResponseXMLParser implements XmlParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing response XML...");
        return "NY Response XML Message";
    }
}
