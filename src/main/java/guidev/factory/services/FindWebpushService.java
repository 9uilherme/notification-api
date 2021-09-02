package guidev.factory.services;

import guidev.factory.models.WebpushConfig;
import guidev.factory.repositories.WebpushRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindWebpushService {

    private final WebpushRepository webpushRepository;

    /**
     * @param channelIds Find Configs
     * @return
     */
    public List<WebpushConfig> execute(List<Long> channelIds) {
        return webpushRepository.findByIds(channelIds);
    }

}
