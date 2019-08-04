package upupuup.fruit;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:upupupuup
 * @Date:2019/8/4 9:14 AM
 * @Version 1.0
 * @Description:水果实体类
 */
public class Fruit implements Serializable {
    private String id;
    private String name;
    private String type;
    private String space;
    private String mark;
    private List<Apple> appleList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public List<Apple> getAppleList() {
        return appleList;
    }

    public void setAppleList(List<Apple> appleList) {
        this.appleList = appleList;
    }

    @Override
    public String toString() {
        return "fruit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", space='" + space + '\'' +
                ", mark='" + mark + '\'' +
                ", appleList=" + appleList +
                '}';
    }
}