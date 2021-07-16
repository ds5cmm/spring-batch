package io.jarvis.springbatch.batch;

import io.jarvis.springbatch.model.User;
import io.jarvis.springbatch.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> items) throws Exception {

        System.out.println("Data Saved for Users: "+items);

        userRepository.saveAll(items);
    }
}
