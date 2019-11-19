package com.yugao.lianzheng.modules.sys.controller;

import com.yugao.lianzheng.common.utils.R;
import com.yugao.lianzheng.modules.sys.entity.LianzhengContactEntity;
import com.yugao.lianzheng.modules.sys.entity.LianzhengUserEntity;
import com.yugao.lianzheng.modules.sys.service.LianzhengContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * 记事本管理器
 */
@Controller
@RequestMapping("/contact")
@Slf4j
public class LianzhengContactController extends AbstractController{

    @Autowired(required = false)
    private LianzhengContactService lzContactService;

    @RequestMapping(method = RequestMethod.GET, path = "/find")
    @ResponseBody
    public R query() {
        LianzhengUserEntity user=getUser();
        LianzhengContactEntity entity=this.lzContactService.getLianzhengContactDetail();
        return R.ok().put("data",entity);
    }
}
