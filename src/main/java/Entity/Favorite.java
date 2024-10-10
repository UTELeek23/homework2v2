package Entity;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The persistent class for the Favorite entity.
 */
@Entity
@Table(name = "Favorites")
@NamedQuery(name = "Favorite.findAll", query = "SELECT f FROM Favorite f")
public class Favorite implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FavoriteId")
    private int favoriteId;

    // Many-to-one association to Video
    @ManyToOne
    @JoinColumn(name = "VideoId")
    private Video video;

    // Many-to-one association to User (assuming you have a User entity)
    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;

    @Column(name = "LikedDate")
    private String likedDate; // You can use Date or LocalDateTime if needed.

    public Favorite() {
    }

    // Getters and Setters
    public int getFavoriteId() {
        return this.favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    public Video getVideo() {
        return this.video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLikedDate() {
        return this.likedDate;
    }

    public void setLikedDate(String likedDate) {
        this.likedDate = likedDate;
    }
}
