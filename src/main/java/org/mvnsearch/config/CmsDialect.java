package org.mvnsearch.config;

import org.thymeleaf.Arguments;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.processor.attr.AbstractUnescapedTextChildModifierAttrProcessor;

import java.util.HashSet;
import java.util.Set;

/**
 * 自定义 thymeleaf cms 标签
 *
 * @author linux_china
 */
public class CmsDialect extends AbstractDialect {

    @Override
    public String getPrefix() {
        return "cms";
    }

    @Override
    public Set<IProcessor> getProcessors() {
        final Set<IProcessor> processors = new HashSet<>();
        processors.add(new AbstractUnescapedTextChildModifierAttrProcessor("fragment") {
            @Override
            protected String getText(Arguments arguments, Element element, String attributeName) {
                String attributeValue = element.getAttributeValue(attributeName);
                return attributeValue + "1";
            }

            @Override
            public int getPrecedence() {
                return 100;
            }
        });
        return processors;
    }
}
