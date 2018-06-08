package server.httpserver.dao;

import org.springframework.stereotype.Repository;
import server.httpserver.pojo.JobAndTriggerBean;
import server.httpserver.pojo.JobDetailsBean;
import server.httpserver.pojo.JobDetailsBeanKey;

import java.util.List;

public interface JobDetailsBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_DETAILS
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(JobDetailsBeanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_DETAILS
     *
     * @mbggenerated
     */
    int insert(JobDetailsBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_DETAILS
     *
     * @mbggenerated
     */
    int insertSelective(JobDetailsBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_DETAILS
     *
     * @mbggenerated
     */
    JobDetailsBean selectByPrimaryKey(JobDetailsBeanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_DETAILS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JobDetailsBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_DETAILS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(JobDetailsBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_DETAILS
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JobDetailsBean record);

    /**
     * 查询所有的定时任务
     * @return
     */
    List<JobAndTriggerBean> selectAllJobAndTrigger();
}