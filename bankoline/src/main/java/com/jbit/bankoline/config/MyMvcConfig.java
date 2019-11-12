package com.jbit.bankoline.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 扩展SpringMVC 保留了所有的配置也嫩控制我们的配置
 */
//使用WebMvcConfigurationSupport 可以控制SpringMVC的功能
/*@EnableWebMvc*//*全面接管*/
@Configuration /*自动配置类*/
public class MyMvcConfig implements WebMvcConfigurer {
    /*嵌入式的servlet容器相关规则*/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
    }

   /* @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/login.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    }*/


/*    //注册拦截器的
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/main.html", "/index.html", "/emp/**", "/asserts/**", "/webjars/**", "/user/login");
        *//*
     *   释放指定的资源
     * *//*
        System.out.println("MyMvcConfig addInterceptors");
    }*/
}
/*
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送/jbit/请求 来到success页面 视图映射
        registry.addViewController("/jbit").setViewName("success");
    }
*/

/*    //初始访问页面 所有组件都会一起使用
    @Bean//将组件注册在容器
    public WebMvcConfigurationSupport webMvcConfigurationSupport() {
        System.out.println("执行");

        public class MyMvcConfig implements WebMvcConfigurer {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
            }

        }

        return adapter;
    }*/

