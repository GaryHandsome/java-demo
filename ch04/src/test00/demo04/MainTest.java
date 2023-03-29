package test00.demo04;

/**
 * @Date 2023-03-29
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Lion lion = new Lion() ;
        GeZi geZi = new GeZi() ;
        ShaYu shaYu = new ShaYu() ;

        SiYangYuan fasy = new FeiQinAnimalSiYangYuan();

        fasy.weiYang(geZi);
        fasy.tiJiang(geZi);
        fasy.xunCha(geZi);


    }
}
