package com.xu.eureka.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xu.eureka.customer.service.AppsFeignService;
import com.xu.eureka.customer.service.AppsService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Service
public class AppsServiceImpl implements AppsService {

	@Autowired
	private AppsFeignService appsFeignService;
	
	@Override
	public Object getAllAppsInfo(Integer pageNum, Integer pageSize) {
		return appsFeignService.getAllAppsInfo(pageNum, pageSize);
	}

}
