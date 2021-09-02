package guidev.factory.interfaces;

import guidev.factory.enums.ChannelType;
import guidev.factory.models.ChannelConfig;

public interface NotifiableService {
    ChannelType getType();
    void send(ChannelConfig channelConfig, String message);
}
