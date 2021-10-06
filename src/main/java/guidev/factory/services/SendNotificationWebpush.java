package guidev.factory.services;

import guidev.factory.interfaces.NotifiableService;
import guidev.factory.models.WebpushConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SendNotificationWebpush implements NotifiableService<WebpushConfig> {

    @Override
    public Class<WebpushConfig> getType() {
        return WebpushConfig.class;
    }

    @Override
    public void send(WebpushConfig channelConfig, String message) {
        WebpushConfig webpushConfig = (WebpushConfig) channelConfig;
        log.info("Notification sent to webpush, user Id: {}, browserId : {}", webpushConfig.getUserId(), webpushConfig.getBrowserId());
    }
}
