package io.easyspring.framework.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义校验 - 验证手机号是否合法
 *
 * @author summer
 * DateTime 2019-01-08 17:11
 * Annotation @Target 此注解可以使用在什么上面
 * Annotation @Retention 在什么时候有效果
 * Annotation @Constraint 标明这是一个用于校验的的注解, 并定义校验的类
 * @version V1.0.0-RELEASE
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TelephoneValidator.class)
public @interface Telephone {

    /**
     * 错误消息
     * @return String
     */
	String message() default "手机号不合法";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	String field() default "";

}
