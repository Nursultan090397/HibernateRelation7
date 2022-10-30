package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String lessonName;
    @Column
    private String videoLink;

    @OneToMany (cascade = CascadeType.ALL)

    private List<Task> tasks = new ArrayList<>();

    @ManyToOne (cascade = {DETACH,MERGE,REFRESH,PERSIST},fetch = FetchType.LAZY)
    @JoinColumn (name = "course_id")
    private Course course;

    public Lesson(String lessonName, String videoLink, Long course_id) {
        this.lessonName = lessonName;
        this.videoLink = videoLink;
        this.id = course_id;

    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", videoLink='" + videoLink + '\'' +
                '}';
    }
}





