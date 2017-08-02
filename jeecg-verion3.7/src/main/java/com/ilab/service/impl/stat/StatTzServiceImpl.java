package com.ilab.service.impl.stat;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.stat.StatTzServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("statTzService")
@Transactional
public class StatTzServiceImpl extends CommonServiceImpl implements StatTzServiceI {
	
}