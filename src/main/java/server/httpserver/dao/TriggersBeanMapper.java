package server.httpserver.dao;

import server.httpserver.pojo.TriggersBean;
import server.httpserver.pojo.TriggersBeanKey;

public interface TriggersBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TriggersBeanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated
     */
    int insert(TriggersBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated
     */
    int insertSelective(TriggersBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated
     */
    TriggersBean selectByPrimaryKey(TriggersBeanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TriggersBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(TriggersBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TriggersBean record);
}