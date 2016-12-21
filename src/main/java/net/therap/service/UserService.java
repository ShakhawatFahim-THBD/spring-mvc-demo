package net.therap.service;

import net.therap.command.Login;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.therap.command.Gender.*;

/**
 * @author safat
 * @since 12/19/16
 */
@Service
public class UserService {

    public List<Login> getLogins() {
        List<Login> logins = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Login login = new Login();
            login.setId(i);
            login.setName("login # " + (i + 1));

            logins.add(login);
        }

        return logins;
    }
}
