package guidev.factory.interfaces;

import java.util.List;

public interface Notifiable {

    void send(List<Long> channelIds, String message);
}
