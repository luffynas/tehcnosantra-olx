package com.olxsample.technosantraolx;

import com.olxsample.technosantraolx.entity.*;
import com.olxsample.technosantraolx.service.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TechnosantraOlxApplicationTests extends TestCase {

	@Autowired
	private UserService userService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private ProvinceService provinceService;
	@Autowired
	private CityService cityService;
	@Autowired
	private DistrictService districtService;
	@Autowired
	private VillageService villageService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testLoadAndSaveUser(){
//		User user = new User();
//		user.setId(1L);
//		user.setName("Dheni");
//		user.setEmail("dheni@gmail.com");
//		user.setPassword("123123");
//		userService.save(user);
//
//		List<User> users = userService.findAll();
//		System.out.println("size =>> "+users.size());
//		assertEquals("Sukses", users.size(), 1);

	}

	@Test
	public void testLoadCountry(){
		Country country = countryService.find(1).get();
		System.out.println("Country is =>> "+country.getCountryName());

		for (Province province : country.getProvinces()){
			System.out.println("Province is =>> "+province.getName());
		}
	}

	@Test
	public void testLoadProvince(){
		List<Province> provinces = provinceService.findAll();
		for (Province province : provinces){
			System.out.println("Country is =>> "+province.getCountry().getCountryName());
			System.out.println("Province is =>> "+province.getName());
			for (City city : province.getCities()){
				System.out.println("City is =>> "+city.getName());
			}
		}
	}

	@Test
	public void testLoadCity(){
		List<City> cities = cityService.findAll();
		System.out.println(cities.get(0).getProvince().getName());
	}

	@Test
	public void testLoadDistric(){
		List<District> districts = districtService.findAll();
		for (District district : districts){
			System.out.println("City is =>> "+district.getCity().getName());
			System.out.println("District is =>> "+district.getName());
		}
	}

	@Test
	public void testLoadVillage(){
		List<Village> villages = villageService.findAll();
		for (Village village : villages){
			System.out.println("District is =>> "+village.getDistrict().getName());
			System.out.println("Village is =>> "+village.getName());
		}
	}

}

