package com.lijingrong.abstractfactory;


public interface AbstractParserFactory {
    public XmlParser getParserInstance(String parserType);
}
