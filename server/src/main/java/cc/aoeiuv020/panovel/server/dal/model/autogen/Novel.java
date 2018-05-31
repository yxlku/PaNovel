package cc.aoeiuv020.panovel.server.dal.model.autogen;

import java.util.Date;

@SuppressWarnings("all")
public class Novel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel.id
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel.site
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    private String site;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel.author
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel.name
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel.detail
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel.chapters_count
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    private Integer chaptersCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel.receive_update_time
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    private Date receiveUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel.check_update_time
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    private Date checkUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel.id
     *
     * @return the value of novel.id
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel.id
     *
     * @param id the value for novel.id
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel.site
     *
     * @return the value of novel.site
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public String getSite() {
        return site;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel.site
     *
     * @param site the value for novel.site
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel.author
     *
     * @return the value of novel.author
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel.author
     *
     * @param author the value for novel.author
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel.name
     *
     * @return the value of novel.name
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel.name
     *
     * @param name the value for novel.name
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel.detail
     *
     * @return the value of novel.detail
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel.detail
     *
     * @param detail the value for novel.detail
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel.chapters_count
     *
     * @return the value of novel.chapters_count
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public Integer getChaptersCount() {
        return chaptersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel.chapters_count
     *
     * @param chaptersCount the value for novel.chapters_count
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public void setChaptersCount(Integer chaptersCount) {
        this.chaptersCount = chaptersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel.receive_update_time
     *
     * @return the value of novel.receive_update_time
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public Date getReceiveUpdateTime() {
        return receiveUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel.receive_update_time
     *
     * @param receiveUpdateTime the value for novel.receive_update_time
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public void setReceiveUpdateTime(Date receiveUpdateTime) {
        this.receiveUpdateTime = receiveUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel.check_update_time
     *
     * @return the value of novel.check_update_time
     *
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public Date getCheckUpdateTime() {
        return checkUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel.check_update_time
     *
     * @param checkUpdateTime the value for novel.check_update_time
     * @mbg.generated Thu May 31 19:08:55 CST 2018
     */
    public void setCheckUpdateTime(Date checkUpdateTime) {
        this.checkUpdateTime = checkUpdateTime;
    }
}