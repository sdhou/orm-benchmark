package com.oye;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Mapper
interface OyeMapper extends BaseMapper<Oye> {
    // MyBatis Plus 会提供默认的 CRUD 方法
}

@Service
class OyeService {
    private final OyeMapper oyeMapper;

    @Autowired
    public OyeService(OyeMapper oyeMapper) {
        this.oyeMapper = oyeMapper;
    }

    public List<Oye> findAll() {
        return oyeMapper.selectList(null); // 查询所有记录
    }
}

@Data
@TableName("oye")
class Oye {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String column1;
    private String column2;
    private String column3;
    private String column4;
    private String column5;
    private String column6;
    private String column7;
    private String column8;
    private String column9;
    private String column10;
    private String column11;
    private String column12;
    private String column13;
    private String column14;
    private String column15;
    private String column16;
    private String column17;
    private String column18;
    private String column19;
}

@RestController
public class OyeController {
    private final OyeService oyeService;

    @Autowired
    public OyeController(OyeService oyeService) {
        this.oyeService = oyeService;
    }

    @GetMapping(value = "/mybatis")
    public void oye() {
        for (int i = 0; i < 100000; i++) {
            oyeService.findAll();
        }
    }

}
