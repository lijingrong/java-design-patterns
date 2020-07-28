package com.lijingrong.abstractfactory;

public class NYParserFactory implements AbstractParserFactory {

    @Override
    public XmlParser getParserInstance(String parserType) {
        switch (parserType) {
            case "nyerror":
                return new NYErrorXMLParser();
            case "nyfeedback":
                return new NYFeedbackXMLParser();
            case "nyorder":
                return new NYOrderXMLParser();
            case "nyresponse":
                return new NYResponseXMLParser();
        }
        return null;
    }
}
