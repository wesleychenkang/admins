package com.miaoqu.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by wesley on 2018/12/18.
 */
@Component
@Scope("singleton")
public class ApplicationUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext application) throws BeansException {
        ApplicationUtils.applicationContext = application;

    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }


}
