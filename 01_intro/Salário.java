 void main() {

    float salario, percentual, novoSalario;

salario = Float.parseFloat(IO.readln("informe o seu salário: "));
percentual = Float.parseFloat(IO.readln("informe o percentual de aumneto: "));

novoSalario = salario * (1 + percentual/100);

IO.println("o salário: " + salario + " com " + percentual + "% de aumento é: " + novoSalario);


    
}
