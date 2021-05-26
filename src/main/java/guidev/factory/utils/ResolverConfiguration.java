package guidev.factory.utils;

import guidev.factory.enums.ChannelType;
import guidev.factory.interfaces.NotifiableService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This Class is an alternative to Factory Pattern
 */

@Configuration
@RequiredArgsConstructor
public class ResolverConfiguration {

    @Bean
    public Map<ChannelType, NotifiableService> notifiableMap(List<NotifiableService> notifiableServiceList) {
        return notifiableServiceList.stream()
                .collect(Collectors.toMap(NotifiableService::getType, notifiable -> notifiable));
    }

}

