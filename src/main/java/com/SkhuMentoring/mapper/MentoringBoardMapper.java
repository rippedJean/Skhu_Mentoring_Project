package com.SkhuMentoring.mapper;

import com.SkhuMentoring.dto.Department;
import com.SkhuMentoring.dto.Mentee;
import com.SkhuMentoring.dto.Mentor;
import com.SkhuMentoring.dto.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MentoringBoardMapper {
    List<Department> getDepartment(); // 학과 목록 가져오기

    List<Subject> getSubject(); // 등록된 강의목록 가져오기

    void insertSubject(Subject subject);

    void insertMentorBoard(Mentor mentor); // 멘토 게시글 등록
    
    int checkSubject(String subject); // 과목 등록 시 이미 DB에 등록된 과목인지 체크

    void insertMenteeBoard(Mentee mentee); // 멘티 게시글 등록

}
