package com.ilab.service.impl.stat;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.stat.StatZdServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("statZdService")
@Transactional
public class StatZdServiceImpl extends CommonServiceImpl implements StatZdServiceI {
	
}