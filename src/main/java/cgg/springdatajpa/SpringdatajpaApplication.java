package cgg.springdatajpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cgg.springdatajpa.dao.UserRepository;
import cgg.springdatajpa.entities.User1;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringdatajpaApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		//saving single object
//		User1 user = new User1();
//		
//		user.setName("Fathima");
//		user.setCity("Hyd");
//		user.setStatus("Iam a java programmer");
//		
//		User1 user1 = userRepo.save(user);
//		System.out.println(user1);
		
//		User1 user1 = new User1();
//		
//		user1.setName("Fariha");
//		user1.setCity("Hyd");
//		user1.setStatus("Iam a java programmer");
//		
//		User1 user2 = new User1();
//		
//		user2.setName("Sindhu");
//		user2.setCity("Hyd");
//		user2.setStatus("Iam a python programmer");
//		
//		List<User1> users = List.of(user1,user2);
		//save multiple objects
//		Iterable<User1> result = userRepo.saveAll(users);
//		result.forEach(System.out::println);
		
		//update the user of id 3
//		Optional<User1> optional = userRepo.findById(3);
//		User1 user = optional.get();
//		user.setCity("Chennai");
//		User1 result = userRepo.save(user);
//		System.out.println(result);
		
		//how to get the data
		//findById(id) - returns optional containing your data
//		Iterable<User1> users = userRepo.findAll();
//		users.forEach(System.out::println);
		
		//deleting the user element
//		userRepo.deleteById(3);
//		System.out.println("deleted...");
		
		//deleting all users
//		Iterable<User1> allUsers = userRepo.findAll();
//		allUsers.forEach(System.out::println);
//		userRepo.deleteAll(allUsers);
//		
//		List<User1> user = userRepo.findByName("fathima");
//		user.forEach(System.out::println);
		
//		List<User1> user = userRepo.findByNameAndCity("fathima","hyd");
//		user.forEach(System.out::println);
//		System.out.println("---------------------------------");
//		
//		List<User1> list = userRepo.findByStatusContaining("java");
//		list.forEach(System.out::println);
//		
//        System.out.println("---------------------------------");
//		
//		List<User1> list1 = userRepo.findByStatusLike("%prog%");
//		list1.forEach(System.out::println);
		
//		List<User1> allUsers = userRepo.getAllUsers();
//		allUsers.forEach(System.out::println);
//		
//		System.out.println("---------------------------------");
//		List<User1> list = userRepo.getUsersByName("xyz","delhi");
//		list.forEach(System.out::println);
		
//		List<User1> users = userRepo.getUsers();
//		users.forEach(System.out::println);
		
		List<User1> users = userRepo.getUsersByCity("hyd");
		users.forEach(System.out::println);
		
		
	}

}
