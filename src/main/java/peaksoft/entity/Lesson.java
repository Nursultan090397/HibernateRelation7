package peaksoft.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lessonName;
    private String videoLink;
    //private Course courseId;

    public Lesson(String lessonName, String videoLink, Course course) {
        this.lessonName = lessonName;
        this.videoLink = videoLink;
        //this.course = course;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", lessonName='" + lessonName + '\'' +
                ", videoLink='" + videoLink + '\'' +
                //", course=" + course +
                '}';
    }
}



