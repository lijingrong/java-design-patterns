package com.lijingrong.visitor;

public class StyleVisitor implements Visitor {

    @Override
    public void visit(HtmlElement htmlElement) {
        htmlElement.setStartTag(htmlElement.getStartTag()
                .replace(">", " style='width:100px'>"));
    }

    @Override
    public void visit(HtmlParentElement htmlParentElement) {
        htmlParentElement.setStartTag(htmlParentElement.getStartTag()
                .replace(">", " style='width:100px'>"));
    }
}
