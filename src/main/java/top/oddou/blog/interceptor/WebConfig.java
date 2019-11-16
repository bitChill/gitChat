package top.oddou.blog.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //1.加载需要配置的拦截器
        registry.addInterceptor(new LoginInterceptor())
        //2.添加需要拦截哪些url
                .addPathPatterns("/admin/**")
        //3.排除特定的url
                .excludePathPatterns("/admin")
                .excludePathPatterns("/admin/login");

    }
}
