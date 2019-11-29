package com.qf.servive.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.IStuMapper;
import com.qf.entity.Student;
import com.qf.servive.IStuService;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl extends ServiceImpl<IStuMapper, Student> implements IStuService {
}
