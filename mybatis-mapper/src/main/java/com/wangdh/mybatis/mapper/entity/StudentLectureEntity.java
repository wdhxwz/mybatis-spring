package com.wangdh.mybatis.mapper.entity;

import javax.persistence.*;

@Table(name = "tb_student_lecture")
public class StudentLectureEntity {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "lecture_id")
    private String lectureId;

    private String grade;

    private String no;

    private String remark;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return student_id
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return lecture_id
     */
    public String getLectureId() {
        return lectureId;
    }

    /**
     * @param lectureId
     */
    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }

    /**
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}