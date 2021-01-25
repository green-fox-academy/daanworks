package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Reddit;
import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.service.RedditService;
import com.greenfoxacademy.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedditController {

    RedditService redditService;
    UserService userService;

    @Autowired
    public RedditController(RedditService redditService, UserService userService) {
        this.redditService = redditService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String showIndex(@RequestParam (required = false) Long page, @RequestParam (required = false) String userName, Model model) {
        if(userName == null) {
            return "login";
        }
        model.addAttribute("postList", redditService.getAllPostsOrderedByUserName(page, userName));
        model.addAttribute("pages", redditService.getPages(redditService.getAllPosts()));
        model.addAttribute("currentUser", userService.getUserByName(userName));
        return "index";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(String userName, String password) {
        User user = userService.loginUser(userName, password);
        if (user == null) {
            return "login";
        } else
            return "redirect:/?page=1&userName=" + user.getUserName();
    }

    @GetMapping("/register")
    public String showRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String postRegister(String userName, String password) {
        User user = userService.createUserIfNotExists(userName, password);
        return "redirect:/?page=1&userName=" + user.getUserName();
    }

    @GetMapping("/add")
    public String showAdd(@RequestParam String userName, Model model) {
        model.addAttribute("currentUser", userService.getUserByName(userName));
        return "add";
    }

    @PostMapping("/add")
    public String postAdd(@RequestParam String userName, Reddit reddit) {
        User user = userService.getUserByName(userName);
        reddit.setUser(user);
        redditService.addPost(reddit);
        return "redirect:/?page=1&userName=" + user.getUserName();
    }

    @GetMapping("/upvote/{id}")
    public String upVote(@PathVariable Long id, @RequestParam String userName) {
        String currentUser = userService.getUserByName(userName).getUserName();
        Integer currentPage = redditService.getCurrentPage(id);
        redditService.upVoteById(id);
        return "redirect:/?page=" + currentPage + "&userName=" + currentUser;
    }

    @GetMapping("/downvote/{id}")
    public String downVote(@PathVariable Long id, @RequestParam String userName) {
        String currentUser = userService.getUserByName(userName).getUserName();
        Integer currentPage = redditService.getCurrentPage(id);
        redditService.downVoteById(id);
        return "redirect:/?page=" + currentPage + "&userName=" + currentUser;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, @RequestParam String userName) {
        String currentUser = userService.getUserByName(userName).getUserName();
        Integer currentPage = redditService.getCurrentPage(id);
        redditService.deletePostById(id);
        return "redirect:/?page=" + currentPage + "&userName=" + currentUser;
    }

}
