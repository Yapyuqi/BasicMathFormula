package sg.edu.rp.c346.basicmathformula;

public class MathList {
    private String name;
    private String formula;
    private String code;



    public MathList(String name, String formula, String code) {
        this.name = name;
        this.formula = formula;
        this.code = code;

    }
    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;

    }

    @Override
    public String toString() {
        return "MathList{" +
                "name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}