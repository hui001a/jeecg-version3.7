package com.winning.service.impl.metabox;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.winning.service.metabox.MetaboxDeMasterServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("metaboxDeMasterService")
@Transactional
public class MetaboxDeMasterServiceImpl extends CommonServiceImpl implements MetaboxDeMasterServiceI {
	
}