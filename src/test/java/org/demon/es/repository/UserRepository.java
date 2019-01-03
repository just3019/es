package org.demon.es.repository;

import org.demon.es.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * desc:
 *
 * @author demon
 * @date 2019-01-03 09:33
 */
public interface UserRepository extends ElasticsearchCrudRepository<User, Integer> {


}
