package com.example.demo;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import java.util.ArrayList;
import java.util.List;
@Configuration
@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
	}

    //添加自定义的HTTP错误状态码来解决异常问题,基于注解无XML的设置Session的超时问题
	@Bean
	public EmbeddedServletContainerCustomizer embedded(){
		return (container -> {
			ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/error/401.html");
			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404.html");
			ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500.html");
			container.addErrorPages(error401Page, error404Page, error500Page);
			// 设置Session传值的时候,如果我们的页面3分钟内不做操作的就会设置时间的.
			container.setSessionTimeout(1800);// 单位为S
		});
	}
	// 使用Fastjson
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverts(){
		// 定义一个convert转换消息对象
		FastJsonHttpMessageConverter converter=new FastJsonHttpMessageConverter();
		// 添加fastjson的配置信息，比如：是否要格式化返回fastjson
		FastJsonConfig config=new FastJsonConfig();
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 解决中文乱码
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		converter.setSupportedMediaTypes(fastMediaTypes);
		// 在convert中添加配置信息
		converter.setFastJsonConfig(config);
		HttpMessageConverter messageConverter=converter;
		return new HttpMessageConverters(messageConverter);
	}

	}

