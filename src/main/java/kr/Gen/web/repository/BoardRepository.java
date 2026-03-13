package kr.Gen.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.Gen.web.entity.Board;

//유저가 게시글 전체조회 요청 -> Controller -> Service 
//						-> Repsitory -> Hibernate -> DB접속
//Mapper와 같은 역할
@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

}
