package com.lijingrong.visitor;

public class HtmlTest {

    public static void main(String[] args) {
        HtmlTag html = new HtmlParentElement("html", "<html>", "</html>");
        HtmlTag body = new HtmlParentElement("body", "<body>", "</body>");
        HtmlTag p = new HtmlElement("p", "<p>", "</p>");
        p.setTagBody("这是一个段落！");
        body.addChildTag(p);
        html.addChildTag(body);
        html.generateHtml();
    }
}
