package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@SpringBootApplication
public class Lesson17HwApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Lesson17HwApplication.class, args);
		UniversityService service = ctx.getBean(UniversityService.class);

		University university1 = new University();
		University university2 = new University();
		University university3 = new University();
		University university4 = new University();
		University university5 = new University();

		university1.setName("name1");
		university1.setAcc_level((long) 5);
		university1.setAmountOfInstitutes((long) 7);
		university1.setAmountOfStudents((long) 44131425);
		university1.setAddress("address1");

		university2.setName("name2");
		university2.setAcc_level((long) 3);
		university2.setAmountOfInstitutes((long) 6);
		university2.setAmountOfStudents((long) 25335);
		university2.setAddress("address2");

		university3.setName("name3");
		university3.setAcc_level((long) 1);
		university3.setAmountOfInstitutes((long) 4);
		university3.setAmountOfStudents((long) 12223);
		university3.setAddress("address3");

		university4.setName("name4");
		university4.setAcc_level((long) 3);
		university4.setAmountOfInstitutes((long) 8);
		university4.setAmountOfStudents((long) 33333);
		university4.setAddress("address4");

		university5.setName("name5");
		university5.setAcc_level((long) 2);
		university5.setAmountOfInstitutes((long) 5);
		university5.setAmountOfStudents((long) 22222);
		university5.setAddress("address5");

		service.save(university1);
		service.save(university2);
		service.save(university3);
		service.save(university4);
		service.save(university5);

		System.out.println(service.findById((long) 3));
		service.findAll().stream().forEach(System.out::println);
		University forUpdate = service.findById((long) 5);
		forUpdate.setAddress("Lviv");
		service.update(forUpdate);

		service.deleteById((long) 3);
	}

}
