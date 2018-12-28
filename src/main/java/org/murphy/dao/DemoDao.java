package org.murphy.dao;

import org.murphy.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoDao {
    List<User> QueryUsers();
}
