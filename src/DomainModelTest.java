//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class DomainModelTest {
//
//    @Test
//    void testHumanOpinion() {
//        Human human = new Human();
//        assertTrue(human.getInventions().contains("колесо"));
//        assertEquals("разумнее дельфинов", human.getOpinion());
//    }
//
//    @Test
//    void testDolphinOpinion() {
//        Dolphin dolphin = new Dolphin();
//        assertEquals("разумнее людей", dolphin.getOpinion());
//    }
//
//    @Test
//    void testOpinionChange() {
//        Human human = new Human();
//        human.updateOpinion(); // Метод, меняющий мнение, если изобретений нет
//        assertNotEquals("дельфины разумнее", human.getOpinion()); // Изобретения есть → мнение не меняется
//    }
//}