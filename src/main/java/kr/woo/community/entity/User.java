package kr.woo.community.entity;

import jakarta.persistence.*;
import kr.woo.community.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// 회원 엔티티
@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @OneToMany(mappedBy = "author")
    List<Post> post = new ArrayList<>();

    public User(String email, String password, String nickname, String profileImage) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.profileImage = profileImage;

        this.createdAt = LocalDateTime.now();
        this.updatedAt = null;
        this.deletedAt = null;
    }

    // 이름 수정
    public void changeNickname(String nickname) {
        this.nickname = nickname;
        this.updatedAt = LocalDateTime.now();
    }

    // 프로필 이미지 수정
    public void changeProfileImage(String profileImage){
        this.profileImage = profileImage;
        this.updatedAt = LocalDateTime.now();
    }

    // 비밀번호 수정
    public void changePassword(String password) {
        this.password = password;
        this.updatedAt = LocalDateTime.now();
    }

    // 회원 삭제
    public void softDelete() {
        this.deletedAt = LocalDateTime.now();
    }

    // 삭제 여부
    public Boolean isDeleted() {
        return this.deletedAt != null;
    }
}
