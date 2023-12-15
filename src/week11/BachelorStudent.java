package week11;

public class BachelorStudent extends Student implements ProjectScoreBehavior{

    public BachelorStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    public float projetScore() {
        return 20;
    }

    @Override
    float computeTotalScore() {
        return computeBaseScore() + projetScore();
    }

}
