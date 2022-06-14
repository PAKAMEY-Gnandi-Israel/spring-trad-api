package com.Digiket.Trad.cat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;

import com.Digiket.Trad.dto.CatDto;
import com.Digiket.Trad.repository.CatRepository;
import com.Digiket.Trad.repository.TradRepository;
import com.Digiket.Trad.service.CatService;

@DataJpaTest
public class CatServiceTest {
    @Mock private CatRepository catRepository;
 
    private CatService underTest;



    @Test
    void canGetAllStudents() {
        // when
    List  <CatDto> ca =   underTest.getAllCat();
    assertThat(ca).isNotNull();
        // then
    
    }

}
