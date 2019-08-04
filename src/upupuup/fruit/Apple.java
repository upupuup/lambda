package upupuup.fruit;

import java.io.Serializable;

/**
 * @Author:upupupuup
 * @Date:2019/8/4 9:14 AM
 * @Version 1.0
 * @Description:苹果实体类
 */
public class Apple implements Serializable {
    private String id;
    private String name;
    private String work;
    private String prise;
    private String mark;

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

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getPrise() {
        return prise;
    }

    public void setPrise(String prise) {
        this.prise = prise;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", work='" + work + '\'' +
                ", prise='" + prise + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
