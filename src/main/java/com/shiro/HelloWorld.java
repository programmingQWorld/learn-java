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


}
