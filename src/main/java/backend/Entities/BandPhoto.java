package backend.Entities;

import javax.persistence.*;

@Entity(name = "band_photo")
public class BandPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String url;

    @Column(name = "is_main_photo")
    private boolean isMainPhoto;

    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isMainPhoto() {
        return isMainPhoto;
    }

    public void setMainPhoto(boolean mainPhoto) {
        isMainPhoto = mainPhoto;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}