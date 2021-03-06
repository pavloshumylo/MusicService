package backend.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
    private Set<Tour> bandTours;

    @OneToMany(mappedBy = "band")
    private Set<Performance> bandPerformances;

    @OneToMany(mappedBy = "band")
    private Set<BandPhoto> bandPhotos;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "band_subscribed_users",
            joinColumns = @JoinColumn(name = "band_id") ,
            inverseJoinColumns =  @JoinColumn(name = "subscribed_user_id"))
    private Set<User> subscribedUsers;

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

    public Set<Tour> getBandTours() {
        return bandTours;
    }

    public void setBandTours(Set<Tour> bandTours) {
        this.bandTours = bandTours;
    }

    public Set<Performance> getBandPerformances() {
        return bandPerformances;
    }

    public void setBandPerformances(Set<Performance> bandPerformances) {
        this.bandPerformances = bandPerformances;
    }

    public Set<BandPhoto> getBandPhotos() {
        return bandPhotos;
    }

    public void setBandPhotos(Set<BandPhoto> bandPhotos) {
        this.bandPhotos = bandPhotos;
    }

    public Set<User> getSubscribedUsers() {
        return subscribedUsers;
    }

    public void setSubscribedUsers(Set<User> subscribedUsers) {
        this.subscribedUsers = subscribedUsers;
    }
}