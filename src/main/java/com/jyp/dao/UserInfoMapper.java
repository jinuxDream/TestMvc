package com.jyp.dao;

import com.jyp.dto.userInfoDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jyp on 2016/11/18.
 */

@Repository
public interface UserInfoMapper {

    List<userInfoDTO> getUserList();

}
