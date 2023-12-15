package week11;

public class PhDStudent extends MasterStudent implements ArticleScoreBehavior{
    private int numberOfArticle;

    public PhDStudent(int id, float mid, float fin, int conf, int numberOfArticle) {
        super(id, mid, fin, conf);
        this.numberOfArticle = numberOfArticle;
    }

    @Override
    public float articleScore() {
        return numberOfArticle * 8;
    }

    @Override
    float computeTotalScore() {
        return super.computeBaseScore() + articleScore();
    }
}
