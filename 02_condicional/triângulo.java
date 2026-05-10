void main() {

    IO.println("Informe os 3 lados do triângulo: ");
    int ladoA = Integer.parseInt(IO.readln("Lado A: "));
    int ladoB = Integer.parseInt(IO.readln("Lado B: "));
    int ladoC = Integer.parseInt(IO.readln("Lado C: "));

    if ((ladoA<ladoB+ladoC) && (ladoB<ladoA+ladoC) && (ladoC<ladoA+ladoB))
        if ((ladoA==ladoB) && (ladoB==ladoC))
        IO.println("Triângulo equilátero");
    
    else
    if ((ladoA==ladoB) || (ladoB==ladoC) || (ladoA==ladoC))
        IO.println("Triângulo isóceles");
        
        
            else
            IO.println("Triângulo escaleno");

               else
               IO.println("Os dados digitados não formam um triângulo");

}
