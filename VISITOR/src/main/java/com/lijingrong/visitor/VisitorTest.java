package com.lijingrong.visitor;

public class VisitorTest {

    public static void main(String[] args) {
        Visitor cssVisitor = new CssClassVisitor();
        Visitor styleVisitor = new StyleVisitor();
        HtmlTag html = new HtmlParentElement("html", "<html>", "</html>");
        HtmlTag body = new HtmlParentElement("body", "<body>", "</body>");
        HtmlTag p = new HtmlElement("p", "<p>", "</p>");
        p.setTagBody("这是一个段落！");
        p.accept(cssVisitor);

        body.addChildTag(p);
        body.accept(cssVisitor);
        body.accept(styleVisitor);

        html.addChildTag(body);
        html.accept(cssVisitor);
        html.accept(styleVisitor);

        html.generateHtml();
    }
}
