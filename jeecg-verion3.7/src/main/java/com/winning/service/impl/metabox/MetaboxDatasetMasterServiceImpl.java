package com.winning.service.impl.metabox;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.winning.service.metabox.MetaboxDatasetMasterServiceI;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("metaboxDatasetMasterService")
@Transactional
public class MetaboxDatasetMasterServiceImpl extends CommonServiceImpl implements MetaboxDatasetMasterServiceI {
	
}