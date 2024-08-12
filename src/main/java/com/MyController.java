package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class MyController {

    @RequestMapping("/m")
    public static String myMethod() {
        return "<h1>shivani bhople</h1>";
    }

//      @GetMapping("/process-form")
//      public static String getData(@RequestParam int num1,@RequestParam int num2)
//      {
         
//         int result = num1 + num2;
        
//         return "result ="+result;
        

//      }
  @PostMapping("/process-form")
  public static String getData(@RequestParam int num1,@RequestParam int num2)
     {
         
        int result = num1 + num2;
              
        return "result ="+result;
        

  }
}


 
