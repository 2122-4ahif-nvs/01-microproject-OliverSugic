package at.htl.enitity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Swimmer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String firstname;
    String lastname;
    LocalDate dob;
    String bestStroke;
    int kilometerSwam;
    int attendanceInHours;

//    @ManyToOne
//    Squad squad;

    public Swimmer() {
    }

    public Swimmer(String firstname, String lastname, LocalDate dob, String bestStroke, int kilometerSwam, int attendanceInHours) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.bestStroke = bestStroke;
        this.kilometerSwam = kilometerSwam;
        this.attendanceInHours = attendanceInHours;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getBestStroke() {
        return bestStroke;
    }

    public void setBestStroke(String bestStroke) {
        this.bestStroke = bestStroke;
    }

    public int getKilometerSwam() {
        return kilometerSwam;
    }

    public void setKilometerSwam(int kilometerSwam) {
        this.kilometerSwam = kilometerSwam;
    }

    public int getAttendanceInHours() {
        return attendanceInHours;
    }

    public void setAttendanceInHours(int attendanceInHours) {
        this.attendanceInHours = attendanceInHours;
    }

//    public Squad getSquad() {
//        return squad;
//    }
//
//    public void setSquad(Squad squad) {
//        this.squad = squad;
//    }
}
