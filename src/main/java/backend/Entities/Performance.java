package backend.Entities;

import javax.persistence.*;

@Entity
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "url_to_youtube")
    private String urlToYoutube;

    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;

    @ManyToOne
    @JoinColumn(name = "tour_detail_place_id")
    private TourDetailPlace tourDetailPlace;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlToYoutube() {
        return urlToYoutube;
    }

    public void setUrlToYoutube(String urlToYoutube) {
        this.urlToYoutube = urlToYoutube;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public TourDetailPlace getTourDetailPlace() {
        return tourDetailPlace;
    }

    public void setTourDetailPlace(TourDetailPlace tourDetailPlace) {
        this.tourDetailPlace = tourDetailPlace;
    }
}