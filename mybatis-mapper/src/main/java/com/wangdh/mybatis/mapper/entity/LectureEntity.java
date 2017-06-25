package com.wangdh.mybatis.mapper.entity;

import javax.persistence.*;

@Table(name = "tb_lecture")
public class LectureEntity {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "lecture_name")
    private String lectureName;

    @Column(name = "lecture_no")
    private String lectureNo;

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
     * @return lecture_name
     */
    public String getLectureName() {
        return lectureName;
    }

    /**
     * @param lectureName
     */
    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    /**
     * @return lecture_no
     */
    public String getLectureNo() {
        return lectureNo;
    }

    /**
     * @param lectureNo
     */
    public void setLectureNo(String lectureNo) {
        this.lectureNo = lectureNo;
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