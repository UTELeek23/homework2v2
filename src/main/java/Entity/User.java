package Entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "Users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "UserId")
    private String userId;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Email")
    private String email;

    @Column(name = "Active")
    private int active;

    // bi-directional many-to-one association to Favorite
    @OneToMany(mappedBy = "user")
    private List<Favorite> favorites;

    // Constructors
    public User() {
    }

    // Getters and Setters
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public List<Favorite> getFavorites() {
        return this.favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    public Favorite addFavorite(Favorite favorite) {
        getFavorites().add(favorite);
        favorite.setUser(this);
        return favorite;
    }

    public Favorite removeFavorite(Favorite favorite) {
        getFavorites().remove(favorite);
        favorite.setUser(null);
        return favorite;
    }
}
