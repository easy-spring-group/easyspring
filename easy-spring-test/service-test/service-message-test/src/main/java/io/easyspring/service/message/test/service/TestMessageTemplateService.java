package io.easyspring.service.message.test.service;
import io.easyspring.service.message.MessageChannelType;

import io.easyspring.service.message.EasyMessageTemplateService;
import io.easyspring.service.message.support.EasyMessageTemplate;
import org.springframework.stereotype.Component;

@Component("easyMessageTemplateService")
public class TestMessageTemplateService implements EasyMessageTemplateService {

    @Override
    public EasyMessageTemplate getByCode(String templateCode) {
        EasyMessageTemplate easyMessageTemplate = new EasyMessageTemplate();
        easyMessageTemplate.setName("");
        easyMessageTemplate.setChannelType(MessageChannelType.SYSTEM);
        easyMessageTemplate.setMessageType("通知");
        easyMessageTemplate.setCode("email");
        easyMessageTemplate.setPath("");
        easyMessageTemplate.setTemplate("我是${name}, 我喜欢${age}岁的${name2}. 你喜欢吗?");
        easyMessageTemplate.setDelayTime(0);


        return easyMessageTemplate;
    }
}