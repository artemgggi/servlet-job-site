package com.job4you.store;

import com.job4you.model.Candidate;
import com.job4you.model.Post;

public class MainStore {
    public static void main(String[] args) {
        Store store = DbStore.instOf();
        store.savePost(new Post(1, "Java Trainee Job"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        System.out.println(store.findByIdPost(3));
        
        store.saveCandidate(new Candidate(0, "Ivan Ivanov"));
        for (Candidate candidate : store.findAllCandidates()) {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }
    }
}