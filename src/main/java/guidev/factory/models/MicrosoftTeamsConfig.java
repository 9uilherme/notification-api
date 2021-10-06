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
@DiscriminatorValue("TEAMS")
public class MicrosoftTeamsConfig extends ChannelConfig {

    private String name;

    private String legalEntity;

    private String webhook;
}
