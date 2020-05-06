package xyz.teew.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.teew.domain.Users;
import xyz.teew.mapper.UsersMapper;
import xyz.teew.service.UserService;

/**
 * @author youchao.wen
 * @date 2020/5/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users queryById(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.NESTED, rollbackFor = Exception.class)
    @Override
    public void addParent(Users parent) {
        usersMapper.insert(parent);
        int i = 1 / 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void addFamily(Users parent, Users child) {
        usersMapper.insert(child);
        try {
            addParent(parent);
        } catch (Exception e) {
            throw e;
        }
    }
}
