package com.xu.eureka.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**  
 * All rights Reserved, Designed By Hyacinth
 *
 * @Title: AppsFeignService.java   
 * @Package    
 * @Description: 
 * @author: hyacinth
 * @date: 2021年6月14日 下午5:28:24   
 * @version V1.0 
 * @Copyright: 
 */
@FeignClient(name = "EUREKECLIENT")
public interface AppsFeignService {

	@RequestMapping(value = "/client/apps/getAllAppsInfo")
	Object getAllAppsInfo(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize);
	
}

