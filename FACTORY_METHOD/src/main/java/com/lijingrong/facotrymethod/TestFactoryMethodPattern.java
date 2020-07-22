package com.lijingrong.facotrymethod;

public class TestFactoryMethodPattern {

    public static void main(String[] args) {
        DisplayService displayService = new FeedbackXmlDisplayService();
        displayService.display();
        displayService = new OrderXmlDisplayService();
        displayService.display();
        displayService = new ErrorXmlDisplayService();
        displayService.display();
        displayService = new ResponseXmlDisplayService();
        displayService.display();
    }
}
