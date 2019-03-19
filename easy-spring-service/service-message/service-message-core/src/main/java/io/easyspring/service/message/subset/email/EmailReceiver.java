package io.easyspring.service.message.subset.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 邮件接收者对象
 *
 * @author summer
 * @date 2019-03-15 15:02
 * @version V1.0.0-RELEASE
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailReceiver implements Serializable {

    private static final long serialVersionUID = -5277945490935015466L;

    /**
     * 收件人地址
     */
    @NotBlank(message = "邮件接收者不能为空")
    @Email(message = "请输入正确的收件人地址")
    private String receiver;
}
