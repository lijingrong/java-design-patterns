package com.lijingrong.abstractfactory;

public class TestAbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getParserFactory("nyfactory");
        XmlParser xmlParser = parserFactory.getParserInstance("nyerror");
        System.out.println(xmlParser.parse());

        xmlParser = parserFactory.getParserInstance("nyfeedback");
        System.out.println(xmlParser.parse());
    }
}
