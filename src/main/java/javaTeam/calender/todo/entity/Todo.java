package javaTeam.calender.todo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "todoSeq", nullable = false)
    private Integer todoSeq;

    @Column(name = "whatToDo", nullable = false , length = 80)
    private String whatToDo;

    @Column(name = "RegisterDate" , nullable = false)
    private Date registerDate;

}