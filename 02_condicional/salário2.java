void main() {

    double salario = Double.parseDouble(IO.readln("Informe o seu salário: "));

    if (salario > 2000)
        salario = salario * 1.1;

    else
        if (salario > 1000)
            salario = salario * 1.125;

    else 
    
        salario = salario * 1.15;

        System.out.printf("O seu novo salário é: %.2f \n", salario);
}
