package com.csc.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csc.services.CityService;
import com.csc.services.CommanService;
import com.csc.services.CountryService;
import com.csc.services.PincodeService;
import com.csc.services.StateService;
import com.google.gson.Gson;
import com.csc.entity.City;
import com.csc.entity.Country;

@Controller
@RequestMapping("/")
public class ApiController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @Autowired
    private CityService cityService;
    
//    @Autowired
//    private PincodeService pincodeService;
    
    @Autowired
    private CommanService commanService;
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
  
        Gson gson = new Gson();
        return gson.toJson( countryService.findAll());
    }
    
//    @RequestMapping(value = "country/{id}", method = RequestMethod.GET)
//    public @ResponseBody String Country(@PathVariable("id") int id) {
//        Gson gson = new Gson();
//        return gson.toJson(countryService.find(id));
//    }
////    
//    @GetMapping("/country/{id}")
// 		public ResponseEntity <Country> findById(@RequestBody @PathVariable Integer country_id){
// 		//Optional<Country> blogRecentPage = countryService.find(country_id);
// 		//return ResponseEntity.ok(countryService.findAll());
// 			 
// 		}
    
//    @RequestMapping(value = "country/{id}", method = RequestMethod.GET)
//    public @ResponseBody String Country(@PathVariable("id") int id) {
//		//return ResponseEntity.ok(countryService.findAll());
//    	
//    	Gson gson = new Gson();
//        return gson.toJson(countryService.findAll());
//    	//return null;
//	}
//   
    @RequestMapping(value = "statebycountry/{id}", method = RequestMethod.GET)
    public @ResponseBody String statesByCountry(@PathVariable("id") int id) {
        Gson gson = new Gson();
        return gson.toJson(stateService.findByCountry(id));
    }
    
//    @RequestMapping(value = "state", method = RequestMethod.GET)
//    public @ResponseBody String states(@PathVariable("id") int id) {
//        Gson gson = new Gson();
//        return gson.toJson(stateService.findAll());
//    }
    
    
    @ResponseBody
    @RequestMapping(value = "citybystate/{id}", method = RequestMethod.GET)
    public String citiesByState(@PathVariable("id") int id) {
        Gson gson = new Gson();
        //City city =  cityService.findByState(id);
        return gson.toJson(cityService.findByState(id));
    }
//    
//    @ResponseBody
//    @RequestMapping (value = "pincodebycity/{id}", method = RequestMethod.GET)
//    public String pincodeBycity(@PathVariable("id") int id) {
//        Gson gson = new Gson();
//        return gson.toJson(pincodeService.findByCityy(id));
//    }
    
    
    @ResponseBody
    @RequestMapping(value = "comman/{id}", method = RequestMethod.GET)
    public String comman(@PathVariable("id") int id) {
        Gson gson = new Gson();
        return gson.toJson(commanService.findByComman(id));
    }

}