package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student.model.StudentRegistration;
import com.student.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("Home");
	}

	@RequestMapping("/addStudent")
	public ModelAndView addStudent() {
		return new ModelAndView("addStudent");
	}

	@RequestMapping("/addStud")
	public ModelAndView addStudent(StudentRegistration studentRegistration) {
		ModelAndView modelAndView = new ModelAndView("addStudent");
		String alertScript = "<script src='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js'></script>";

		Optional<StudentRegistration> existingStudent = studentRepository.findById(studentRegistration.getSno());

		if (existingStudent.isPresent()) {
			alertScript += "<script>swal('User Already Exists');</script>";
		} else {
			studentRepository.save(studentRegistration);
			alertScript += "<script>swal('Registration Successful');</script>";
		}

		modelAndView.addObject("alertScript", alertScript);
		return modelAndView;
	}

	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent() {
		return new ModelAndView("deleteStudent");
	}

	@RequestMapping("/delStud")
	public ModelAndView deleteStudent(int studNo) {
		ModelAndView modelAndView = new ModelAndView("deleteStudent");
		String alertScript = "<script src='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js'></script>";

		Optional<StudentRegistration> student = studentRepository.findById(studNo);

		if (student.isPresent()) {
			studentRepository.deleteById(studNo);
			alertScript += "<script>swal('Record Deleted Successfully');</script>";
		} else {
			alertScript += "<script>swal('Sorry, Record Not Found');</script>";
		}

		modelAndView.addObject("alertScript", alertScript);
		return modelAndView;
	}

	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent() {
		return new ModelAndView("searchStudent");
	}

	@RequestMapping("/searStud")
	public ModelAndView searchStudent(int studNo) {
		ModelAndView modelAndView = new ModelAndView("searchStudent");
		String alertScript = "<script></script>";

		Optional<StudentRegistration> student = studentRepository.findById(studNo);

		if (student.isPresent()) {
			return showUpdateView(student.get());
		} else {
			alertScript += "<script>swal('Sorry, Record Not Found');</script>";
			modelAndView.addObject("alertScript", alertScript);
		}

		return modelAndView;
	}

	@RequestMapping("/updateView")
	public ModelAndView showUpdateView(StudentRegistration student) {
		ModelAndView modelAndView = new ModelAndView("updateStudent");

		modelAndView.addObject("Sno", student.getSno());
		modelAndView.addObject("Sname", student.getName());
		modelAndView.addObject("Smob", student.getStudMobile());
		modelAndView.addObject("Course", student.getStudCourse());
		modelAndView.addObject("SDOB", student.getDob());
		modelAndView.addObject("SDOJ", student.getDoj());
		modelAndView.addObject("Semail", student.getEmail());
		modelAndView.addObject("Stime", student.getStudTime());
		modelAndView.addObject("Strainer", student.getStudTrainer());

		return modelAndView;
	}

	@RequestMapping("/updateStud")
	public ModelAndView updateStudentDetails(StudentRegistration studentRegistration) {
		ModelAndView modelAndView = new ModelAndView("updateStudent");

		String alertScript = "<script src='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js'></script>";

		StudentRegistration updatedStudent = new StudentRegistration();
		updatedStudent.setStudNo(studentRegistration.getSno());
		updatedStudent.setStudName(studentRegistration.getName());
		updatedStudent.setStudCourse(studentRegistration.getStudCourse());
		updatedStudent.setStudMobile(studentRegistration.getStudMobile());
		updatedStudent.setStudDOB(studentRegistration.getDob());
		updatedStudent.setStudDOJ(studentRegistration.getDoj());
		updatedStudent.setStudEmail(studentRegistration.getEmail());
		updatedStudent.setStudTime(studentRegistration.getStudTime());
		updatedStudent.setStudTrainer(studentRegistration.getStudTrainer());

		studentRepository.save(updatedStudent);

		alertScript += "<script>swal('Record Updated Successfully');</script>";

		modelAndView.addObject("alertScript", alertScript);
		modelAndView.setViewName("searchStudent");

		return modelAndView;
	}

	@RequestMapping("/viewAllStudent")
	public ModelAndView viewAllStudents(StudentRegistration studentRegistration) {
		ModelAndView modelAndView = new ModelAndView("updateStudent");

		String alertScript = "<script src='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js'></script>";

		Optional<StudentRegistration> existingStudentOpt = studentRepository.findById(studentRegistration.getSno());

		if (existingStudentOpt.isPresent()) {
			StudentRegistration existingStudent = existingStudentOpt.get();

			// Update fields
			existingStudent.setStudName(studentRegistration.getName());
			existingStudent.setStudMobile(studentRegistration.getStudMobile());  // Update mobile number
			existingStudent.setStudCourse(studentRegistration.getStudCourse());
			existingStudent.setStudDOB(studentRegistration.getDob());
			existingStudent.setStudDOJ(studentRegistration.getDoj());
			existingStudent.setStudEmail(studentRegistration.getEmail());
			existingStudent.setStudTime(studentRegistration.getStudTime());
			existingStudent.setStudTrainer(studentRegistration.getStudTrainer());

			// Save the updated student
			studentRepository.save(existingStudent);

			alertScript += "<script>swal('Record Updated Successfully');</script>";
		} else {
			alertScript += "<script>swal('Student Not Found');</script>";
		}

		modelAndView.addObject("alertScript", alertScript);
		return modelAndView;
	}
}
