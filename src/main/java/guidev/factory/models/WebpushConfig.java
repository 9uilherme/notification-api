package guidev.factory.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("WEB_PUSH")
public class WebpushConfig extends ChannelConfig {

    private String userId;

    private String browserId;
}
