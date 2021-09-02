package guidev.factory.services;

import guidev.factory.enums.ChannelType;
import guidev.factory.interfaces.NotifiableService;
import guidev.factory.models.ChannelConfig;
import guidev.factory.models.WhatsappConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static guidev.factory.enums.ChannelType.WHATSAPP;

@Service
@RequiredArgsConstructor
@Slf4j
public class SendNotificationWhatsapp implements NotifiableService {

    @Override
    public ChannelType getType() {
        return WHATSAPP;
    }

    @Override
    public void send(ChannelConfig channelConfig, String message) {
        WhatsappConfig whatsappConfig = (WhatsappConfig) channelConfig;
        log.info("Notification sent to whatsapp, user Id: {}, number : {}", whatsappConfig.getUserId(), whatsappConfig.getNumber());

    }
}
