package acme.study_guide.chapter4.lambdas;

public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}