package com.maketext.restcontrollers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maketext.DAO.UserDetailDAO;
import com.maketext.model.UserDetail;
@RestController
public class UserController {
	@Autowired

	private UserDetailDAO userDetailDao;

	@RequestMapping(value="/registerUser",method=RequestMethod.POST)

	public ResponseEntity<?> registerUser(@RequestBody UserDetail userdetail){

		if(!userDetailDao.registerUser(userdetail))

		{

			//ErrorClazz error= new ErrorClazz(1,"Email already exist");

			return new ResponseEntity<String>("Successfully registered ",HttpStatus.OK);

		}

		else{

			return new ResponseEntity<String>("problem in regitering", HttpStatus.UNAUTHORIZED);

		}

		}

		

	@RequestMapping(value="/checkLogin",method=RequestMethod.POST)

	public ResponseEntity<?>login(@RequestBody UserDetail userDetail,HttpSession session){

		if(userDetailDao.checkCredential(userDetail)){

			//ErrorClazz error=new ErrorClazz(5,"Login Failed Invalid Email Id or Password" );

			UserDetail tempUser=userDetailDao.getUser(userDetail.getLoginname());

			session.setAttribute("userDetail",tempUser);

			return new ResponseEntity<UserDetail>(tempUser, HttpStatus.OK);

		}

		else

			{ 

			return new ResponseEntity<UserDetail>(userDetail,HttpStatus.UNAUTHORIZED);

		}

	}
}
