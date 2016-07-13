package org.mvnsearch.config;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IModel;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.processor.element.AbstractAttributeModelProcessor;
import org.thymeleaf.processor.element.IElementModelStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.Collections;
import java.util.Set;

/**
 * 自定义 thymeleaf cms 标签
 *
 * @author linux_china
 */
public class CmsDialect extends AbstractProcessorDialect {

    public CmsDialect() {
        super("CMS", "cms", 1);
    }

    public Set<IProcessor> getProcessors(String dialectPrefix) {
        IProcessor processor = new AbstractAttributeModelProcessor(TemplateMode.HTML, dialectPrefix, null, false, "fragment", false, 1, true) {
            @Override
            protected void doProcess(ITemplateContext context, IModel model, AttributeName attributeName, String attributeValue, IElementModelStructureHandler structureHandler) {

            }
        };
        return Collections.singleton(processor);
    }

}
