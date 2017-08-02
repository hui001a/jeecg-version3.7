package com.ilab.service.impl.stat;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.stat.StatLisServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("statLisService")
@Transactional
public class StatLisServiceImpl extends CommonServiceImpl implements StatLisServiceI {
	
}