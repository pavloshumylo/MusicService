package backend.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date_of_start")
    private Date dateOfStart;

    @Column(name = "date_of_end")
    private Date dateOfEnd;

    @OneToMany(mappedBy = "tour")
    private List<TourDetailPlace> tourDetailPlaces;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "band_id")
    private Band band;

    @OneToMany(mappedBy = "tour")
    private List<MessageAboutTour> messagesAboutTour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public List<TourDetailPlace> getTourDetailPlaces() {
        return tourDetailPlaces;
    }

    public void setTourDetailPlaces(List<TourDetailPlace> tourDetailPlaces) {
        this.tourDetailPlaces = tourDetailPlaces;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
    public List<MessageAboutTour> getMessagesAboutTour() {
        return messagesAboutTour;
    }

    public void setMessagesAboutTour(List<MessageAboutTour> messagesAboutTour) {
        this.messagesAboutTour = messagesAboutTour;
    }
}