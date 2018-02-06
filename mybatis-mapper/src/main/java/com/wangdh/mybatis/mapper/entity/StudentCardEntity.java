package com.wangdh.mybatis.mapper.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_student_card")
public class StudentCardEntity {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "native")
    private String _native;

    @Column(name = "issue_date")
    private Date issueDate;

    @Column(name = "end_date")
    private Date endDate;

    private String remark;

    private String no;

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
     * @return native
     */
    public String getNative() {
        return _native;
    }

    /**
     * @param native
     */
    public void setNative(String _native) {
        this._native = _native;
    }

    /**
     * @return issue_date
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return end_date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
}