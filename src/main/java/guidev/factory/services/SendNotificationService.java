package guidev.factory.services;

import guidev.factory.models.Channel;
import guidev.factory.models.Subscription;
import guidev.factory.utils.SendNotificationResolver;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SendNotificationService implements ApplicationRunner {

    private final FindSubscriptionService findSubscriptionService;
    private final SendNotificationResolver notificationResolver;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        val subscriptionList = findSubscriptionService.execute();

        val channelSubscriptions = subscriptionList.stream().collect(Collectors.groupingBy(Subscription::getChannelName));

        channelSubscriptions
                .forEach((channel, subscriptions) -> {

                    val channelIds = subscriptions
                            .stream()
                            .map(Subscription::getChannel)
                            .map(Channel::getId)
                            .collect(Collectors.toList());

                    val notificationService = notificationResolver.getNotificationService(channel);

                    notificationService.send(channelIds, "my message");

                    // save notification
                });

    }

}
