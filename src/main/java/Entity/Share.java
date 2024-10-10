package Entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "Shares")
@NamedQuery(name = "Share.findAll", query = "SELECT s FROM Share s")
public class Share implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Assuming shareId is auto-generated
    @Column(name = "ShareId")
    private int shareId;

    @Column(name = "Email")
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SharedDate")
    private Date sharedDate;

    // bi-directional many-to-one association to User
    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;

    // bi-directional many-to-one association to Video
    @ManyToOne
    @JoinColumn(name = "VideoId")
    private Video video;

    // Constructors
    public Share() {
    }

    // Getters and Setters
    public int getShareId() {
        return this.shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSharedDate() {
        return this.sharedDate;
    }

    public void setSharedDate(Date sharedDate) {
        this.sharedDate = sharedDate;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Video getVideo() {
        return this.video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
