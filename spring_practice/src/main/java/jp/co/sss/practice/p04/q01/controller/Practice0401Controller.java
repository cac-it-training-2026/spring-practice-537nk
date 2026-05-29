package jp.co.sss.practice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p04.q01.form.BmiForm;

@Controller
public class Practice0401Controller {
	@RequestMapping(path = "/bmi/input", method = RequestMethod.GET)
	public String bmi_input() {
		return "practice04/01/bmi_input";
	}

	@RequestMapping(path = "/bmi/result", method = RequestMethod.POST)
	public String bmi_result(BmiForm bmiForm, Model model) {

		double heightM = bmiForm.getHeight() / 100;
		double bmi = bmiForm.getWeight() / (heightM * heightM);
		bmiForm.setBmi(bmi);
		model.addAttribute("bmi", bmiForm.getBmi());
		return "practice04/01/bmi_result";
	}
}
