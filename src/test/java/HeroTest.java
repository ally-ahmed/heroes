import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class HeroTest{
	@After
	public void tearDown(){
		Hero.clear();
	}
	
	Hero myHero = new Hero("buttman",34,"spots big butts","small butts");
	Hero firstHero = new Hero("buttman",34,"spots big butts","small butts");
	Hero secondHero = new Hero("captain underpants",34,"fashion","sandals with socks");
	
	
	
	@Test
	public void Heroes_instantiatesCorrectly_true(){
		assertEquals(true, myHero instanceof Hero);
	}
	
	@Test
	public void Hero_instantiatesWithProperties_String(){
		assertThat(myHero.getName(),is(equalTo("buttman")));
    assertThat(myHero.getAge(), is(equalTo(34)));
    assertThat(myHero.getPower(),is(equalTo("spots big butts")));
    assertThat(myHero.getWeakness(),is(equalTo("small butts")));
	}
	
	@Test
	public void all_returnsAllInstancesOfHero_true(){
		assertEquals(true, Hero.all().contains(firstHero));
		assertEquals(true, Hero.all().contains(secondHero));
	}
	@Test
	public void clear_emptiesAllHeroesFromArrayList_0() {
		Hero.clear();
		assertEquals(Hero.all().size(), 0);
  }

	
	
	@Test
	public void getId_tasksInstantiateWithAnId_1(){
		assertEquals(1, myHero.getId());
	}
	@Test
	public void find_returnsHeroWithSameId_secondHero(){
		assertEquals(Hero.find(secondHero.getId()),secondHero);
	}
	

	
}