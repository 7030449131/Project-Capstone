package com.Training.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Training.Model.Doctor;
import com.Training.Repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	DoctorRepository docRepo;
	
	@Override
	public Doctor findById(int id) {
		// TODO Auto-generated method stub
		return docRepo.findById(id).get();
	}

	@Override
	public List<Doctor> getAllDoctorInfo() {
		// TODO Auto-generated method stub
		return docRepo.findAll();
	}

	@Override
	public Doctor AddDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return docRepo.save(doctor);
	}

	@Override
	public void removeDoctorById(int id) {
		// TODO Auto-generated method stub
		docRepo.deleteById(id);
	}

	@Override
	public Doctor updateDoctorById(Doctor doctor, int id) {
		// TODO Auto-generated method stub
		Doctor toUpdate = docRepo.findById(id).get();
		toUpdate.setName(doctor.getName());
		toUpdate.setSlot(doctor.getSlot());
		toUpdate.setDepartment(doctor.getDepartment());
		
		return docRepo.save(toUpdate);
	}

	
	

}
