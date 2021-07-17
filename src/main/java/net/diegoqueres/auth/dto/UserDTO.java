package net.diegoqueres.auth.dto;

import lombok.*;
import net.diegoqueres.auth.entity.Permission;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserDTO implements Serializable {
    private static final long serialVersionUID = -6842207321151653113L;

    private String userName;
    private String password;
}
