package club.codeqi.Components;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: codeqi
 * @Description:
 * @Date: create in 2021/2/20 0020 21:15
 */
public class propertyBean {
    private String[] myArray;
    private Map<String,String> mymap;
    private Set<String> mySet;
    private Properties myProperties;

    public String[] getMyArray() {
        return myArray;
    }

    public void setMyArray(String[] myArray) {
        this.myArray = myArray;
    }

    public Map<String, String> getMymap() {
        return mymap;
    }

    public void setMymap(Map<String, String> mymap) {
        this.mymap = mymap;
    }

    public Set<String> getMySet() {
        return mySet;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public Properties getMyProperties() {
        return myProperties;
    }

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }
}
