package com.ilab.service.impl.handinput;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.handinput.HandinputRsServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("handinputRsService")
@Transactional
public class HandinputRsServiceImpl extends CommonServiceImpl implements HandinputRsServiceI {
	
}