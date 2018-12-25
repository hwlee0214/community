package com.web;

import com.web.repository.BoardRepository;
import com.web.repository.AccountRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaMappingTest {

    private final String boardTestTitle = "테스트";
    private final String email = "reg.hwlee@gmail.com";


    @Autowired
    AccountRepository userRepository;

    @Autowired
    BoardRepository boardRepository;
}
