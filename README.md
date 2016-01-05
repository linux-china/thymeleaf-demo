Thymeleaf Demo
===================================
Thymeleaf is a new template engine. http://www.thymeleaf.org/index.html

### Features

* Spring Boot Demo
* Template Engine Demo
* Email Template Demo


### spring integration

样例： https://github.com/thymeleaf/thymeleafexamples-springmail


     <bean id="emailTemplateResolver" class="org.thymeleaf.templateresolver.ClassLoaderTemplateResolver">
         <property name="prefix" value="mail/" />
         <property name="templateMode" value="HTML5" />
         <property name="characterEncoding" value="UTF-8" />
         <property name="order" value="1" />
         <!-- Template cache is true by default. Set to false if you want -->
         <property name="cacheable" value="true" />
     </bean>

     <!-- THYMELEAF: Template Engine (Spring3-specific version) -->
     <bean id="templateEngine" class="org.thymeleaf.spring3.SpringTemplateEngine">
         <property name="templateResolvers">
            <set>
              <ref bean="emailTemplateResolver" />
            </set>
         </property>
     </bean>
     

![Alt text](http://g.gravizo.com/g?
  digraph G {
    aize ="4,4";
    main [shape=box];
    main -> parse [weight=8];
    parse -> execute;
    main -> init [style=dotted];
    main -> cleanup;
    execute -> { make_string; printf}
    init -> make_string;
    edge [color=red];
    main -> printf [style=bold,label="100 times"];
    make_string [label="make a string"];
    node [shape=box,style=filled,color=".7 .3 1.0"];
    execute -> compare;
  }
)

