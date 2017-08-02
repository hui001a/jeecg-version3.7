package com.ilab.service.impl.stat;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.stat.StatPjServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("statPjService")
@Transactional
public class StatPjServiceImpl extends CommonServiceImpl implements StatPjServiceI {
	
}