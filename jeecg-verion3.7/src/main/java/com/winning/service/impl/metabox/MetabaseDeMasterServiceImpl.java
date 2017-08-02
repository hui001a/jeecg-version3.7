package com.winning.service.impl.metabox;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.winning.service.metabox.MetabaseDeMasterServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("metabaseDeMasterService")
@Transactional
public class MetabaseDeMasterServiceImpl extends CommonServiceImpl implements MetabaseDeMasterServiceI {
	
}