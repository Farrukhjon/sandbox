/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package io.github.farrukhjon.experiment.spring.jersey.outbound;

import io.github.farrukhjon.experiment.spring.jersey.domain.Post;
import io.github.farrukhjon.experiment.spring.jersey.exception.PostNotFoundException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestOperations;

import javax.ws.rs.WebApplicationException;
import java.net.URI;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

public class PostProviderImpl implements PostProvider {

    private static final String RESOURCE_PATH = "http://jsonplaceholder.typicode.com/posts";
    private static final String GOOGLE_BOT = "Googlebot/2.1 (+http://www.google.com/bot.html)";

    private final RestOperations restTemplate;


    public PostProviderImpl(final RestOperations restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Post> retrievePosts() {
        URI uri = URI.create(RESOURCE_PATH);
        RequestEntity<Void> request = RequestEntity.get(uri)
                                                   .accept(APPLICATION_JSON)
                                                   .header("User-Agent", GOOGLE_BOT)
                                                   .build();
        return restTemplate.exchange(request, new ParameterizedTypeReference<List<Post>>() {
        }).getBody();
    }

    @Override
    public Post retrievePost(final long id) {
        URI uri = URI.create(RESOURCE_PATH + "/" + id);
        RequestEntity<Void> request = RequestEntity.get(uri)
                                                   .accept(APPLICATION_JSON)
                                                   .header("User-Agent", GOOGLE_BOT)
                                                   .build();
        try {
            return restTemplate.exchange(request, Post.class).getBody();
        } catch (RestClientException restError) {
            if (restError instanceof HttpClientErrorException) {
                HttpClientErrorException clientError = ((HttpClientErrorException) restError);
                if (clientError.getStatusCode() == HttpStatus.NOT_FOUND) {
                    throw new PostNotFoundException(id);
                }
            }
            throw new WebApplicationException(restError.getCause());
        }
    }

}
