package com.mzj.im.biz;

import com.mzj.im.dao.UserRelationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by ob on 17-3-16.
 */
@Component
public class UserRelationBiz {
    @Autowired
    private UserRelationDAO userRelationDAO;

    public boolean addUserRelation(long userId1, long userId2) {
        return userRelationDAO.insertUserRelation(userId1, userId2);
    }
}
