package models;

public class ProEliteClass {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.class_type
     *
     * @mbg.generated
     */
    private String classType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.term
     *
     * @mbg.generated
     */
    private String term;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.teacher_name
     *
     * @mbg.generated
     */
    private String teacherName;

    private String assistantTeacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.begin_time
     *
     * @mbg.generated
     */
    private Long beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.train_place
     *
     * @mbg.generated
     */
    private String trainPlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.train_days
     *
     * @mbg.generated
     */
    private Integer trainDays;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.trainee_num
     *
     * @mbg.generated
     */
    private Integer traineeNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.report_localtion
     *
     * @mbg.generated
     */
    private String reportLocaltion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.creator_id
     *
     * @mbg.generated
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.create_time
     *
     * @mbg.generated
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.modifier_id
     *
     * @mbg.generated
     */
    private String modifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.modify_time
     *
     * @mbg.generated
     */
    private Long modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.ts
     *
     * @mbg.generated
     */
    private Long ts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_elite_class.dr
     *
     * @mbg.generated
     */
    private String dr;

    private long reportTime;


    /**
     * 后加字段
     */

    private  String mobileNo; //手机号
    private  String relationName; //联系人
    private  String qrCodeUrl;  //二维码url

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.id
     *
     * @return the value of pro_elite_class.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.id
     *
     * @param id the value for pro_elite_class.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.class_type
     *
     * @return the value of pro_elite_class.class_type
     *
     * @mbg.generated
     */
    public String getClassType() {
        return classType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.class_type
     *
     * @param classType the value for pro_elite_class.class_type
     *
     * @mbg.generated
     */
    public void setClassType(String classType) {
        this.classType = classType == null ? null : classType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.term
     *
     * @return the value of pro_elite_class.term
     *
     * @mbg.generated
     */
    public String getTerm() {
        return term;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.term
     *
     * @param term the value for pro_elite_class.term
     *
     * @mbg.generated
     */
    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.teacher_name
     *
     * @return the value of pro_elite_class.teacher_name
     *
     * @mbg.generated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.teacher_name
     *
     * @param teacherName the value for pro_elite_class.teacher_name
     *
     * @mbg.generated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.begin_time
     *
     * @return the value of pro_elite_class.begin_time
     *
     * @mbg.generated
     */
    public Long getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.begin_time
     *
     * @param beginTime the value for pro_elite_class.begin_time
     *
     * @mbg.generated
     */
    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.train_place
     *
     * @return the value of pro_elite_class.train_place
     *
     * @mbg.generated
     */
    public String getTrainPlace() {
        return trainPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.train_place
     *
     * @param trainPlace the value for pro_elite_class.train_place
     *
     * @mbg.generated
     */
    public void setTrainPlace(String trainPlace) {
        this.trainPlace = trainPlace == null ? null : trainPlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.train_days
     *
     * @return the value of pro_elite_class.train_days
     *
     * @mbg.generated
     */
    public Integer getTrainDays() {
        return trainDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.train_days
     *
     * @param trainDays the value for pro_elite_class.train_days
     *
     * @mbg.generated
     */
    public void setTrainDays(Integer trainDays) {
        this.trainDays = trainDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.trainee_num
     *
     * @return the value of pro_elite_class.trainee_num
     *
     * @mbg.generated
     */
    public Integer getTraineeNum() {
        return traineeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.trainee_num
     *
     * @param traineeNum the value for pro_elite_class.trainee_num
     *
     * @mbg.generated
     */
    public void setTraineeNum(Integer traineeNum) {
        this.traineeNum = traineeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.report_localtion
     *
     * @return the value of pro_elite_class.report_localtion
     *
     * @mbg.generated
     */
    public String getReportLocaltion() {
        return reportLocaltion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.report_localtion
     *
     * @param reportLocaltion the value for pro_elite_class.report_localtion
     *
     * @mbg.generated
     */
    public void setReportLocaltion(String reportLocaltion) {
        this.reportLocaltion = reportLocaltion == null ? null : reportLocaltion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.creator_id
     *
     * @return the value of pro_elite_class.creator_id
     *
     * @mbg.generated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.creator_id
     *
     * @param creatorId the value for pro_elite_class.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.create_time
     *
     * @return the value of pro_elite_class.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.create_time
     *
     * @param createTime the value for pro_elite_class.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.modifier_id
     *
     * @return the value of pro_elite_class.modifier_id
     *
     * @mbg.generated
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.modifier_id
     *
     * @param modifierId the value for pro_elite_class.modifier_id
     *
     * @mbg.generated
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId == null ? null : modifierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.modify_time
     *
     * @return the value of pro_elite_class.modify_time
     *
     * @mbg.generated
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.modify_time
     *
     * @param modifyTime the value for pro_elite_class.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.ts
     *
     * @return the value of pro_elite_class.ts
     *
     * @mbg.generated
     */
    public Long getTs() {
        return ts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.ts
     *
     * @param ts the value for pro_elite_class.ts
     *
     * @mbg.generated
     */
    public void setTs(Long ts) {
        this.ts = ts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_elite_class.dr
     *
     * @return the value of pro_elite_class.dr
     *
     * @mbg.generated
     */
    public String getDr() {
        return dr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_elite_class.dr
     *
     * @param dr the value for pro_elite_class.dr
     *
     * @mbg.generated
     */
    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
    }

    public long getReportTime() {
        return reportTime;
    }

    public void setReportTime(long reportTime) {
        this.reportTime = reportTime;
    }

    public String getAssistantTeacherName() {
        return assistantTeacherName;
    }

    public void setAssistantTeacherName(String assistantTeacherName) {
        this.assistantTeacherName = assistantTeacherName;
    }

}