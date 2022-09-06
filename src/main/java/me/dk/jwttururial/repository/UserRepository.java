package me.dk.jwttururial.repository;

import me.dk.jwttururial.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities")
    // 해당 쿼리가 수행될 때 Lazy가 아닌 Eager조회로 authorities정보를 같이 가져옴
    // Username을 기준으로 User 정보를 가져올 때 권한 정보도 같이 가져오는 메서드
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}