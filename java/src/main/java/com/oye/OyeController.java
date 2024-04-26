package com.oye;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Mapper
interface OyeMapper extends BaseMapper<Oye> {
    // MyBatis Plus 会提供默认的 CRUD 方法
}

@Service
class OyeJpaService {
    private final OyeRepository oyeRepository;

    public OyeJpaService(OyeRepository oyeRepository) {
        this.oyeRepository = oyeRepository;
    }

    public List<OyeJpa> getAll() {
        return oyeRepository.findAll();
    }

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

interface OyeRepository extends JpaRepository<OyeJpa, Long> {
}

@Data
@TableName("oye")
@Entity
class Oye {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

@Entity
@Data
@Table(name = "oye")
class OyeJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

@Slf4j
@RestController
public class OyeController {
    private final OyeService oyeService;
    private final OyeJpaService oyeJpaService;

    @Value(value = "${spring.datasource.url}")
    private String sqlitePath;

    @Autowired
    public OyeController(OyeService oyeService, OyeJpaService oyeJpaService) {
        this.oyeService = oyeService;
        this.oyeJpaService = oyeJpaService;
    }

    @GetMapping(value = "/mybatis")
    public void mybatis() {
        for (int i = 0; i < 100000; i++) {
            oyeService.findAll();
        }
    }

    @GetMapping(value = "/jdbc")
    public void jdbc() throws SQLException {
        log.info(sqlitePath);
        Connection conn = DriverManager.getConnection(sqlitePath);
        Statement stmt = conn.createStatement();
        for (int i = 0; i < 100000; i++) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM oye");
            while (rs.next()) {
                int id = rs.getInt("id");
            }
        }
    }

    @GetMapping(value = "/jpa")
    public void jpa(){
        for (int i = 0; i < 100000; i++) {
            oyeJpaService.getAll();
        }
    }

}
