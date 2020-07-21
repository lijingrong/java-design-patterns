package com.lijingrong.visitor;

public interface Visitor {

    public void visit(HtmlElement htmlElement);

    public void visit(HtmlParentElement htmlParentElement);

}
