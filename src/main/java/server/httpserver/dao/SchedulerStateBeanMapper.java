package server.httpserver.dao;

import server.httpserver.pojo.SchedulerStateBean;
import server.httpserver.pojo.SchedulerStateBeanKey;

public interface SchedulerStateBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(SchedulerStateBeanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated
     */
    int insert(SchedulerStateBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated
     */
    int insertSelective(SchedulerStateBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated
     */
    SchedulerStateBean selectByPrimaryKey(SchedulerStateBeanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SchedulerStateBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SchedulerStateBean record);
}