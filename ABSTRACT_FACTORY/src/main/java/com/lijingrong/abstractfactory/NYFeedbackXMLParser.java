package com.lijingrong.abstractfactory;

public class NYFeedbackXMLParser implements XmlParser {

    @Override
    public String parse() {
        System.out.println("NY Parsing feedback XML...");
        return "NY Feedback XML Message";
    }
}
