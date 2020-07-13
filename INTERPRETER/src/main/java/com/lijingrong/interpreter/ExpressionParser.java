package com.lijingrong.interpreter;

import java.util.Stack;

public class ExpressionParser {

    Stack<Expression> stack = new Stack<>();

    public int parser(String str) {
        String[] tokenList = str.split(" ");
        for (String tokenStr : tokenList) {
            if (!ParserUtil.isOperator(tokenStr)) {
                Expression numberExpression = new NumberExpression(tokenStr);
                stack.push(numberExpression);
            } else {
                int result = ParserUtil.getExpressionObject(stack.pop(), stack.pop(), tokenStr).interpret();
                stack.push(new NumberExpression(result));
            }
        }
        return stack.pop().interpret();
    }

    public static void main(String[] args) {
        String str = "2 1 5 + *";
        ExpressionParser parser = new ExpressionParser();
        int result = parser.parser(str);
        System.out.println(result);
    }
}
