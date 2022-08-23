
                                                    

package com.gzdata.core.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
 import org.apache.ibatis.annotations.Options;


import com.gzdata.common.db.mybatis.dao.BaseDAOInterface;
import com.gzdata.common.db.mybatis.query.QueryInterface;
import com.gzdata.core.model.SendCodeCheck;

/**
 * 
 *  说明：发送验证码校验表对象的数据访问类
 * 
 * @author 张兵帅
 * 
 * @version 1.0
 * 
 * @since 2022年01月05日
 */
public interface SendCodeCheckDao extends BaseDAOInterface<SendCodeCheck> {

	 	
	/**
	 * 
	 * 功能描述：保存
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Insert({ "insert into send_code_check ( id,phone,code,check_date,create_time)  values (#{id,jdbcType=INTEGER},#{phone,jdbcType=VARCHAR},#{code,jdbcType=VARCHAR},#{checkDate,jdbcType=DATE},#{createTime,jdbcType=TIMESTAMP})" })
	@Override
	 	@Options(useGeneratedKeys = true, keyProperty = "id")
		public void insert(SendCodeCheck entity);

	/**
	 * 
	 * 功能描述：选择字段保存
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Insert({
			"<script>"
			+"insert into send_code_check "
		    +"<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" > <if test=\"id != null\" > id, </if> <if test=\"phone != null\" > phone, </if> <if test=\"code != null\" > code, </if> <if test=\"checkDate != null\" > check_date, </if> <if test=\"createTime != null\" > create_time, </if>  </trim> "
		    +" <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >  <if test=\"id != null\" > #{id,jdbcType=INTEGER}, </if> <if test=\"phone != null\" > #{phone,jdbcType=VARCHAR}, </if> <if test=\"code != null\" > #{code,jdbcType=VARCHAR}, </if> <if test=\"checkDate != null\" > #{checkDate,jdbcType=DATE}, </if> <if test=\"createTime != null\" > #{createTime,jdbcType=TIMESTAMP}, </if> </trim>"
		    +"</script>" 
			})
	@Override
	 	@Options(useGeneratedKeys = true, keyProperty = "id")
		public void insertSelective(SendCodeCheck entity);
	
	

	/**
	 * 
	 * 功能描述：根据ID删除
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Delete({ "delete from send_code_check where id = #{id,jdbcType=INTEGER}" })
	@Override
	public void deleteByID(Serializable id);

	/**
	 * 
	 * 功能描述：根据ID数组批量删除
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Delete({
			"<script>"
			+"delete from send_code_check where id in "
			+"<foreach  item=\"id\"  collection=\"array\" open=\"(\" separator=\",\" close=\")\" > #{id} </foreach>"
			+"</script>" 
			})
	@Override
	public void batchDelete(Serializable... ids);

	/**
	 * 
	 * 功能描述：更新
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Update({ "update send_code_check set id= #{id,jdbcType=INTEGER},phone= #{phone,jdbcType=VARCHAR},code= #{code,jdbcType=VARCHAR},check_date= #{checkDate,jdbcType=DATE},create_time= #{createTime,jdbcType=TIMESTAMP} where id = #{id,jdbcType=INTEGER} " })
	@Override
	public void update(SendCodeCheck entity);
	
	

	/**
	 * 
	 * 功能描述：选择字段更新
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Update({
			"<script>"
			+"update send_code_check "
			+"<set > <if test=\"id != null\" > id = #{id,jdbcType=INTEGER}, </if> <if test=\"phone != null\" > phone = #{phone,jdbcType=VARCHAR}, </if> <if test=\"code != null\" > code = #{code,jdbcType=VARCHAR}, </if> <if test=\"checkDate != null\" > check_date = #{checkDate,jdbcType=DATE}, </if> <if test=\"createTime != null\" > create_time = #{createTime,jdbcType=TIMESTAMP}, </if>  </set> "
			+"where id = #{id,jdbcType=INTEGER}"
			+"</script>" 
			})
	@Override
	public void updateSelective(SendCodeCheck entity);

	
	/**
	 * 
	 * 功能描述：查询所有
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Select({ "select * from send_code_check" })
	@Results({@Result(column = "id", property = "id" , jdbcType = JdbcType.INTEGER ,id = true  ),@Result(column = "phone", property = "phone" , jdbcType = JdbcType.VARCHAR ),@Result(column = "code", property = "code" , jdbcType = JdbcType.VARCHAR ),@Result(column = "check_date", property = "checkDate" , jdbcType = JdbcType.DATE ),@Result(column = "create_time", property = "createTime" , jdbcType = JdbcType.TIMESTAMP ) })
	@Override
	public List<SendCodeCheck> findAll();

	/**
	 * 
	 * 功能描述：查询总数
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Select({ "select count(id) from send_code_check" })
	@Override
	public int findTotalCount();

	/**
	 * 
	 * 功能描述：根据ID查询
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Select({ "select * from send_code_check where id = #{id,jdbcType=INTEGER}" })
	@Results({@Result(column = "id", property = "id" , jdbcType = JdbcType.INTEGER ,id = true  ),@Result(column = "phone", property = "phone" , jdbcType = JdbcType.VARCHAR ),@Result(column = "code", property = "code" , jdbcType = JdbcType.VARCHAR ),@Result(column = "check_date", property = "checkDate" , jdbcType = JdbcType.DATE ),@Result(column = "create_time", property = "createTime" , jdbcType = JdbcType.TIMESTAMP ) })
	@Override
	public SendCodeCheck findById(Serializable id);

	/**
	 * 
	 * 功能描述：根据查询对象查询
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Select({
			"<script>"
			+"select * from send_code_check "
			+"<where> 1 = 1 "
			+"<if test=\"id != null\" > and id = #{id,jdbcType=INTEGER} </if><if test=\"phone != null\" > and phone = #{phone,jdbcType=VARCHAR} </if><if test=\"code != null\" > and code = #{code,jdbcType=VARCHAR} </if><if test=\"checkDate != null\" > and check_date = #{checkDate,jdbcType=DATE} </if><if test=\"createTime != null\" > and create_time = #{createTime,jdbcType=TIMESTAMP} </if> "
			+"</where> order by id </script>" 
			})
	@Results({@Result(column = "id", property = "id" , jdbcType = JdbcType.INTEGER ,id = true  ),@Result(column = "phone", property = "phone" , jdbcType = JdbcType.VARCHAR ),@Result(column = "code", property = "code" , jdbcType = JdbcType.VARCHAR ),@Result(column = "check_date", property = "checkDate" , jdbcType = JdbcType.DATE ),@Result(column = "create_time", property = "createTime" , jdbcType = JdbcType.TIMESTAMP ) })
	@Override
	public List<SendCodeCheck> findList(QueryInterface query);

	/**
	 * 
	 * 功能描述：根据查询对象查询记录数
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Select({
			"<script>"
			+"select count(id) from send_code_check "
			+"<where> 1 = 1 "
			+"<if test=\"id != null\" > and id = #{id,jdbcType=INTEGER} </if><if test=\"phone != null\" > and phone = #{phone,jdbcType=VARCHAR} </if><if test=\"code != null\" > and code = #{code,jdbcType=VARCHAR} </if><if test=\"checkDate != null\" > and check_date = #{checkDate,jdbcType=DATE} </if><if test=\"createTime != null\" > and create_time = #{createTime,jdbcType=TIMESTAMP} </if> "
			+"</where></script>" 
			})
	@Override
	public int findTotalCountByCondition(QueryInterface query);

	/**
	 * 
	 * 功能描述：根据查询对象查询分页记录
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Select({
			"<script>"
			+"select * from send_code_check "
			+"<where> 1 = 1 "
			+"<if test=\"id != null\" > and id = #{id,jdbcType=INTEGER} </if><if test=\"phone != null\" > and phone = #{phone,jdbcType=VARCHAR} </if><if test=\"code != null\" > and code = #{code,jdbcType=VARCHAR} </if><if test=\"checkDate != null\" > and check_date = #{checkDate,jdbcType=DATE} </if><if test=\"createTime != null\" > and create_time = #{createTime,jdbcType=TIMESTAMP} </if> "
			+"</where> order by id "
			+"<if test=\"pagination==1\" > limit #{first,jdbcType=INTEGER},#{pageSize,jdbcType=INTEGER}</if>"
			+"</script>" 
			})
	@Results({@Result(column = "id", property = "id" , jdbcType = JdbcType.INTEGER ,id = true  ),@Result(column = "phone", property = "phone" , jdbcType = JdbcType.VARCHAR ),@Result(column = "code", property = "code" , jdbcType = JdbcType.VARCHAR ),@Result(column = "check_date", property = "checkDate" , jdbcType = JdbcType.DATE ),@Result(column = "create_time", property = "createTime" , jdbcType = JdbcType.TIMESTAMP ) })
	@Override
	public List<SendCodeCheck> findPaginationDataByCondition(QueryInterface query);

}

