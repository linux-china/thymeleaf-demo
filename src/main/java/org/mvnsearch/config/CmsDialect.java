package org.mvnsearch.config;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IModel;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.processor.element.AbstractAttributeModelProcessor;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementModelStructureHandler;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.standard.StandardDialect;
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
        super("CMS", "cms", StandardDialect.PROCESSOR_PRECEDENCE);
    }

    public Set<IProcessor> getProcessors(String dialectPrefix) {
        IProcessor processor = new AbstractAttributeTagProcessor(TemplateMode.HTML, dialectPrefix, null, false, "fragment", true, StandardDialect.PROCESSOR_PRECEDENCE, true) {

            protected void doProcess(ITemplateContext iTemplateContext, IProcessableElementTag iProcessableElementTag, AttributeName attributeName, String attributeValue, IElementTagStructureHandler iElementTagStructureHandler) {
                iElementTagStructureHandler.setBody("content <strong>from</strong> CMS", false);
            }
        };
        return Collections.singleton(processor);
    }

}
