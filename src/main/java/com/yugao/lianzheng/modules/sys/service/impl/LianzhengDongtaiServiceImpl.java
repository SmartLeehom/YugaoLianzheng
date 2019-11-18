package com.yugao.lianzheng.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yugao.lianzheng.modules.sys.dao.LianzhengDongtaiDao;
import com.yugao.lianzheng.modules.sys.entity.LianzhengDongtaiEntity;
import com.yugao.lianzheng.modules.sys.service.LianzhengDongtaiService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class LianzhengDongtaiServiceImpl extends ServiceImpl<LianzhengDongtaiDao, LianzhengDongtaiEntity> implements LianzhengDongtaiService {
    @Autowired
    private LianzhengDongtaiDao lzDongtaiDao;

    @Override
    public void updateLianzhengDongtai(LianzhengDongtaiEntity entity) {
        this.lzDongtaiDao.updateLianzhengDongtai(entity);
    }

    @Override
    public List<LianzhengDongtaiEntity> queryList(String createdBy, String beginTime, String endTime, String pattern, String status) {
        return this.lzDongtaiDao.queryList(createdBy, beginTime, endTime, pattern, status);
    }

    @Override
    public void deleteLianzhengDongtai(String id){
        lzDongtaiDao.deleteLianzhengDongtai(id);
    }

    @Override
    public LianzhengDongtaiEntity getLianzhengDongtaiDetail(String id){
        return lzDongtaiDao.getLianzhengDongtaiDetail(id);
    }
}
