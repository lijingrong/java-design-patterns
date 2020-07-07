package com.lijingrong.cor;

public class TestChainOfResponsibility {

    public static void main(String[] args) {

        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");

        textHandler.setHandler(docHandler);

        File file = new File("abc.txt","text","d:");
        textHandler.process(file);
        file = new File("abc.doc", "doc", "e:");
        textHandler.process(file);
        file = new File("abc.sh", "sh", "f:");
        textHandler.process(file);
    }
}
