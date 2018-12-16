package com.jarasy.lv.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.cyyz.spt.springbase.util.BaseController;
import com.jarasy.lv.api.adapter.WeixinAdapter;
import com.jarasy.lv.api.domain.po.LvRole;
import com.jarasy.lv.api.domain.po.LvWxUser;
import com.jarasy.lv.api.service.BackpakeService;
import com.jarasy.lv.api.service.LvRoleService;
import com.jarasy.lv.api.service.LvWxUserService;
import com.jarasy.lv.common.http.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cjq on 2018/5/10.
 */
@RestController
@RequestMapping("/backpake")
public class BackPakeController extends BaseController {

    @Autowired
    private BackpakeService backpakeService;



    /**
     * 获取openid
     * @param jsonObject
     * @return
     */
    @RequestMapping(value="/selectGoodsByType",method= RequestMethod.POST, produces = "application/json;charset=utf-8")
    public DataResult selectGoodsByType(@RequestBody JSONObject jsonObject){
        DataResult result = DataResult.init();
        try{
            result.setData( backpakeService.selectGoodsByType(jsonObject));
        }catch(Exception e){
            this.processError(result,e);
        }
        return result;
    }


}