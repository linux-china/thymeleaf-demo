package org.mvnsearch;

import org.junit.BeforeClass;
import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * thymeleaf test
 *
 * @author linux_china
 */
public class ThymeLeafTest {
    private static TemplateEngine templateEngine;

    @BeforeClass
    public static void setUp() throws Exception {
        templateEngine = new TemplateEngine();
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        resolver.setCharacterEncoding("utf-8");
        resolver.setOrder(1);
        templateEngine.setTemplateResolver(resolver);
    }

    @Test
    public void testRender() throws Exception {
        Context context = new Context();
        context.setVariable("nick", "雷卷");
        String html = templateEngine.process("index", context);
        System.out.println(html);
    }
}
