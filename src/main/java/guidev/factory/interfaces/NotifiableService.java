package guidev.factory.interfaces;

import guidev.factory.enums.ChannelType;
import guidev.factory.models.ChannelConfig;

public interface NotifiableService<T extends ChannelConfig> {
    Class<T> getType();
    void send(T channelConfig, String message);
}
