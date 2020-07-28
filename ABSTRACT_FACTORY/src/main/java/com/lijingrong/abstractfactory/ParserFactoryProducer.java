package com.lijingrong.abstractfactory;

public final class ParserFactoryProducer {

    private ParserFactoryProducer() {
    }

    public static AbstractParserFactory getParserFactory(String factoryType) {

        if ("nyfactory".equals(factoryType)) {
            return new NYParserFactory();
        }
        return null;
    }
}
