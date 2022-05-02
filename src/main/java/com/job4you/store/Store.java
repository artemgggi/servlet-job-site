package com.job4you.store;

import com.job4you.model.Candidate;
import com.job4you.model.Post;
import com.job4you.model.User;
import java.util.Collection;

public interface Store {
    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    void savePost(Post post);

    Post findByNamePost(String name_of_new_post);

    void saveCandidate(Candidate candidate);

    Post findByIdPost(int id);

    Candidate findByIdCandidate(int id);

    Integer registerUser(String username, String email, String password);

    User validateUser(String email, String password);

    User findByEmail(String email);
}
