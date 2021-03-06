package server.httpserver.pojo;

import java.io.Serializable;

public class FiredTriggersBean extends FiredTriggersBeanKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated
     */
    private String triggerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated
     */
    private String triggerGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.INSTANCE_NAME
     *
     * @mbggenerated
     */
    private String instanceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.FIRED_TIME
     *
     * @mbggenerated
     */
    private Long firedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.SCHED_TIME
     *
     * @mbggenerated
     */
    private Long schedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.PRIORITY
     *
     * @mbggenerated
     */
    private Integer priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.STATE
     *
     * @mbggenerated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.JOB_NAME
     *
     * @mbggenerated
     */
    private String jobName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.JOB_GROUP
     *
     * @mbggenerated
     */
    private String jobGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.IS_NONCONCURRENT
     *
     * @mbggenerated
     */
    private String isNonconcurrent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_FIRED_TRIGGERS.REQUESTS_RECOVERY
     *
     * @mbggenerated
     */
    private String requestsRecovery;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QRTZ_FIRED_TRIGGERS
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.TRIGGER_NAME
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.TRIGGER_NAME
     *
     * @param triggerName the value for QRTZ_FIRED_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName == null ? null : triggerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP
     *
     * @param triggerGroup the value for QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup == null ? null : triggerGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.INSTANCE_NAME
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.INSTANCE_NAME
     *
     * @mbggenerated
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.INSTANCE_NAME
     *
     * @param instanceName the value for QRTZ_FIRED_TRIGGERS.INSTANCE_NAME
     *
     * @mbggenerated
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName == null ? null : instanceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.FIRED_TIME
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.FIRED_TIME
     *
     * @mbggenerated
     */
    public Long getFiredTime() {
        return firedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.FIRED_TIME
     *
     * @param firedTime the value for QRTZ_FIRED_TRIGGERS.FIRED_TIME
     *
     * @mbggenerated
     */
    public void setFiredTime(Long firedTime) {
        this.firedTime = firedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.SCHED_TIME
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.SCHED_TIME
     *
     * @mbggenerated
     */
    public Long getSchedTime() {
        return schedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.SCHED_TIME
     *
     * @param schedTime the value for QRTZ_FIRED_TRIGGERS.SCHED_TIME
     *
     * @mbggenerated
     */
    public void setSchedTime(Long schedTime) {
        this.schedTime = schedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.PRIORITY
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.PRIORITY
     *
     * @mbggenerated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.PRIORITY
     *
     * @param priority the value for QRTZ_FIRED_TRIGGERS.PRIORITY
     *
     * @mbggenerated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.STATE
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.STATE
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.STATE
     *
     * @param state the value for QRTZ_FIRED_TRIGGERS.STATE
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.JOB_NAME
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.JOB_NAME
     *
     * @mbggenerated
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.JOB_NAME
     *
     * @param jobName the value for QRTZ_FIRED_TRIGGERS.JOB_NAME
     *
     * @mbggenerated
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.JOB_GROUP
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.JOB_GROUP
     *
     * @mbggenerated
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.JOB_GROUP
     *
     * @param jobGroup the value for QRTZ_FIRED_TRIGGERS.JOB_GROUP
     *
     * @mbggenerated
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.IS_NONCONCURRENT
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.IS_NONCONCURRENT
     *
     * @mbggenerated
     */
    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.IS_NONCONCURRENT
     *
     * @param isNonconcurrent the value for QRTZ_FIRED_TRIGGERS.IS_NONCONCURRENT
     *
     * @mbggenerated
     */
    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent == null ? null : isNonconcurrent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_FIRED_TRIGGERS.REQUESTS_RECOVERY
     *
     * @return the value of QRTZ_FIRED_TRIGGERS.REQUESTS_RECOVERY
     *
     * @mbggenerated
     */
    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_FIRED_TRIGGERS.REQUESTS_RECOVERY
     *
     * @param requestsRecovery the value for QRTZ_FIRED_TRIGGERS.REQUESTS_RECOVERY
     *
     * @mbggenerated
     */
    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery == null ? null : requestsRecovery.trim();
    }
}