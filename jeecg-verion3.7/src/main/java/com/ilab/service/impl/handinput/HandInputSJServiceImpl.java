package com.ilab.service.impl.handinput;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.handinput.HandInputSJServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("handInputSJService")
@Transactional
public class HandInputSJServiceImpl extends CommonServiceImpl implements HandInputSJServiceI {
	
}