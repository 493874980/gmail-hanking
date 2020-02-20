package com.atguigu.gmall.pms.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        设置请求的页面大于最大页后的操作，true则调回首页，false继续请求，默认为false
//        paginationInterceptor.setOverflow(false);
//        设置最大单页限制数量，默认500条，-1 不受影响
//        paginationInterceptor.setLimit(500);
        return paginationInterceptor;
    }
}
