package pl.sda.service;

import pl.sda.model.User;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    public List<User> findByDate(List<User> users, LocalDate from, LocalDate to) {
        List<User> collect = users.stream()
                .filter(user -> user.getOpeningDate().isAfter(from) && user.getOpeningDate().isBefore(to))
                .collect(Collectors.toList());
        return collect;
    }
}
