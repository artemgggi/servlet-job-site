package com.job4you.store;

import com.job4you.model.Candidate;
import com.job4you.model.Post;
import com.job4you.model.User;
import java.util.Collection;

public interface Store {
    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    void savePost(Post post);

    void saveCandidate(Candidate candidate);

    Post findByIdPost(int id);

    Candidate findByIdCandidate(int id);

    void saveUser(User user);

    Collection<User> findAllUsers();

    User findByidUser(int id);
}
