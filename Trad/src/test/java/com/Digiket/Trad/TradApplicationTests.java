package com.Digiket.Trad;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import com.Digiket.Trad.dto.CatDto;
import com.Digiket.Trad.dto.TradDto;
import com.Digiket.Trad.service.CatService;
import com.Digiket.Trad.service.TradService;
@SpringBootTest
class TradApplicationTests {

	@Autowired
	TradService tradService;

	@Autowired
	CatService catService;

	@Test
	void contextLoads() {
	}
    @Test
	public void testgetTradByCat() {
		List<TradDto>  list = tradService.getAllExp(2L);
		assertThat(list).size().isGreaterThan(0);
	}
    @Test
	public void testgetAllCat() {
		List <CatDto> list = catService.getAllCat();
		assertThat(list).size().isGreaterThan(0);

	}
}
