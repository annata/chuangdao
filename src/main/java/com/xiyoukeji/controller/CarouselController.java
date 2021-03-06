package com.xiyoukeji.controller;

import com.xiyoukeji.auth.EditAuthority;
import com.xiyoukeji.entity.Carousel;
import com.xiyoukeji.service.CarouselService;
import com.xiyoukeji.tools.State;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Matilda on 2016/12/23.
 */

@Controller
public class CarouselController {

    @Resource
    CarouselService carouselService;

    @EditAuthority("0")
    @RequestMapping(value = "/addCarousel", method = RequestMethod.POST)
    @ResponseBody
    public Map addCarousel(Carousel carousel) {
        carouselService.addCarousel(carousel);
        Map<String, Object> map = new HashMap<>();
        map.put("state", State.SUCCESS.value());
        map.put("detail", State.SUCCESS.desc());
        return map;
    }

    @EditAuthority("0")
    @RequestMapping(value = "/deleteCarousel", method = RequestMethod.POST)
    @ResponseBody
    public Map deleteCarousel(Integer id) {
        carouselService.deleteCarousel(id);
        Map<String, Object> map = new HashMap<>();
        map.put("state",State.SUCCESS.value());
        map.put("detail", State.SUCCESS.desc());
        return map;
    }

    @EditAuthority("0")
    @RequestMapping(value = "/editCarousel", method = RequestMethod.POST)
    @ResponseBody
    public Map editCarousel(Carousel carousel) {
        carouselService.editCarousel(carousel);
        Map<String, Object> map = new HashMap<>();
        map.put("state",State.SUCCESS.value());
        map.put("detail", State.SUCCESS.desc());
        return map;
    }
}
