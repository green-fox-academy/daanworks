package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Reddit;
import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.repository.RedditRepository;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RedditService {

    RedditRepository redditRepository;
    UserRepository userRepository;

    @Autowired
    public RedditService(RedditRepository redditRepository, UserRepository userRepository) {
        this.redditRepository = redditRepository;
        this.userRepository = userRepository;
    }

    public List<Reddit> getAllPosts() {
        return (List<Reddit>) redditRepository.findAll();
    }

    public List<Integer> getPages(List<Reddit> allPosts) {
        List<Integer> pages = new ArrayList<>();
        Integer counter = 1;
        pages.add(counter);
        for (int i = 1; i <= allPosts.size() ; i++) {
            if(i % 10 == 0) {
               counter++;
               pages.add(counter);
            }
        }
        return pages;
    }

    public Integer getCurrentPage(Long id) {
        List<Reddit> allReddits = (List<Reddit>) redditRepository.findAll();
        List<Reddit> allRedditsSorted = allReddits.stream().sorted(Comparator.comparing(Reddit::getVote).reversed()).collect(Collectors.toList());
        Reddit currentReddit = redditRepository.findRedditById(id);
        List<Reddit> currentReddits = new ArrayList<>();
        for (Reddit reddit : allRedditsSorted) {
            if (reddit.getId().equals(currentReddit.getId())) {
                break;
            }
            currentReddits.add(reddit);
        }
        Integer currentPage = 1;
        for (int i = 1; i <= currentReddits.size(); i++) {
            if(i % 10 == 0) {
                currentPage++;
            }
        }
        return currentPage;
    }

    public List<Reddit> getAllPostsOrdered(Long page) {
        List<Reddit> reddits = (List<Reddit>) redditRepository.findAll();
        return reddits.stream().sorted(Comparator.comparing(Reddit::getVote).reversed()).skip(page*10-10).limit(10).collect(Collectors.toList());
    }

    public List<Reddit> getAllPostsOrderedByUserName(Long page, String userName) {
        User user = userRepository.findUserByUserName(userName);
        return user.getRedditList().stream().sorted(Comparator.comparing(Reddit::getVote).reversed()).skip(page*10-10).limit(10).collect(Collectors.toList());
    }

    public void addPost(Reddit reddit) {
        redditRepository.save(reddit);
    }

    public void upVoteById(Long id) {
        Reddit reddit = redditRepository.findRedditById(id);
        reddit.setVote(reddit.getVote() + 1);
        redditRepository.save(reddit);
    }

    public void downVoteById(Long id) {
        Reddit reddit = redditRepository.findRedditById(id);
        if (reddit.getVote() > 0) {
            reddit.setVote(reddit.getVote() - 1);
        }
        redditRepository.save(reddit);
    }

    public void deletePostById(Long id) {
        Reddit reddit = redditRepository.findRedditById(id);
        redditRepository.delete(reddit);
    }
}
