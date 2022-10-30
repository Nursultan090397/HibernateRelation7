package peaksoft.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String courseName;
    @Column
    private String duration;
    @Column
    private LocalDate createAt;
    @Column
    private String imageLink;
    @Column
    private String description;

    @ManyToMany (cascade = {DETACH,MERGE,REFRESH,PERSIST},fetch = FetchType.LAZY,mappedBy = "courses")
    private List<Instructor> instructors = new ArrayList<>();

    public Course( String courseName, String duration, LocalDate createAt, String imageLink, String description) {
        this.courseName = courseName;
        this.duration = duration;
        this.createAt = createAt;
        this.imageLink = imageLink;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                ", createAt=" + createAt +
                ", imageLink='" + imageLink + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}




