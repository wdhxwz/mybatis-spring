package com.wangdh.mybatis.mapper.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_student_health_male")
public class StudentHealthMaleEntity {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT SCOPE_IDENTITY()")
    private String id;

    private String no;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "check_date")
    private Date checkDate;

    private String heart;

    private String liver;

    private String lung;

    private String kidney;

    private String spleen;

    private String prostate;

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
     * @return check_date
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * @param checkDate
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * @return heart
     */
    public String getHeart() {
        return heart;
    }

    /**
     * @param heart
     */
    public void setHeart(String heart) {
        this.heart = heart;
    }

    /**
     * @return liver
     */
    public String getLiver() {
        return liver;
    }

    /**
     * @param liver
     */
    public void setLiver(String liver) {
        this.liver = liver;
    }

    /**
     * @return lung
     */
    public String getLung() {
        return lung;
    }

    /**
     * @param lung
     */
    public void setLung(String lung) {
        this.lung = lung;
    }

    /**
     * @return kidney
     */
    public String getKidney() {
        return kidney;
    }

    /**
     * @param kidney
     */
    public void setKidney(String kidney) {
        this.kidney = kidney;
    }

    /**
     * @return spleen
     */
    public String getSpleen() {
        return spleen;
    }

    /**
     * @param spleen
     */
    public void setSpleen(String spleen) {
        this.spleen = spleen;
    }

    /**
     * @return prostate
     */
    public String getProstate() {
        return prostate;
    }

    /**
     * @param prostate
     */
    public void setProstate(String prostate) {
        this.prostate = prostate;
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