package cn.bisonqin.net.finalserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 存储mapping的实体
<servlet-mapping>
     <servlet-name>login</servlet-name>
    <url-pattern>/login</url-pattern>
 </servlet-mapping>
 <servlet-mapping>
    <servlet-name>login</servlet-name>
    <url-pattern>/log</url-pattern>
 </servlet-mapping>
 * Created by Basil on 2017/3/12.
 */
public class Mapping {

    private String name;
    private List<String> urlPattern;

    public Mapping() {
        this.urlPattern = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(List<String> urlPattern) {
        this.urlPattern = urlPattern;
    }
}
