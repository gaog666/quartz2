/**
 * 版权声明： 版权所有 违者必究 2017
*/
package com.xnpool.scheduler.quartz.mapper;

import com.xnpool.scheduler.quartz.entity.JobEntity;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * 表说明：
 *
 * @author gaog
 * @since 2020-05-14 08:29:12
 */
@Mapper
public interface JobEntityMapper extends BaseMapper<JobEntity> {

//	int countByExample(JobEntity record);

    List<JobEntity> selectByExample(JobEntity record);
    
	JobEntity selectByPrimaryKey(Integer id);

//	int insertSelective(JobEntity record);

//	int updateByPrimaryKey(JobEntity record);
	
//	int deleteByPrimaryKey(Integer id);
}