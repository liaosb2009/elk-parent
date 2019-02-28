package com.elk.portal.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by liao on 2019/2/26.
 * 替换路径监听器
 */
public class PortalServetStartupListener implements ServletContextListener {

    public PortalServetStartupListener() {
        System.out.println("PortalServetStartupListener...");
    }

    /**
     * 过滤路径
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        ServletContext application = sce.getServletContext();
        String path = application.getContextPath();
        application.setAttribute("APP_PATH", path);
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {

    }
}
