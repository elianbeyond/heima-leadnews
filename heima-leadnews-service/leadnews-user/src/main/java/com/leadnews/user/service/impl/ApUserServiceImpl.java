package com.leadnews.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.common.enums.AppHttpCodeEnum;
import com.heima.model.user.dtos.LoginDto;
import com.heima.model.user.pojos.ApUser;
import com.leadnews.user.mapper.ApUserMapper;
import com.leadnews.user.service.ApUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.helper.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class ApUserServiceImpl extends ServiceImpl<ApUserMapper,ApUser> implements ApUserService {
    @Override
    public ResponseResult login(LoginDto dto) {
        if(!StringUtils.isNotBlank(dto.getPhone())&&!StringUtils.isNotBlank(dto.getPassword())){
            return null;
        }
        return ResponseResult.okResult(AppHttpCodeEnum.SUCCESS);


    }
}
