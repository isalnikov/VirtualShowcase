
package com.isalnikov.virtualshowcase.service;

import com.isalnikov.virtualshowcase.util.DateUtil;
import com.isalnikov.virtualshowcase.util.FirebaseUtil;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;



@Service
public class FirebaseService {

  private static final String FIREBASE_URL = "your-firebase-url-comes-here";

  private static final String NOTIFICATIONS = "/notifications/";

  private static final String FIRST_USER = "john-doe";

  private static final String SECOND_USER = "jane-doe";


  public void pushNotificationtoJaneDoe() {
    Map<String, Object> data = new LinkedHashMap<>();

    data.put("firstName", "John");
    data.put("lastName", "Doe");
    data.put("description", "has sent you friend request!");
    data.put("read", "false");
    data.put("imgSrc", "../../img/john.jpg");
    data.put("date", DateUtil.now().getTime());
    String url = FIREBASE_URL + NOTIFICATIONS + FIRST_USER;
    FirebaseUtil.writeToList(url, data);
  }

  public void pushNotificationtoJohnDoe() {
    Map<String, Object> data = new LinkedHashMap<>();

    data.put("firstName", "Jane");
    data.put("lastName", "Doe");
    data.put("description", "has sent you friend request!");
    data.put("read", "false");
    data.put("imgSrc", "../../img/jane.jpg");
    data.put("date", DateUtil.now().getTime());
    String url = FIREBASE_URL + NOTIFICATIONS + SECOND_USER;
    FirebaseUtil.writeToList(url, data);
  }
}