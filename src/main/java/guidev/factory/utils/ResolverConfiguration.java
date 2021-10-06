package guidev.factory.utils;

import guidev.factory.interfaces.NotifiableService;
import guidev.factory.models.ChannelConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class ResolverConfiguration {

    @Bean
    public Map<Class, NotifiableService> notifiableMap(List<NotifiableService> notifiableServiceList) {
        return notifiableServiceList.stream()
                .collect(Collectors.toMap(NotifiableService::getType, notifiable -> notifiable));
    }
}

