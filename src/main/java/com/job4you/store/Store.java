package com.job4you.store;

import com.job4you.model.Candidate;
import com.job4you.model.Post;
import java.util.Collection;

public interface Store {
    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    void save(Post post);

    Post findById(int id);
}
