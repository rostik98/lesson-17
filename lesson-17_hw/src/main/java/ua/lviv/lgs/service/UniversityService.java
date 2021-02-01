package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.University;

public interface UniversityService {
	University save(University university);

	University findById(Long id);

	University update(University university);

	void deleteById(Long id);

	List<University> findAll();

}
