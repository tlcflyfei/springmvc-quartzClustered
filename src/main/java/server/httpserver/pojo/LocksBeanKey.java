package server.httpserver.pojo;

import java.io.Serializable;

public class LocksBeanKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_LOCKS.SCHED_NAME
     *
     * @mbggenerated
     */
    private String schedName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_LOCKS.LOCK_NAME
     *
     * @mbggenerated
     */
    private String lockName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_LOCKS.SCHED_NAME
     *
     * @return the value of QRTZ_LOCKS.SCHED_NAME
     *
     * @mbggenerated
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_LOCKS.SCHED_NAME
     *
     * @param schedName the value for QRTZ_LOCKS.SCHED_NAME
     *
     * @mbggenerated
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName == null ? null : schedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_LOCKS.LOCK_NAME
     *
     * @return the value of QRTZ_LOCKS.LOCK_NAME
     *
     * @mbggenerated
     */
    public String getLockName() {
        return lockName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_LOCKS.LOCK_NAME
     *
     * @param lockName the value for QRTZ_LOCKS.LOCK_NAME
     *
     * @mbggenerated
     */
    public void setLockName(String lockName) {
        this.lockName = lockName == null ? null : lockName.trim();
    }
}