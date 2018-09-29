package com.library.bookmanage.Repository;

import com.library.bookmanage.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    public User getUserByUserName(String userName);

}
