package server.httpserver.pojo;

import java.io.Serializable;

public class TriggersBean extends TriggersBeanKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.JOB_NAME
     *
     * @mbggenerated
     */
    private String jobName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.JOB_GROUP
     *
     * @mbggenerated
     */
    private String jobGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.NEXT_FIRE_TIME
     *
     * @mbggenerated
     */
    private Long nextFireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.PREV_FIRE_TIME
     *
     * @mbggenerated
     */
    private Long prevFireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.PRIORITY
     *
     * @mbggenerated
     */
    private Integer priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.TRIGGER_STATE
     *
     * @mbggenerated
     */
    private String triggerState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.TRIGGER_TYPE
     *
     * @mbggenerated
     */
    private String triggerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.START_TIME
     *
     * @mbggenerated
     */
    private Long startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.END_TIME
     *
     * @mbggenerated
     */
    private Long endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.CALENDAR_NAME
     *
     * @mbggenerated
     */
    private String calendarName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.MISFIRE_INSTR
     *
     * @mbggenerated
     */
    private Short misfireInstr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGGERS.JOB_DATA
     *
     * @mbggenerated
     */
    private byte[] jobData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.JOB_NAME
     *
     * @return the value of QRTZ_TRIGGERS.JOB_NAME
     *
     * @mbggenerated
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.JOB_NAME
     *
     * @param jobName the value for QRTZ_TRIGGERS.JOB_NAME
     *
     * @mbggenerated
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.JOB_GROUP
     *
     * @return the value of QRTZ_TRIGGERS.JOB_GROUP
     *
     * @mbggenerated
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.JOB_GROUP
     *
     * @param jobGroup the value for QRTZ_TRIGGERS.JOB_GROUP
     *
     * @mbggenerated
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.DESCRIPTION
     *
     * @return the value of QRTZ_TRIGGERS.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.DESCRIPTION
     *
     * @param description the value for QRTZ_TRIGGERS.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.NEXT_FIRE_TIME
     *
     * @return the value of QRTZ_TRIGGERS.NEXT_FIRE_TIME
     *
     * @mbggenerated
     */
    public Long getNextFireTime() {
        return nextFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.NEXT_FIRE_TIME
     *
     * @param nextFireTime the value for QRTZ_TRIGGERS.NEXT_FIRE_TIME
     *
     * @mbggenerated
     */
    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.PREV_FIRE_TIME
     *
     * @return the value of QRTZ_TRIGGERS.PREV_FIRE_TIME
     *
     * @mbggenerated
     */
    public Long getPrevFireTime() {
        return prevFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.PREV_FIRE_TIME
     *
     * @param prevFireTime the value for QRTZ_TRIGGERS.PREV_FIRE_TIME
     *
     * @mbggenerated
     */
    public void setPrevFireTime(Long prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.PRIORITY
     *
     * @return the value of QRTZ_TRIGGERS.PRIORITY
     *
     * @mbggenerated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.PRIORITY
     *
     * @param priority the value for QRTZ_TRIGGERS.PRIORITY
     *
     * @mbggenerated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.TRIGGER_STATE
     *
     * @return the value of QRTZ_TRIGGERS.TRIGGER_STATE
     *
     * @mbggenerated
     */
    public String getTriggerState() {
        return triggerState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.TRIGGER_STATE
     *
     * @param triggerState the value for QRTZ_TRIGGERS.TRIGGER_STATE
     *
     * @mbggenerated
     */
    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState == null ? null : triggerState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.TRIGGER_TYPE
     *
     * @return the value of QRTZ_TRIGGERS.TRIGGER_TYPE
     *
     * @mbggenerated
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.TRIGGER_TYPE
     *
     * @param triggerType the value for QRTZ_TRIGGERS.TRIGGER_TYPE
     *
     * @mbggenerated
     */
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType == null ? null : triggerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.START_TIME
     *
     * @return the value of QRTZ_TRIGGERS.START_TIME
     *
     * @mbggenerated
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.START_TIME
     *
     * @param startTime the value for QRTZ_TRIGGERS.START_TIME
     *
     * @mbggenerated
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.END_TIME
     *
     * @return the value of QRTZ_TRIGGERS.END_TIME
     *
     * @mbggenerated
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.END_TIME
     *
     * @param endTime the value for QRTZ_TRIGGERS.END_TIME
     *
     * @mbggenerated
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.CALENDAR_NAME
     *
     * @return the value of QRTZ_TRIGGERS.CALENDAR_NAME
     *
     * @mbggenerated
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.CALENDAR_NAME
     *
     * @param calendarName the value for QRTZ_TRIGGERS.CALENDAR_NAME
     *
     * @mbggenerated
     */
    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName == null ? null : calendarName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.MISFIRE_INSTR
     *
     * @return the value of QRTZ_TRIGGERS.MISFIRE_INSTR
     *
     * @mbggenerated
     */
    public Short getMisfireInstr() {
        return misfireInstr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.MISFIRE_INSTR
     *
     * @param misfireInstr the value for QRTZ_TRIGGERS.MISFIRE_INSTR
     *
     * @mbggenerated
     */
    public void setMisfireInstr(Short misfireInstr) {
        this.misfireInstr = misfireInstr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGGERS.JOB_DATA
     *
     * @return the value of QRTZ_TRIGGERS.JOB_DATA
     *
     * @mbggenerated
     */
    public byte[] getJobData() {
        return jobData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGGERS.JOB_DATA
     *
     * @param jobData the value for QRTZ_TRIGGERS.JOB_DATA
     *
     * @mbggenerated
     */
    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }
}