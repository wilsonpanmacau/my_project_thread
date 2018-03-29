package mapper;

import com.hht.interceptor.Page;
import models.ProEliteExaminationOnline;

import java.util.List;
import java.util.Map;

public interface ProEliteExaminationOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_elite_examination_online
     *
     * @mbg.generated
     */
    int insert(ProEliteExaminationOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_elite_examination_online
     *
     * @mbg.generated
     */
    int insertSelective(ProEliteExaminationOnline record);


    List<Map<String,Object>> getExamTransitEmployees(Map<String, Object> mapParams);

    List<Map<String,Object>> getProEliteExaminationByEmployee(Map<String, Object> mapParams);

    int getExamTimesCountByEmployyeCode( String code);

    int deleteByEmployeeCode(String employeeCode);

    List<Map<String,Object>> getExamEmployeesByListPage(Page page);

    ProEliteExaminationOnline getProBeanByEmployee(Map<String, Object> params);

    /**
     * 根据条件查询当月考试人数
     * @param shopIdList
     * @return
     */
    List<Map<String,Object>> getExamPassCountByList(Map<String, Object> shopIdList);
}