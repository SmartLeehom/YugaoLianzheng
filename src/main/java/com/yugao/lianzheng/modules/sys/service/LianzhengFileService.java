package com.yugao.lianzheng.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yugao.lianzheng.modules.sys.entity.LianzhengFileEntity;
import com.yugao.lianzheng.modules.sys.entity.LianzhengUserEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


/**
 * <p>
 * 文件信息表
 * 服务实现类
 * </p>
 *
 * @author lihong
 * @since
 */

public interface LianzhengFileService extends IService<LianzhengFileEntity> {

    LianzhengFileEntity uploadFile(MultipartFile file, LianzhengUserEntity entity);

    void deleteFile(String fileId);

    List<LianzhengFileEntity> queryFileList(String businessId, String moduleId, String createdBy);

    LianzhengFileEntity getFileByFileId(String fileId);

}
