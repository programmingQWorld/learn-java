package com.shiro;

import com.shiro.commonenum.UserEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.shiro.mgt.SecurityManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);  // 获取到logger实例
    @Test
    public void testLogger () {
        log.info("我们正在测试log4j……");
        /**
         * 1、 获取安全管理器
         * 2、 获取用户
         * 3、 用户登录验证
         * 4、 权限管理
         * 5、 角色管理
         * 6、 session:
         */

        // 1、 获取安全管理器
         IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
         SecurityManager securityManager = (SecurityManager) factory.getInstance();
         //2、 需要设置安全管理器
        SecurityUtils.setSecurityManager(securityManager);
        //3、 获取Subject对象，即将登录的用户
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        session.setAttribute("name", "林枨锜");
        String value = (String) session.getAttribute("name");
        if ( value != null ) {
            log.info("Shiro已经帮我们获取到了session会话对象中指定的值：" + value);
        }

    }

    /**
     * 测试   枚举类
     */
    @Test
    public void enumTest () {
        UserEnum userEnum = UserEnum.NO_REGISTERED;
        System.out.println("code: " + userEnum.getCode());
        System.out.println("info: " + userEnum.getInfo());

        String blessing = "Happy New Year!";
        String blessing2 = "Merry Christmas!";
        String blessing3 = "Merry Christmas!";
        boolean blessMatchResult = java.util.Objects.equals(null, null);   // true
        System.out.println(blessMatchResult);
    }

    @Test
    public void testSubList () {
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        List resultList =  list.subList(2, 4);
        System.out.println(resultList);
        resultList.set(0, "这是一个纠结.");
        System.out.println(resultList);
        resultList.add("当心，我是颗炸弹.");
        System.out.println(resultList);
        System.out.println(list);
        list.add("一颗真正的炸弹");
        System.out.println(list);
        System.out.println("遍历子列表");;
        System.out.println(resultList);  // 影响了原列表的个数，再来遍历|增加|修改子列表就报出异常了
    }

    @Test
    public void testAsList() {
        String[] strs = new String[] {"a", "b", "c"};
        List list = Arrays.asList(strs);
        //list.add("c");  报出异常
        strs[0] = "世界和平";
        System.out.println(list);
    }

}
