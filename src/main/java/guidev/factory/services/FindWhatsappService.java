package guidev.factory.services;

import guidev.factory.models.Whatsapp;
import guidev.factory.repositories.WhatsappRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindWhatsappService {

    private final WhatsappRepository whatsappRepository;

    /**
     * @param channelIds Find Configs
     * @return
     */
    public List<Whatsapp> execute(List<Long> channelIds) {
        return whatsappRepository.findByIds(channelIds);
    }

}
