package com.config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class CommonInit {
    private static Logger logger = LoggerFactory.getLogger(CommonInit.class);
    public CommonInit() {
        super();
    }
    public  static String classPath(){
        String classPath = "";
        try {
            classPath= CommonInit.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            if (classPath.contains(".jar")) {
                String sql = classPath;
                String[] second =sql.split("/");
                StringBuilder url = new StringBuilder("/");
                for (int i = 0; i < second.length - 1; i++) {
                    if (StringUtils.hasText(second[i])) {
                        url.append(second[i] + "/");
                    }
                }
                url.append("config/");
                classPath = url.toString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  classPath;
    }



    /**
     * 用于系统启动初始化加载入口
     */
    public void init(){
        try{
            logger.info("===============启动初始化并加载基础数据======================");



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
