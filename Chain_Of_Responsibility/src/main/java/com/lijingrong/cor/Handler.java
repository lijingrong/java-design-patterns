package com.lijingrong.cor;

public interface Handler {

    void setHandler(Handler handler);

    void process(File file);

    String getHandlerName();

}
