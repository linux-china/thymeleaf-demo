package org.mvnsearch.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;

/**
 * cms thymeleaf auto configuration
 *
 * @author linux_china
 */
@Configuration
@ConditionalOnClass(SpringTemplateEngine.class)
@AutoConfigureBefore(ThymeleafAutoConfiguration.class)
@AutoConfigureAfter({CacheAutoConfiguration.class})
public class CmsThymeleafAutoConfiguration {

    @Bean
    public CmsDialect cmsDialect() {
        return new CmsDialect();
    }

}
