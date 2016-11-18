package java.com.jyp.controller;

import com.jyp.controller.HelloMVC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jyp on 2016/11/18.
 */
@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations="classpath*:applicationContext*.xml") // 加载配置
public class HelloMVCTest {

    @Autowired
    private HelloMVC helloMVC;

    @Test
    public void hello() throws Exception {
        helloMVC.hello();
    }

    @Test
    public void getUserList() throws Exception {

    }

}