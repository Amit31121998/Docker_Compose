package in.amit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.amit.binding.User;
import in.amit.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo uRepo;
	
	public void saveUser(User user) {
		uRepo.save(user);
	}

}
