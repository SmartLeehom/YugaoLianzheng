package com.yugao.lianzheng.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yugao.lianzheng.modules.sys.dao.LianzhengContactDao;
import com.yugao.lianzheng.modules.sys.dao.LianzhengUndoDao;
import com.yugao.lianzheng.modules.sys.entity.LianzhengContactEntity;
import com.yugao.lianzheng.modules.sys.entity.LianzhengUndoEntity;
import com.yugao.lianzheng.modules.sys.service.LianzhengContactService;
import com.yugao.lianzheng.modules.sys.service.LianzhengUndoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LianzhengUndoServiceImpl extends ServiceImpl<LianzhengUndoDao, LianzhengUndoEntity> implements LianzhengUndoService {
    @Autowired
    private LianzhengUndoDao lzUndoDao;

    @Override
    public void updateLianzhengUndoEntity(LianzhengUndoEntity lzUndoEntity){
        lzUndoDao.updateLianzhengUndoEntity(lzUndoEntity);
    }

    @Override
    public List<LianzhengUndoEntity> queryList(String lianzhengReferenceId, String type, String dueBy, String finishedBy, String status){
        return lzUndoDao.queryList(lianzhengReferenceId, type, dueBy, finishedBy, status);
    }

    @Override
    public void deleteLianzhengUndoEntity(String id){
        lzUndoDao.deleteLianzhengUndoEntity(id);
    }
}
