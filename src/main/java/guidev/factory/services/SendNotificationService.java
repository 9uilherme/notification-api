package guidev.factory.services;

import guidev.factory.enums.ChannelType;
import guidev.factory.interfaces.NotifiableService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SendNotificationService implements ApplicationRunner {

    private final FindSubscriptionService findSubscriptionService;
    private final Map<Class, NotifiableService> notifiableServiceMap;

    @Override
    public void run(ApplicationArguments args) {
        findSubscriptionService.execute()
            .forEach(subscription -> {
                NotifiableService notificationService = notifiableServiceMap.get(subscription.getChannelConfig().getClass());
                notificationService.send(subscription.getChannelConfig(), "my message");
            });
    }

}
