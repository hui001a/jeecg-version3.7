package com.ilab.service.impl.handinput;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilab.service.handinput.HandinputRyhServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("handinputRyhService")
@Transactional
public class HandinputRyhServiceImpl extends CommonServiceImpl implements HandinputRyhServiceI {
	
}