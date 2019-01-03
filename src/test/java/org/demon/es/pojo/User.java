package org.demon.es.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * desc:
 *
 * @author demon
 * @date 2019-01-03 09:34
 */
@Data
@Document(indexName = "test-user", type = "user")
public class User {
    @Id
    public Integer id;
    public String name;
    public Integer age;
}
