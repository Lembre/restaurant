package dao;

import entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Lembre on 2018.9.25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AdminMapperTest {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void selectByPrimaryKey() {
        short id = 1;
        Admin admin = adminMapper.selectByPrimaryKey(id);
        System.out.println(id);
    }
}