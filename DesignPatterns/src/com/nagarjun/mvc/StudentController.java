package com.nagarjun.mvc;

public class StudentController {

	private StudentModel model;
	private StudentView view;
	
	public StudentController(StudentModel model , StudentView view){
		this.model=model;
		this.view=view;
	}
	public StudentModel getModel() {
		return model;
	}
	public void setModel(StudentModel model) {
		this.model = model;
	}
	public StudentView getView() {
		return view;
	}
	public void setView(StudentView view) {
		this.view = view;
	}
	
	public void updateView(){
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
