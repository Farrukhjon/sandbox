

package io.github.farrukhjon.experiment.java.java.concurrency;

/**
 * Thread Safe Singleton DP by Double Checked Lock.
 */
public class SingletonThreadSafe {

    /**
     * The volatile keyword must be applied.
     */
    private static volatile SingletonThreadSafe _instance;

    public static SingletonThreadSafe getInstance() {
        if (_instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (_instance == null) {
                    _instance = new SingletonThreadSafe();
                }
            }
        }
        return _instance;
    }

}
