package IOStreamStudy;

public class Demo18_P_StudentClass {
    String name;
    float chineseS;
    float mathS;
    float englishS;

    public Demo18_P_StudentClass() {
    }

    public Demo18_P_StudentClass(String name, float chineseS, float mathS, float englishS) {
        this.name = name;
        this.chineseS = chineseS;
        this.mathS = mathS;
        this.englishS = englishS;
    }

    public String getName() {
        return name;
    }

    public float getChineseS() {
        return chineseS;
    }

    public float getMathS() {
        return mathS;
    }

    public float getEnglishS() {
        return englishS;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChineseS(float chineseS) {
        this.chineseS = chineseS;
    }

    public void setMathS(float mathS) {
        this.mathS = mathS;
    }

    public void setEnglishS(float englishS) {
        this.englishS = englishS;
    }

    public float sumSores(){
        float sumSores = this.chineseS + this.englishS + this.mathS;
        return sumSores;
    }
}
