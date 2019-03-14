open module lombok.test.module {
    requires static lombok;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.boot.starter.logging;
    requires spring.web;
    requires com.sun.xml.bind;
    requires slf4j.api;

    exports com.poc.jigsaw.lombok.lombokmodule;
}