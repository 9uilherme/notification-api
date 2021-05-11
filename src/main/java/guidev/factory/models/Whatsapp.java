package guidev.factory.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Whatsapp extends Channel {

    private String userId;

    private String number;
}
