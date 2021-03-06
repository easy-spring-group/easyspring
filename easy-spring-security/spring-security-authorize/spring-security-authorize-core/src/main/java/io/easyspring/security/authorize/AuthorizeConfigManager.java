package io.easyspring.security.authorize;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * 默认的权限控制操作接口
 *
 * @author summer
 * DateTime 2019-03-05 16:23
 * @version V1.0.0-RELEASE
 */
public interface AuthorizeConfigManager {

    /**
     * 把所有的权限控制器, 都加上对应的配置
     *
     * @param config 配置信息
     * Author summer
     * DateTime 2019-03-05 16:25
     * Version V1.0.0-RELEASE
     */
    void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config);

}
