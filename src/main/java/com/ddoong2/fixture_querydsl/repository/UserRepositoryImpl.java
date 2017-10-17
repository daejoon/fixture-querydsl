package com.ddoong2.fixture_querydsl.repository;

import com.ddoong2.fixture_querydsl.entity.QUser;
import com.ddoong2.fixture_querydsl.entity.User;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class UserRepositoryImpl extends QueryDslRepositorySupport implements UserRepository {

    public UserRepositoryImpl() {
        super(User.class);
    }

    @Override
    public List<User> getAllUsers() {
        return from(QUser.user)
            .fetch();
    }
}
