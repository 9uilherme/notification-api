package guidev.factory.services;

import guidev.factory.interfaces.NotifiableService;
import guidev.factory.models.WhatsappConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SendNotificationWhatsapp implements NotifiableService<WhatsappConfig> {

    @Override
    public Class<WhatsappConfig> getType() {
        return WhatsappConfig.class;
    }

    @Override
    public void send(WhatsappConfig channelConfig, String message) {
        WhatsappConfig whatsappConfig = channelConfig;
        log.info("Notification sent to whatsapp, user Id: {}, number : {}", whatsappConfig.getUserId(), whatsappConfig.getNumber());

    }
}
