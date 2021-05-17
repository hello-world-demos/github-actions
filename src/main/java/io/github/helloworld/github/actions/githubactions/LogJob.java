package io.github.helloworld.github.actions.githubactions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: munan
 * @Date: 2021/5/17 6:45 下午
 */
@Slf4j
@Component
public class LogJob {


    @Scheduled(cron = "30 * * * * ?")
    public void log(){
        log.info("LogJob started");
        log.info("LogJob log now time:{}", System.nanoTime());
        log.info("LogJob ended");
    }

}
