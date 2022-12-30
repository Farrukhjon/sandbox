/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package io.github.farrukhjon.experiment.spring.jersey.service;

import io.github.farrukhjon.experiment.spring.jersey.domain.Post;
import io.github.farrukhjon.experiment.spring.jersey.outbound.PostProvider;
import io.github.farrukhjon.experiment.spring.jersey.repository.PostRepository;

import java.util.List;
import java.util.Optional;

public class PostServiceImpl implements PostService {

    private final PostProvider postProvider;

    private final PostRepository repository;

    public PostServiceImpl(final PostProvider postProvider, final PostRepository repository) {
        this.postProvider = postProvider;
        this.repository = repository;
    }


    @Override
    public List<Post> getPosts() {
        List<Post> posts = postProvider.retrievePosts();
        repository.save(posts);
        return null;
    }

    @Override
    public Optional<Post> getPost(final long id) {
        Post postFromDB = repository.findOne(id);
        if (postFromDB != null) {
            return Optional.of(postFromDB);
        } else {
            Post savedPost = repository.save(postProvider.retrievePost(id));
            return Optional.of(savedPost);
        }
    }

}
