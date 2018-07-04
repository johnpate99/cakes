package com.cakeregistry.cake;

import com.cakeregistry.cake.controllers.CakeController;
import com.cakeregistry.cake.model.Cake;
import com.cakeregistry.cake.repositories.CakeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CakeApplicationTests {
    @InjectMocks
    private CakeController cakeController;

    @Mock
    private CakeRepository cakeRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGetAllCakes() {
        List<Cake> cakes = new ArrayList<>();
        Cake cake = new Cake();
        cake.setId(1L);
        cake.setDesc("cheesecake");
        cake.setImage("www.google.com");
        cakes.add(cake);
        when(cakeRepository.findAll()).thenReturn(cakes);
        List<Cake> controllerCakes = cakeController.list();
        verify(cakeRepository).findAll();
        assertEquals(1, controllerCakes.size());

    }

    @Test
    public void testCreateCake() {

        Cake cake = new Cake();
        cake.setId(1L);
        cake.setDesc("cheesecake");
        cake.setImage("www.google.com");
        when(cakeRepository.save(cake)).thenReturn(cake);
        cakeController.create(cake);
        verify(cakeRepository).save(cake);

    }


}
