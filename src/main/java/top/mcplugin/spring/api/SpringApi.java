package top.mcplugin.spring.api;

import top.mcplugin.spring.Main;
import org.springframework.context.ApplicationContext;

/**
 * @Author 二木
 * @Description
 * @Date 2023/3/13 18:07
 */
public class SpringApi {
    public static ApplicationContext getApplicationContext(){
        return Main.getInstance().getApplicationContext();
    }

    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }
}
