package com.gzdata.core.controller.data;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gzdata.common.db.mybatis.result.Result;
import com.gzdata.core.instance.module.SendCodeCheck;
import com.gzdata.core.instance.dto.SendCodeCheckDto;
import com.gzdata.core.instance.qo.defaults.SendCodeCheckQo;
import com.gzdata.core.service.SendCodeCheckService;

/**
 * 
 * SendCodeCheck信息控制器（管理员）
 *
 * @author 张兵帅
 *
 * @version
 *
 * @since 2022年01月05日
 */
@Controller
public class SendCodeCheckDataController {

	@Autowired
	private  SendCodeCheckService sendCodeCheckService;
	
	/**
	 * 
	 * 功能描述：发送验证码校验表列表--普通分页
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping("data/send/code/check/pagelist")
	@ResponseBody
	public Result pagelist(@RequestBody SendCodeCheckQo qo) {
		return Result.valueOf(Result.SUCCESS, "操作成功", sendCodeCheckService.findPaginationDataByCondition(qo));
	}
	
	/**
	 * 
	 * 功能描述：发送验证码校验表列表--通过条件查询
	 * 
	 * @return
	 * 
	 * @author 张兵帅
	 * 
	 * @since 2022年01月05日
	 * 
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping("data/send/code/check/list")
	@ResponseBody
	public Result list(@RequestBody SendCodeCheckQo qo) {
		return Result.valueOf(Result.SUCCESS, "操作成功", sendCodeCheckService.findList(qo));
	}

	

	/**
	 * 
	 * 功能描述：发送验证码校验表详情
	 *
	 * @param id
	 * @return
	 * 
	 * @author 张兵帅
	 *
	 * @since 2015年10月30日
	 *
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping("data/send/code/check/detail")
	@ResponseBody
	public Result detail(@RequestParam String id) {

		return Result.valueOf(Result.SUCCESS, "操作成功", sendCodeCheckService.findById(id));
	}
	
	/**
	 * 
	 * 功能描述：发送验证码校验表批量删除
	 *
	 * @param id
	 * @return
	 * 
	 * @author 张兵帅
	 *
	 * @since 2015年10月30日
	 *
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping("data/send/code/check/batch_delete")
	@ResponseBody
	public Result batchDelete(@RequestParam Serializable... ids) {

	 	 sendCodeCheckService.batchDelete(ids);
			

		return Result.valueOf(Result.SUCCESS, "操作成功");
	}

	/**
	 * 
	 * 功能描述：发送验证码校验表删除
	 *
	 * @param id
	 * @return
	 * 
	 * @author 张兵帅
	 *
	 * @since 2015年10月30日
	 *
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping("data/send/code/check/delete")
	@ResponseBody
	public Result delete(@RequestParam String id) {

		
			 			 sendCodeCheckService.deleteByID(id);
			
		return Result.valueOf(Result.SUCCESS, "操作成功");
	}

	/**
	 * 
	 * 功能描述：发送验证码校验表添加
	 *
	 * @param id
	 * @return
	 * 
	 * @author 张兵帅
	 *
	 * @since 2015年10月30日
	 *
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping("data/send/code/check/add")
	@ResponseBody
	 	 public Result add(@RequestBody SendCodeCheckDto dto) {
	
	
		 				SendCodeCheck sendCodeCheck = new SendCodeCheck();
				BeanUtils.copyProperties(dto, sendCodeCheck);
				sendCodeCheckService.insert(sendCodeCheck);
		
				

		return Result.valueOf(Result.SUCCESS, "操作成功");
	}

	/**
	 * 
	 * 功能描述：发送验证码校验表修改
	 *
	 * @param id
	 * @return
	 * 
	 * @author 张兵帅
	 *
	 * @since 2015年10月30日
	 *
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping("data/send/code/check/update")
	@ResponseBody
	 	 public Result edit(@RequestBody SendCodeCheckDto dto) {
		
	 				SendCodeCheck sendCodeCheck = new SendCodeCheck();
				BeanUtils.copyProperties(dto, sendCodeCheck);
				sendCodeCheckService.updateSelective(sendCodeCheck);
		
		
		return Result.valueOf(Result.SUCCESS, "操作成功");
	}

}
