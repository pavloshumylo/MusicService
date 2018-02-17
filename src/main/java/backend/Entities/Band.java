package backend.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String members;

    @Column(name = "date_of_create")
    private Date dateOfCreate;

    @Column
    private String description;

    @OneToMany(mappedBy = "band")
    private List<Tour> bandTours;

    @OneToMany(mappedBy = "band")
    private List<Performance> bandPerformances;

    @OneToMany(mappedBy = "band")
    private List<BandPhoto> bandPhotos;

    @ManyToMany
    @JoinTable(
            name = "band_subscribed_users",
            joinColumns = @JoinColumn(name = "band_id") ,
            inverseJoinColumns =  @JoinColumn(name = "subscribed_user_id"))
    private List<User> subscribedUsers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public Date getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(Date dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tour> getBandTours() {
        return bandTours;
    }

    public void setBandTours(List<Tour> bandTours) {
        this.bandTours = bandTours;
    }

    public List<Performance> getBandPerformances() {
        return bandPerformances;
    }

    public void setBandPerformances(List<Performance> bandPerformances) {
        this.bandPerformances = bandPerformances;
    }

    public List<BandPhoto> getBandPhotos() {
        return bandPhotos;
    }

    public void setBandPhotos(List<BandPhoto> bandPhotos) {
        this.bandPhotos = bandPhotos;
    }

    public List<User> getSubscribedUsers() {
        return subscribedUsers;
    }

    public void setSubscribedUsers(List<User> subscribedUsers) {
        this.subscribedUsers = subscribedUsers;
    }
}