package com.example.test.service;

import com.example.test.entity.dto.OperationBtnCreateDTO;
import com.example.test.entity.po.OperationBtn;
import com.example.test.entity.vo.OperationBtnVo;
import com.example.test.utils.ResultJson;

public interface OperationBtnService {

    ResultJson<OperationBtnVo> selectOperationBtn(long id);

    ResultJson<OperationBtnVo> insertOperationBtn(OperationBtnCreateDTO createDTO);
}
