package com.wuyuan.spring.cloud.weather.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wuyuan.spring.cloud.weather.vo.City;
import com.wuyuan.spring.cloud.weather.vo.Weather;
import com.wuyuan.spring.cloud.weather.vo.WeatherResponse;

/**
 * @author Mawubin
 * @date 2018��9��15��
 */

@FeignClient("eureka-client-zuul-api")
public interface DataService {
	
	@GetMapping("/city/cities")
	List<City> listCity();
	
	@GetMapping("/data/weather/cityId/{cityId}")
	WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
	
	@GetMapping("/data/cityName/{cityName}")
	Weather getDataByCityName(@PathVariable("cityName") String cityName);


}
