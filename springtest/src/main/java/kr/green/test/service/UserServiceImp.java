package kr.green.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.test.dao.UserDao;
import kr.green.test.vo.UserVo;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public String getEmail(String id) {
		UserVo user = userDao.getUser(id);
		//id와 일치하는 회원정보가 없으면
		if(user == null) {
			return null;
		}
		//id와 일치하는 회원이 있으면
		return user.getEmail();
	}

	@Override
	public UserVo getUser(String id) {
		UserVo user = userDao.getUser(id);
		return user;
	}

	@Override
	public boolean isUser(String id, String pw) {
		UserVo user = userDao.getUser(id);
		//id와 일치하는 회원정보가 없으면
		if(user == null) {
			return false; //회원 아님.
		}
		//id와 일치하는 회원정보가 있다는 의미.
		// 비밀번호와 비교하여 확인.
		if(user.getPw().equals(pw)) {
			
			return true; //회원
		}
		return false; //비밀변호가 다른 경우 회원 아님.
	}

	@Override
	public boolean signup(UserVo user) {
		UserVo tmp = userDao.getUser(user.getId());
		//이미 가입된 회원이면 회원가입 진행 불가
		if(tmp != null) {
			return false;
		}
		//가입된 회원이 아니면 회원 가입을 진행
		
			userDao.insertUser(user);
			return true;
		
	}

	

	
}
