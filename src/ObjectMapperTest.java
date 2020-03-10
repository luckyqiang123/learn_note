package src;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ObjectMapperTest
 * @Description: TODO
 * @Author: zhangzhiqiang
 * @Date: 2020-03-10 11:07
 * @Company: www.luckyqiang.cn
 */
public class ObjectMapperTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person(1, "tom", "123");
        String jsonString = null;

        //java对象转为json
        jsonString = objectMapper.writeValueAsString(person);
        System.out.println("java对象转为json-----");
        System.out.println("JsonString: " + jsonString);

        //json转为java对象
        Person person1 = objectMapper.readValue(jsonString, Person.class);
        System.out.println("json转为java对象-----");
        System.out.println(person1.toString());

        Person person2 = new Person(2, "jack", "123445");
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        String jsonListString = objectMapper.writeValueAsString(personList);
        System.out.println("Java数组转换为JSON数组-----");
        System.out.println("JsonString List: " + jsonListString);

        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, Person.class);
        List<Person> list = objectMapper.readValue(jsonListString, javaType);
        System.out.println("JSON数组转换为Java数组-----");
        for (Person person3 : list) {
            System.out.println("Person: " + person3.toString());
        }
    }
}
