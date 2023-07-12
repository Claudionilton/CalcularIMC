public class Pessoa {

    //Atributos
    private float peso;
    private float altura;



    //Metodo
    public float calcularIMC(){
        if(altura == 0 || peso ==0){
            System.out.println( "ERRO!! É Necessario Digitar um numero diferente de 0");

        }else {
            return peso / (altura * altura);
        }
        return 0;
    }
    public String tabelaIMC() {
        if (calcularIMC() <= 18.5) {
            return "Abaixo do Peso Normal";
        } else if (calcularIMC() >= 18.5 && calcularIMC() <= 24.9) {
            return "Peso normal";
        } else if (calcularIMC() >= 25 && calcularIMC() <= 29.9) {
            return "Excesso de Peso";
        } else if (calcularIMC() >= 30 && calcularIMC() <= 34.9) {
            return "Obesidade Classe I";
        } else if (calcularIMC() >= 35 && calcularIMC() <= 39.9) {
            return "Obesidade Classe II";
        }else if(calcularIMC() > 39.9){
            return "Obesidade Classe III";
        }else{
            return "Parametro Errado";
        }
    }
     //Metodos acessores
    public void setPeso (float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura (float altura){
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

}
