package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.ModelException;

/**
 *
 * @author Carlos
 */
public abstract class Model {

    protected String referencia;
    protected String marca;
    protected String model;
    protected String tipus;
    protected double manega;
    protected double eslora;
    protected double calat;
    protected double preu;

    public Model(String referencia, String marca, String model, double manega, double eslora, double calat, double preu) throws ModelException {
        if (referencia.equals("")) {
            throw new ModelException();
        } else if (marca.equals("")) {
            throw new ModelException();
        } else if (model.equals("")) {
            throw new ModelException();
        } else if (manega < 1 || manega > 300) {
            throw new ModelException();
        } else if (eslora < 1 || eslora > 300) {
            throw new ModelException();
        } else if (calat < 1 || calat > 300) {
            throw new ModelException();
        } else if (preu < 1) {
            throw new ModelException();
        }
        this.referencia = referencia;
        this.marca = marca;
        this.model = model;
        this.manega = manega;
        this.eslora = eslora;
        this.calat = calat;
        this.preu = preu;
    }

    public String getTipus() {
        return tipus;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getManega() {
        return manega;
    }

    public void setManega(double manega) {
        this.manega = manega;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getCalat() {
        return calat;
    }

    public void setCalat(double calat) {
        this.calat = calat;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String tornarInformacioGeneral() {

        return "{referencia:" + referencia + ",marca:" + marca + ",model:" + model + ",tipus:" + tipus + ",manega:" + manega + ",eslora:" + eslora + ",calat:" + calat + ",preu:" + preu + "}";
    }

    @Override
    public String toString() {
        return "Model{" + "referencia=" + referencia + ", marca=" + marca + ", model=" + model + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + '}';
    }

}
