package io.github.farrukhjon.experiment.java.dp.structural.proxy;

/**
 * Proxy
 */
public class ProxyHeavyResourceLoader implements HeavyResourceLoader {

    private RealHeavyResourceLoader resourceLoader;

    @Override
    public void showResource() {
        resourceLoader = new RealHeavyResourceLoader();
        resourceLoader.showResource();
    }

}
