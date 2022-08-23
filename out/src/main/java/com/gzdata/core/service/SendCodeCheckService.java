                                                    
package com.gzdata.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gzdata.common.db.mybatis.service.AbstractBaseService;
import com.gzdata.common.db.mybatis.dao.BaseDAOInterface;

 
import com.gzdata.core.dao.SendCodeCheckDao;
import com.gzdata.core.model.SendCodeCheck;

/**
 * 
 * 说明：处理对发送验证码校验表的业务操作
 * 
 * @author 张兵帅
 * 
 * @version 1.0
 * 
 * @since 2022年01月05日
 */
@Service
public class SendCodeCheckService extends AbstractBaseService<SendCodeCheck> {

	@Autowired
	private SendCodeCheckDao sendCodeCheckDao;
	
	 
	@Override
	protected BaseDAOInterface<SendCodeCheck> getDAO() {
		return sendCodeCheckDao;
	}

}