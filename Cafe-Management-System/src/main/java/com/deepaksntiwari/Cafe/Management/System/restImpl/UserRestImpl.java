package com.deepaksntiwari.Cafe.Management.System.restImpl;

import com.deepaksntiwari.Cafe.Management.System.constants.CafeConstants;
import com.deepaksntiwari.Cafe.Management.System.rest.UserRest;
import com.deepaksntiwari.Cafe.Management.System.service.UserService;
import com.deepaksntiwari.Cafe.Management.System.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try{
            return userService.signUp(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }
return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
