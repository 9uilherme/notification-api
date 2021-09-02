package guidev.factory.models;

import guidev.factory.enums.ProfileType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_generator")
    @SequenceGenerator(name="profile_generator", sequenceName = "profile_sequence", allocationSize = 1)
    private Long id;

    private Boolean current;

    @Enumerated(EnumType.STRING)
    private ProfileType type;

    private String userId;

}
