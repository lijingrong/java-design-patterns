package com.lijingrong.visitor;

public class HtmlElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName, String startTag, String endTag) {
        this.tagName = tagName;
        this.startTag = startTag;
        this.endTag = endTag;
    }

    @Override
    public String getTagName() {
        return this.tagName;
    }

    @Override
    public String getStartTag() {
        return this.startTag;
    }

    public void setStartTag(String startTag) {
        this.startTag = startTag;
    }

    @Override
    public String getEndTag() {
        return this.endTag;
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag + tagBody + endTag);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
