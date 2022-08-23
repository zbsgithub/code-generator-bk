package com.gzdata.core.dto;


                                                                        



import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.gzdata.common.util.DateUtil;

import java.util.Date;


/**
 * 
 * 
 * 
 * @author 张兵帅
 * 
 * @version 1.0
 * 
 * @since 2022年01月05日
 */
public class SendCodeCheckDto{


						private Integer id; //pk

						private String phone; //手机号

						private String code; //验证码

					
			@DateTimeFormat(pattern = DateUtil.DEFAULT_DATE_FORMAT)
					private Date checkDate; //校验日期

	    
    		@DateTimeFormat(pattern = DateUtil.DEFAULT_DATETIME_FORMAT)
    						private Date createTime; //创建时间


/** 以下为get,set方法 */
   		 						
        	
        	 public Integer getId() {
		        return this.id;
	        }
	        public void setId(Integer id) {
	        	this.id = id;
	        }
	

   		 						
        	
        	 public String getPhone() {
		        return this.phone;
	        }
	        public void setPhone(String phone) {
	        	this.phone = phone;
	        }
	

   		 						
        	
        	 public String getCode() {
		        return this.code;
	        }
	        public void setCode(String code) {
	        	this.code = code;
	        }
	

   		 				
			@JsonFormat(pattern = DateUtil.DEFAULT_DATE_FORMAT, timezone = DateUtil.DEFAULT_TIMEZONE)
						
        	
        	 public Date getCheckDate() {
		        return this.checkDate;
	        }
	        public void setCheckDate(Date checkDate) {
	        	this.checkDate = checkDate;
	        }
	

   		     
    		@JsonFormat(pattern = DateUtil.DEFAULT_DATETIME_FORMAT, timezone = DateUtil.DEFAULT_TIMEZONE)
    							
        	
        	 public Date getCreateTime() {
		        return this.createTime;
	        }
	        public void setCreateTime(Date createTime) {
	        	this.createTime = createTime;
	        }
	





}
