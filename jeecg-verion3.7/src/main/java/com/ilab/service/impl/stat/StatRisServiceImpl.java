package com.ilab.service.impl.stat;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.stat.StatRisServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("statRisService")
@Transactional
public class StatRisServiceImpl extends CommonServiceImpl implements StatRisServiceI {
	
}