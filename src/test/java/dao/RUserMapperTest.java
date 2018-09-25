package dao;

import entity.RUser;
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
public class RUserMapperTest {

    @Autowired
    private RUserMapper rUserMapper;

    @Test
    public void selectByPrimaryKey() {
        Integer id = 1;
        RUser rUser = rUserMapper.selectByPrimaryKey(id);
        System.out.println(rUser);
    }
}