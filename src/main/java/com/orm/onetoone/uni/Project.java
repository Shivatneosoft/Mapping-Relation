package com.orm.onetoone.uni;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id", nullable = false)
    private Long projectId;

    private String projectName;

    private Integer projectDuration;

    private String projectDescription;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Employee employee;

}
