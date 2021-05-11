package guidev.factory.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Channel {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
