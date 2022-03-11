package com.app.gamers.GamersRegistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.gamers.GamersRegistration.entity.GamerEntity;
import com.app.gamers.GamersRegistration.repository.GamerRepository;
import com.app.gamers.GamersRegistration.service.GamerRegistrationService;


@SpringBootTest
class GamersRegistrationApplicationTests {

	@Mock
	GamerRepository gamerRepository;

	@InjectMocks // auto inject 
	private GamerRegistrationService gamerService;

	
	@Test
	void testGamerFindAll() {
		Mockito.when(gamerRepository.findAll()).thenReturn(getListOfEntities());
		gamerService.searchGamer();
	}


	@Test
	void getMagerBasedOnId() {
		Optional<GamerEntity> checkNull = Optional.ofNullable(getListOfEntities().get(0));  

		Mockito.when(gamerRepository.findById(100)).thenReturn(checkNull);
		gamerService.searchGamer();
	}
	
	@Test
	void TestgetMageconvertEntity() {
		
		gamerService.convertFromEntity(getListOfEntities().get(0));
	}


	private List<GamerEntity> getListOfEntities(){

		List<GamerEntity> listOfEntities=new ArrayList<>();
		GamerEntity entity=new GamerEntity();
		entity.setId(100);
		listOfEntities.add(entity);
		GamerEntity entity1=new GamerEntity();
		entity1.setId(101);

		listOfEntities.add(entity1);

		GamerEntity entity2=new GamerEntity();
		entity2.setId(102);

		listOfEntities.add(entity2);


		return listOfEntities;
	}


}	
