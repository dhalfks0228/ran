package kr.green.test.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.test.dao.UserDao;
import kr.green.test.vo.UserVo;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserDao userDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

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
	public UserVo isUser(String id, String pw) {
		UserVo user = userDao.getUser(id);
		//id와 일치하는 회원정보가 없으면
		if(user == null) {
			return null; //회원 아님.
		}
		//id와 일치하는 회원정보가 있다는 의미.
		// 비밀번호와 비교하여 확인.
		////matches(원래 비번, 암호화된 비번)
		if(passwordEncoder.matches(pw, user.getPw())) {
			return user; //회원
		}
		return null; //비밀변호가 다른 경우 회원 아님.
	}

	@Override
	public boolean signup(UserVo user) {
		UserVo tmp = userDao.getUser(user.getId());
		//이미 가입된 회원이면 회원가입 진행 불가
		if(tmp != null) {
			return false;
		}
		//가입된 회원이 아니면 회원 가입을 진행
		//=> 가져온 회원정보가 비어있으면(null) 가입되지 않은 아이디 => 가입 가능
		// 굳이 else를 쓰지 않아도 처리됨. 
		
		// 아이디가 중복되지 않았으면 회원가입을 하고, 성공을 알림
		// 회원정보의 유효성 검사를 하여 유효성 검사에 맞지 않으면 실패를 알림
		// 아이디 유효성 검사 : 아이디가 입력 안되면 회원가입 불가능.
		if(user.getId() == null || user.getId().length() == 0) {
			return false;
		}
		// 비밀번호 유효성 검사 : 비밀번호가 입력 안되면 회원가입 불가능
		if(user.getPw() == null || user.getPw().length() == 0) {
			return false;
		}
		//비밀번호 암호화 과정
		//입력받은 비밀번호
		String pw = user.getPw();
		//입력받은 비밀번호 암호화
		String encodePw = passwordEncoder.encode(pw);
		//회원 비밀번호를 암화화된 비밀번호로 수정
		user.setPw(encodePw);
		// 회원가입 => user테이블에 회원 정보를 추가(insert)
			userDao.insertUser(user);
			return true;
		
	}
	@Override
	public UserVo getUser(HttpServletRequest request) {
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return user;
	}
	

	
}
