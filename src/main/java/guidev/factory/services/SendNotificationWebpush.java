package guidev.factory.services;

import guidev.factory.enums.ChannelType;
import guidev.factory.interfaces.NotifiableService;
import guidev.factory.models.Channel;
import guidev.factory.models.Webpush;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static guidev.factory.enums.ChannelType.WEB_PUSH;

@Service
@RequiredArgsConstructor
@Slf4j
public class SendNotificationWebpush implements NotifiableService {

    @Override
    public ChannelType getType() {
        return WEB_PUSH;
    }

    @Override
    public void send(Channel channel, String message) {
        Webpush webpush = (Webpush) channel;
        log.info("Notification sent to webpush, user Id: {}, browserId : {}", webpush.getUserId(), webpush.getBrowserId());
    }
}
