void main () {

    Float nota1 = Float.parseFloat(IO.readln("Insira a 1a nota: "));
    Float nota2 = Float.parseFloat(IO.readln("Insira a 2a nota: "));
    Float nota3 = Float.parseFloat(IO.readln("Insira a 3a nota: "));

    float media = (nota1 + nota2 + nota3) / 3;

    if (media >=7)
        
        System.out.printf("Aprovado com média: %.2f \n", + media);

    else
        
        System.out.printf("Reprovado com média: %.2f \n", media);
}