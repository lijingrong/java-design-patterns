package com.lijingrong.facotrymethod;

public class FeedbackXmlParser implements XmlParser{

    @Override
    public String parser() {
        System.out.println("Parser Feedback xml...");
        return "Feedback XML Message";
    }
}
