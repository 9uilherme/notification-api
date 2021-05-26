package guidev.factory.interfaces;

import guidev.factory.enums.ChannelType;
import guidev.factory.models.Channel;

public interface NotifiableService {
    ChannelType getType();
    void send(Channel channel, String message);
}
