package io.easyspring.framework.base.data.mybatis.test.model;

import io.easyspring.framework.base.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Table;

/**
 * 用户实体对象
 *
 * @author summer
 * DateTime 2018-12-04 22:09
 * @version V1.0.0-RELEASE
 */
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table(name = "tab_user")
public class User extends BaseModel {
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户编码
     */
    private String userCode;
}
