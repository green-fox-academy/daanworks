package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.model.Reddit;
import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.repository.RedditRepository;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private RedditRepository redditRepository;
    private UserRepository userRepository;

    @Autowired
    public RedditApplication(RedditRepository redditRepository, UserRepository userRepository) {
        this.redditRepository = redditRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(1L, "admin", "admin"));
        userRepository.save(new User(2L, "admin2", "admin2"));
        userRepository.save(new User(3L, "csak_dzsii", "test123"));
        redditRepository.save(new Reddit("G's first post", "https://thevr.hu", 3L));
        redditRepository.save(new Reddit("first post yay go to fb", "https://facebook.com/", 1L));
        redditRepository.save(new Reddit("second post go to insta", "https://instagram.com/", 1L));
        redditRepository.save(new Reddit("let me google it for you", "https://letmegooglethat.com/", 1L));
        redditRepository.save(new Reddit("FREE PORN", "https://github.com/", 1L));
        redditRepository.save(new Reddit("FREE PORN 2", "https://github.com/", 1L));
        redditRepository.save(new Reddit("wohoooooooooooooooo", "https://9gag.com/", 1L));
        redditRepository.save(new Reddit("EAT COFFEE", "https://starbucks.com/", 1L));
        redditRepository.save(new Reddit("nyan cat", "https://nyancat.com/", 1L));
        redditRepository.save(new Reddit("simple cat", "https://youtube.com/", 1L));
        redditRepository.save(new Reddit("retarted animals", "https://youtube.com/", 1L));
        redditRepository.save(new Reddit("retarted animals 2", "https://youtube.com/", 1L));
        redditRepository.save(new Reddit("retarted animals 3", "https://youtube.com/", 1L));
        redditRepository.save(new Reddit("retarted animals 4", "https://youtube.com/", 1L));
    }
}
