package com.library.bookmanage.Service;

import com.library.bookmanage.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {

    public User getUserByUserName(String userName);

}
