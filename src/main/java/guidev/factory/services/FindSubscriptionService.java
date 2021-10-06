package guidev.factory.services;

import guidev.factory.models.Subscription;
import guidev.factory.repositories.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindSubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    public List<Subscription> execute() {
        return subscriptionRepository.getAll();
    }
}
