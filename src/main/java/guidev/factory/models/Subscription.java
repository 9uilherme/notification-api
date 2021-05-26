package guidev.factory.models;

import guidev.factory.enums.ChannelType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Subscription {

    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    @ManyToOne
    private Channel channel;

    public ChannelType getChannelType() {
        return channel.getType();
    }
}
