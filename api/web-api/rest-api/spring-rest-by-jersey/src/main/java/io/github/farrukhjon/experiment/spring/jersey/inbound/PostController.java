/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package io.github.farrukhjon.experiment.spring.jersey.inbound;

import io.github.farrukhjon.experiment.spring.jersey.domain.Post;
import io.github.farrukhjon.experiment.spring.jersey.exception.PostNotFoundException;
import io.github.farrukhjon.experiment.spring.jersey.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/posts")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(final PostService postService) {
        this.postService = postService;
    }

    @GET
    @Path("/{postId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<Post> getPostById(@PathParam("postId") final long postId) {
        Post post = postService.getPost(postId)
                               .orElseThrow(() -> new PostNotFoundException(postId));
        return ResponseEntity.status(HttpStatus.OK)
                             .contentType(org.springframework.http.MediaType.APPLICATION_JSON)
                             .body(post);
    }


}
