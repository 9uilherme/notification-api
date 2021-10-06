package guidev.factory.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("WHATSAPP")
public class WhatsappConfig extends ChannelConfig {

    private String userId;

    private String number;
}
