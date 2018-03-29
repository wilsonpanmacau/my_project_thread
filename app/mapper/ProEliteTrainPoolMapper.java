package mapper;

import models.ProEliteTrainPool;

public interface ProEliteTrainPoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_elite_train_pool
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_elite_train_pool
     *
     * @mbg.generated
     */
    int insert(ProEliteTrainPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_elite_train_pool
     *
     * @mbg.generated
     */
    int insertSelective(ProEliteTrainPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_elite_train_pool
     *
     * @mbg.generated
     */
    ProEliteTrainPool selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_elite_train_pool
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProEliteTrainPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_elite_train_pool
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProEliteTrainPool record);

    /**
     *  查询金鹰池设置
     */

    ProEliteTrainPool getProEliteTrainPools();

    ProEliteTrainPool selectTrainPool();
}