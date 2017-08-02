package com.ilab.service.impl.handinput;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.handinput.HandinputRyzServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("handinputRyzService")
@Transactional
public class HandinputRyzServiceImpl extends CommonServiceImpl implements HandinputRyzServiceI {
	
}