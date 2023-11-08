package in.amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amit.binding.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
