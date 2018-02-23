package backend.Entities;

import javax.persistence.*;

@Entity
@Table(name = "message_about_tour")
public class MessageAboutTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String text;

    @Column(name = "is_tour_or_place_tour")
    private boolean isTourOrPlaceTour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tour_id")
    private Tour tour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isTourOrPlaceTour() {
        return isTourOrPlaceTour;
    }

    public void setTourOrPlaceTour(boolean tourOrPlaceTour) {
        isTourOrPlaceTour = tourOrPlaceTour;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
}