package com.lijingrong.facotrymethod;

public class FeedbackXmlDisplayService extends DisplayService{

    @Override
    protected XmlParser getXmlParser() {
        return new FeedbackXmlParser();
    }
}
