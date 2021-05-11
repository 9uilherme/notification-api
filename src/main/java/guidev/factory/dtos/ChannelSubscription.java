package guidev.factory.dtos;

import guidev.factory.models.Subscription;

import java.util.List;

public interface ChannelSubscription {

    String getName();

    List<Subscription> getSubscriptions();

}
