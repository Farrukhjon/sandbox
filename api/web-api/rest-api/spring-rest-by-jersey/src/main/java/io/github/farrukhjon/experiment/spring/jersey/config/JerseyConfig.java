/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package io.github.farrukhjon.experiment.spring.jersey.config;

import io.github.farrukhjon.experiment.spring.jersey.exception.PostNotFoundExceptionMapper;
import io.github.farrukhjon.experiment.spring.jersey.inbound.PostController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(PostController.class);
        register(PostNotFoundExceptionMapper.class);
    }

}
