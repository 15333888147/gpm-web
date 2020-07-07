package com.zj.springcloud.mapper.service;

import com.zj.springcloud.model.TMenu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: zj
 * @Date: 2020/7/7
 */

@FeignClient(value = "gpm-interface")
public interface SpringcloudGpmService {

    @GetMapping("/firstMenu")
    List<TMenu> firstMenu(@RequestParam("id") Long id);

}
