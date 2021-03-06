package cn.van.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 日志控制器
 *
 * @author Van
 * @since 2019.2.26
 */
@RestController
@RequestMapping("/aop")
public class LogbackController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/{msg}")
    public String getMsg(@PathVariable String msg) {
        return "request msg : " + msg;
    }

    @GetMapping("/ex")
    public String getExcation() throws Exception {

        throw new Exception("sd");

    }
}
