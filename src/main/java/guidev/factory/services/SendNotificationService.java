package guidev.factory.services;

import guidev.factory.enums.ChannelType;
import guidev.factory.interfaces.NotifiableService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class SendNotificationService implements ApplicationRunner {

    private final FindSubscriptionService findSubscriptionService;
    private final Map<ChannelType, NotifiableService> notifiableMap;

    @Override
    public void run(ApplicationArguments args) {
        findSubscriptionService.execute()
            .forEach(subscription -> {
                NotifiableService notificationService = notifiableMap.get(subscription.getChannelType());
                notificationService.send(subscription.getChannel(), "my message");
            });
    }

}
