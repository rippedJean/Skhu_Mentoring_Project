package com.skhuMentoring.mapper;

import com.skhuMentoring.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface MentoringBoardMapper {
    List<Department> getDepartment(); // 학과 목록 가져오기

    List<Subject> getSubject(); // 등록된 강의목록 가져오기

    void insertSubject(Subject subject);

    List<Mentor> getListWithPaging(Criteria cri); // 멘토목록 페이징 처리 - 최신순

    void insertMentorBoard(Mentor mentor); // 멘토 게시글 등록
    
    Long getMentorBoardTotal(Criteria cri); // 멘토게시글 게시글 총 개수 가져오기
    
    int checkSubject(String subject); // 과목 등록 시 이미 DB에 등록된 과목인지 체크

    List<Mentee> getListWithPagingMentee(Criteria cri); // 멘티목록 페이징 처리 - 최신순

    void insertMenteeBoard(Mentee mentee); // 멘티 게시글 등록

    Long getMenteeBoardTotal(Criteria cri); // 멘티게시글 게시글 총 개수 가져오기

    void deleteMentorBoard(Long bno); // 멘토 게시판 글 삭제

    void endMentorBoard(Long bno); // 멘토 게시판 모집 종료

    void deleteMenteeBoard(Long bno); // 멘티 게시판 글 삭제

    public void setUpMentoring(String menteeStudentNum);

    public User login(Map<String, String> map);

    Mentor getDetailMentor(Long bno); // 멘토목록 상세보기 값 가져오기
    
    Mentee getDetailMentee(Long bno); // 멘티목록 상세보기 값 가져오기
    
    void applicationMentor(Mentee mentee); //멘토 게시글에서 신청

    void endApplicationMentor(Long bno); // 멘토가 모집종료를 누르면 tbl_applicationMentor의 accept값이 수락됨 - > 진행중으로 변경



    List<Mentor> getMentoring(Long bno); // bno번호로 멘토게시글 정보 가져오기

    int checkApplicationStatus(Long bno, String menteeId); // 멘토목록에서 신청한 게시글 여부 확인

    void menteeAccept(Long bno); // 멘티 수락 시 정원 +1
    
    void menteeAcceptStatus(Long bno, String menteeId); // 멘티 수락 시 상태를 수락으로 변경
    
    List<Mentee> getDetailMentees(Long bno); // 멘토 목록에서 현재 신청한 멘티 정보를 가져온다

    List<Mentor> sliderMentor(); // bno 내림차순으로 8개의 멘토 정보 가져오기

    Long getPersonnel(Long bno); // 해당 멘토링 현재 신청 인원 조회

    Long getMaxPersonnel(Long bno); // 멘토가 개설한 정원수

    void mentorBoardUpdate(Long bno);


    void addPersonnel(Long bno); //멘토보드 정원 +1
}
