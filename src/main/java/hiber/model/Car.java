package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column(name = "id")
    private Long id;

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    @Column(name = "carName")
    private String name;
    @Column(name = "carSeries")
    private int series;


    @OneToOne(mappedBy = "car",cascade = CascadeType.ALL)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car() {
    }
    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override    public String toString() {
        return "Name: " + this.name +", Series: " + this.series;
    }


}
