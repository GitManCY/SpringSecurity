package com.imooc.security.browser;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class MyUserDetailsService implements UserDetailsService {

//    @Autowired
//    Mapper mapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名查找用户信息
        log.info("登录用户名:" + username);
        return new User(username, passwordEncoder.encode("123456"),
                //Your login attempt was not successful, try again.
                //Reason: 用户帐号已被锁定
                true, true, true, true,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
