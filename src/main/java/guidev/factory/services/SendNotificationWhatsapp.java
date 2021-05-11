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
public class SendNotificationWhatsapp implements Notifiable {

    private final FindWhatsappService findWhatsappService;

    @Override
    public void send(List<Long> channelIds, String message) {

        val channelConfigs = findWhatsappService.execute(channelIds);

        channelConfigs.forEach(whatsapp -> log.info("Notification sent to whatsapp, user Id: {}, number : {}", whatsapp.getUserId(), whatsapp.getNumber()));

    }

}
