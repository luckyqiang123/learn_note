package src;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2020-03-10 11:06
 * @Company: www.luckyqiang.cn
 */
public class Person {
    private int id;
    private String name;
    private String password;

    public Person() {
        super();
    }

    public Person(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
