package com.lijingrong.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName, String startTag, String endTag) {
        this.tagName = tagName;
        this.startTag = startTag;
        this.endTag = endTag;
        this.childrenTag = new ArrayList<>();
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
    public void addChildTag(HtmlTag htmlTag) {
        this.childrenTag.add(htmlTag);
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for (HtmlTag tag : childrenTag) {
            tag.generateHtml();
        }
        System.out.println(endTag);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
