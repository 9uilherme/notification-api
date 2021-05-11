package guidev.factory.services;

import guidev.factory.interfaces.Notifiable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SendNotificationWebpush implements Notifiable {

    private final FindWebpushService findWebpushService;

    @Override
    public void send(List<Long> channelIds, String message) {

        val channelConfigs = findWebpushService.execute(channelIds);

        channelConfigs.forEach(webpush -> log.info("Notification sent to webpush, user Id: {}, browserId : {}", webpush.getUserId(), webpush.getBrowserId()));

    }
}
