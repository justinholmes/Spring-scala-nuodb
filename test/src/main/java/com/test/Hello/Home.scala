package com.test.Hello

import org.springframework.web.bind.annotation.{RequestMethod, RequestMapping}
import org.springframework.stereotype.Controller
import java.lang.String
import org.springframework.ui.ModelMap
import org.slf4j.LoggerFactory

/**
 * Created with IntelliJ IDEA.
 * User: Justin
 * Date: 25/05/13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(Array("/hello"))
class Home {
  private val logger = LoggerFactory.getLogger(this.getClass)
  @RequestMapping(method = Array(RequestMethod.GET)) def printWelcome(model: ModelMap): String = {
    model.addAttribute("message", "Hello world!")
    logger.info("hello")
    return "hello"
  }
}