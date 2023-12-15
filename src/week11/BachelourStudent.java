package week11;

public class BachelourStudent extends Student implements ProjectScoreBehavior{

    public BachelourStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    public float projetScore() {
        return 0;
    }

    @Override
    float computeTotalScore() {
        return 0;
    }

    @Override
    float computeBaseScore() {
        return 0;
    }
}
