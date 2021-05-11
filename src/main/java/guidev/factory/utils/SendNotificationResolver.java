package guidev.factory.utils;

import guidev.factory.interfaces.Notifiable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * This Class is an alternative to Factory Pattern
 */

@Component
@RequiredArgsConstructor
public class SendNotificationResolver {

    private final Map<String, Notifiable> notifiableMap;
    private static final String SERVICE =  "sendNotification%s";

    public Notifiable getNotificationService(String channelName) {
         return notifiableMap.get(String.format(SERVICE, channelName));
    }

}

