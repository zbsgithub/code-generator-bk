package com.gzdata.core.qo.jqgrid;

import com.gzdata.core.common.db.mybatis.component.jqgrid.JqgridQuery;
import com.gzdata.core.model.SendCodeCheck;


                                                                        



import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.gzdata.core.common.util.DateUtil;

import java.util.Date;



public class SendCodeCheckJqgridQo extends JqgridQuery<SendCodeCheck>{


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
