package toruk.UserManagement.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@Table(name="userDb")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /** The id. */
    @Id
    @Column(unique = true, nullable = false, name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /** The user name. */
    @Column(unique = true, nullable = false, name = "user_name")
    private String userName;

    /** The email. */
    @Column(unique = true, name = "user_mail")
    private String email;

    /** The password. */
    @Column(name = "password", length = 60)
    private String password;

//    /** The enabled. */
//    private boolean enabled;

//    /** The registration date. */
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;
//
//    /** The last activity date. */
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActivityDate;

//    /** The locked. */
//    private boolean locked;

    /** The roles. */
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
//    private Collection<Role> roles;

    /**
     * Instantiates a new user.
     */
//    public User() {
//        super();
//        this.enabled = false;
//    }

    /**
     * Sets the last activity date.
     */
//    @PreUpdate
//    public void setLastActivityDate() {
//        setLastActivityDate(new Date());
//    }

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int id;

//    @Column(name="category_id")
//    private int categoryId;

    @Column(name="user_name")
    private String userName;

    @Column(name="password")
    private String password;

//    @Column(name="unit_price")
//    private double unitPrice;
//
//    @Column(name="units_in_stock")
//    private short unitsInStock;
//
//    @Column(name="quantity_per_unit")
//    private String quantityPerUnit;
*/

}
