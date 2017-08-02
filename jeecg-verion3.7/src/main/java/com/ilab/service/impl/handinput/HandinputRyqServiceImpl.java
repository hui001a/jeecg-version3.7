package com.ilab.service.impl.handinput;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.handinput.HandinputRyqServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("handinputRyqService")
@Transactional
public class HandinputRyqServiceImpl extends CommonServiceImpl implements HandinputRyqServiceI {
	
}