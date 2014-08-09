package org.javamexico.eldermael.test.executors;

import com.google.common.util.concurrent.MoreExecutors;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;

public class ExecutorTestCase {

    private static final Logger log = LoggerFactory.getLogger(ExecutorTestCase.class);

    @Test
    public void shouldSayHelloOnExecutor() {
        // given
        ExecutorService executorService = MoreExecutors.sameThreadExecutor();

        // when
        executorService.submit(() -> log.info("Hello, World!"));

        // then expect all OK
        log.info("All OK");
    }
}
