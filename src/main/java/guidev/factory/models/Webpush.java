package guidev.factory.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Webpush extends Channel {

    private String userId;

    private String browserId;
}
