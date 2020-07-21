package com.lijingrong.visitor;

public abstract class HtmlTag implements Element {

    public abstract String getTagName();

    public abstract String getStartTag();

    public abstract String getEndTag();

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Current operation is not support ←􏰀 for this object");
    }

    public void addChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Current operation is not support ←􏰀 for this object");
    }

    public abstract void generateHtml();
}
