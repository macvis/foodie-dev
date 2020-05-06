package xyz.teew.service;

import xyz.teew.domain.Users;

/**
 * @author youchao.wen
 * @date 2020/5/3.
 */
public interface UserService {
    /**
     * 使用id查询
     * @param id
     * @return
     */
    Users queryById(Integer id);

    void addParent(Users parent);

    void addFamily(Users parent, Users child);
}
