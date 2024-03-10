package dziedzic.dev.oauth.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
/*
    * This class is an entity for the user table in the database.
    * !Problem: @Entity required norArg constructor so
 */
@Table(name="user_entity")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NonNull
    private UUID id;

    private String name;

    private String email;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
