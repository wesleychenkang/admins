package com.miaoqu;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * Swagger2配置类
 * 在与spring boot集成时，放在与Application.java同级的目录下。
 * 通过@Configuration注解，让Spring来加载该类配置。
 * 再通过@EnableSwagger2注解来启用Swagger2。
 * https://blog.csdn.net/xqnode/article/details/81382160
 */

/**
 * Created by chen on 2018/12/22.
 */
@Configuration
@EnableSwagger2
public class Swagger2 extends WebMvcConfigurationSupport{
    private boolean swaggerIsShow;

    @Bean
    public Docket productApi() {
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        List<Parameter> parameterList = new ArrayList<>();
        Parameter param = parameterBuilder
                .name("Authorization")
                .description("访问令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false).build();
        parameterList.add(param);
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerIsShow)
                .apiInfo(apiInfo())
                .select() //返回ApiSelectorBuilder
                .apis(RequestHandlerSelectors.basePackage("com.miaoqu.controller"))
                .paths(PathSelectors.any()) //只给product路径产生API文档
                .build().globalOperationParameters(parameterList);
    }

    //文档基础信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 文档标题
                .title("易达云图")
                // 文档描述
                .description("CRM-ERP接口文档")
                .termsOfServiceUrl("http://www.yidayuntu.com")
                .version("v1.0")
                .build();
    }

    /**
     * 防止@EnableMvc把默认的静态资源路径覆盖了，手动设置的方式
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/").setCachePeriod(0);
    }


}
