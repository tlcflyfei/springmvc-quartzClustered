package server.httpserver.dao;

import server.httpserver.pojo.FiredTriggersBean;
import server.httpserver.pojo.FiredTriggersBeanKey;

public interface FiredTriggersBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_FIRED_TRIGGERS
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(FiredTriggersBeanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_FIRED_TRIGGERS
     *
     * @mbggenerated
     */
    int insert(FiredTriggersBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_FIRED_TRIGGERS
     *
     * @mbggenerated
     */
    int insertSelective(FiredTriggersBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_FIRED_TRIGGERS
     *
     * @mbggenerated
     */
    FiredTriggersBean selectByPrimaryKey(FiredTriggersBeanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_FIRED_TRIGGERS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FiredTriggersBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_FIRED_TRIGGERS
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FiredTriggersBean record);
}