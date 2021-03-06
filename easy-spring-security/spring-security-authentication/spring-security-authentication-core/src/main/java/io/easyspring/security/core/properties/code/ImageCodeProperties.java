package io.easyspring.security.core.properties.code;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 图片验证码配置项
 *
 * @author summer
 * @version V1.0.0-RELEASE
 * DateTime 2019-01-16 20:53
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImageCodeProperties extends SmsCodeProperties {
	
	public ImageCodeProperties() {
		setLength(4);
	}

    /**
     * 图片宽度
     */
	private int width = 67;
	/**
	 * 图片高
	 */
	private int height = 23;
}
