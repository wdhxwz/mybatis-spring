package com.wangdh.mybatis.mapper.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_student_health_female")
public class StudentHealthFemaleEntity {
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

    private String uterus;

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
     * @return uterus
     */
    public String getUterus() {
        return uterus;
    }

    /**
     * @param uterus
     */
    public void setUterus(String uterus) {
        this.uterus = uterus;
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