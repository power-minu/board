package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

    // JPA Repository가 제공하는 기능. findBy{컬럼명}Containing
    // 컬럼에서 키워드가 포함된 것을 찾겠다.
    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);
}
