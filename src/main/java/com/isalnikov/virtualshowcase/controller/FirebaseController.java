
package com.isalnikov.virtualshowcase.controller;
import javax.annotation.Resource;
import com.isalnikov.virtualshowcase.service.FirebaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/user")
public class FirebaseController {

  @Resource
  private FirebaseService firebaseService;

  /**
   * This method is used to create notification in Jane Doe's Screen.
   */
  @RequestMapping(value = "/create-notification-for-john-doe/", method = RequestMethod.POST)
  @ResponseBody
  public void createNotificationForJaneDoe() {
    firebaseService.pushNotificationtoJaneDoe();
  }

  /**
   * This method is used to create notification in John Doe's Screen.
   */
  @RequestMapping(value = "/create-notification-for-jane-doe/", method = RequestMethod.POST)
  @ResponseBody
  public void createNotificationForJohnDoe() {
    firebaseService.pushNotificationtoJohnDoe();
  }
}