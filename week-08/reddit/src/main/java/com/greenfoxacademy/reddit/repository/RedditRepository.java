package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Reddit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedditRepository extends CrudRepository<Reddit, Long> {
    Reddit findRedditById(Long id);
    List<Reddit> findAllByIdOrderByVote(Long id);
}
