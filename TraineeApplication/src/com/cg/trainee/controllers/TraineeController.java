package com.cg.trainee.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.trainee.entities.Trainee;
import com.cg.trainee.exceptions.TraineeException;
import com.cg.trainee.services.TraineeService;



@Controller
public class TraineeController {

	@Resource
	private TraineeService service;
	
	
	//Home page
	@RequestMapping("/getHomePage.do")
	public ModelAndView getHomePage() {
		ModelAndView mAndV = new ModelAndView("HomePage");	
		return mAndV;
	}
	
	@RequestMapping("/getEntryPage.do")
	public ModelAndView getEntryPage() {
		ModelAndView mAndV = new ModelAndView("EntryPage");
		Trainee trainee = new Trainee();   // command object
		mAndV.addObject("Trainee",trainee);
		return mAndV;
	}
	
	//Insert
	@RequestMapping(value="/submitTraineeDetails.do", method=RequestMethod.POST)
	public String submitTraineeDetails(@ModelAttribute("Trainee") Trainee trainee, Model mAndV) throws TraineeException{  //request.getparamerter 
		System.out.println("here is"+trainee);
		service.insertTrainee(trainee);
		
		mAndV.addAttribute("Trainee", trainee);		
		return "Success";
	}
	
	
	
	@RequestMapping("/getDeletePage.do")
	public ModelAndView getDeletePage() {
		ModelAndView mAndV = new ModelAndView("DeletePage");
		return mAndV;
	}
	
	@RequestMapping("/getTraineeDel.do")
	public ModelAndView getTraineeDel(@RequestParam("traineeId")  int traineeID) throws TraineeException{  //request.getparamerter 
		Trainee trainee = service.getTrainee(traineeID);
		
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("trainee", trainee);
		
		mAndV.setViewName("DeletePage");  // view resolver will take extension and path automatically
		return mAndV;
	}
	
	@RequestMapping("/getDelete.do")
	public ModelAndView getDelete(@RequestParam("traineeId")  int traineeID) throws TraineeException{  //request.getparamerter 
		System.out.println(traineeID);
		service.deleteTrainee(traineeID);		
		ModelAndView mAndV = new ModelAndView();		
		mAndV.setViewName("Deleted");  // view resolver will take extension and path automatically
		return mAndV;
	}
		
	
	
	@RequestMapping("/getTraineeByID.do")
	public ModelAndView getTraineeByID() {
		ModelAndView mAndV = new ModelAndView("TraineeSingle");
		return mAndV;
	}	
		
	@RequestMapping("/getTraineeDetails.do")
	public ModelAndView getTraineeDetails(@RequestParam("traineeId")  int traineeID) throws TraineeException{  //request.getparamerter 
		Trainee trainee = service.getTrainee(traineeID);
		
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("trainee", trainee);
		
		mAndV.setViewName("TraineeSingle");  // view resolver will take extension and path automatically
		return mAndV;
	}
	
	
	@RequestMapping("/getAllTrainees.do")
	public ModelAndView getEmpList() throws TraineeException {
		List<Trainee> traineeList = service.getAllTrainees();
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("traineeList", traineeList);		
		mAndV.setViewName("TraineeList");  // view resolver will take extension and path automatically
		return mAndV;
	}
	
	
	@RequestMapping("getModify.do")
	public ModelAndView getModify() {
		ModelAndView mAndV = new ModelAndView("ModifyPage");
		return mAndV;
	}
	
	
	@RequestMapping("/getModifyDetail.do")
	public ModelAndView getModifyDetail(@RequestParam("traineeId")  int traineeID) throws TraineeException{  //request.getparamerter 
		Trainee trainee = service.getTrainee(traineeID);
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("trainee", trainee);	
		mAndV.setViewName("ModifyPage");  // view resolver will take extension and path automatically
		return mAndV;
	}
		
	@RequestMapping("/getUpdate.do")
	public ModelAndView getUpdate(@RequestParam("traineeID")  int traineeID,
			@RequestParam("traineeName")  String traineeName,
			@RequestParam("traineeDomain")  String traineeDomain,
			@RequestParam("traineeLocation")  String traineeLocation) throws TraineeException{  
		System.out.println(traineeID);
		service.modifyTrainee(traineeID, traineeName, traineeDomain, traineeLocation);
		ModelAndView mAndV = new ModelAndView();		
		mAndV.setViewName("Updated");  // view resolver will take extension and path automatically
		return mAndV;
	}
	
		
}
