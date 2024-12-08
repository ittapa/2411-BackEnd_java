package io.qook.jweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity(name="user")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // name 컬럼, null 허용 안 함
    private String name;

    @Column(nullable = false, unique = true) // email 컬럼, null 허용 안 함, 중복 불가
    private String email;

    @Column(nullable = false) // password 컬럼, null 허용 안 함
    private String password;

    @CreationTimestamp // 엔티티 생성 시 자동으로 설정
    @Temporal(TemporalType.TIMESTAMP) // Timestamp로 저장
    private Date createdAt;

    @UpdateTimestamp // 엔티티 업데이트 시 자동으로 설정
    @Temporal(TemporalType.TIMESTAMP) // Timestamp로 저장
    private Date updatedAt;
}
