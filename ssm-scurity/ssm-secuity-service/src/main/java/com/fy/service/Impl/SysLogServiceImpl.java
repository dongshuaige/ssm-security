package com.fy.service.Impl;

import com.fy.dao.SysLogDao;
import com.fy.domain.SysLog;
import com.fy.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author java
 * @create 2019-08-17 18:13
 * @desc
 * @ClassName
 **/
@Service
public class SysLogServiceImpl implements ISysLogService {
    @Autowired
    private SysLogDao sysLogDao;
    @Override
    public void save(SysLog sysLog) throws Exception {
          sysLogDao.save(sysLog);
    }

    @Override
    public List<SysLog> findAll() throws Exception {
        return sysLogDao.findAll();
    }
}
