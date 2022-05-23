package br.com.julioneto.semana_05_projeto_gradle.utils;

public class SystemTools {

    public static double arredondar(double valor) {
        return Math.round(valor);
    }
    public static Double calcularINSS(Double salario) {
        Double valorINSS = 0.0;

        Double aliquotaFaixaA = 0.075;
        Double limiteFaixaA = 1212.00;

        Double aliquotaFaixaB = 0.09;
        Double limiteFaixaB = 2427.35;

        Double aliquotaFaixaC = 0.12;
        Double limiteFaixaC = 3641.03;

        Double aliquotaFaixaD = 0.14;
        Double limiteFaixaD = 7087.22;

        if (salario <= limiteFaixaA) {
            valorINSS = (limiteFaixaA * aliquotaFaixaA);
        } else if (salario > limiteFaixaA && salario <= limiteFaixaB) {
            valorINSS = ((salario - limiteFaixaA) * aliquotaFaixaB)
                    + (limiteFaixaA * aliquotaFaixaA);
        } else if (salario > limiteFaixaB && salario <= limiteFaixaC) {
            valorINSS = (
                    ((salario - limiteFaixaB) * aliquotaFaixaC)
                            + ((limiteFaixaB - limiteFaixaA) * aliquotaFaixaB)
                            + (limiteFaixaA * aliquotaFaixaA)
            );
        } else if (salario > limiteFaixaC && salario <= limiteFaixaD) {
            valorINSS = (
                    ((salario - limiteFaixaC) * aliquotaFaixaD)
                            + ((limiteFaixaC - limiteFaixaB) * aliquotaFaixaC)
                            + ((limiteFaixaB - limiteFaixaA) * aliquotaFaixaB)
                            + (limiteFaixaA * aliquotaFaixaA)
            );
        } else {
            valorINSS = (
                    ((limiteFaixaD - limiteFaixaC) * aliquotaFaixaD)
                            + ((limiteFaixaC - limiteFaixaB) * aliquotaFaixaC)
                            + ((limiteFaixaB - limiteFaixaA) * aliquotaFaixaB)
                            + (limiteFaixaA * aliquotaFaixaA)
            );
        }

        return valorINSS;
    }

    public static Double calcularIRPF(Double salario) {
        Double valorIRPF = 0.0;
        Double calculoIRPF = salario - calcularINSS(salario);

        Double aliquotaFaixaA = 0.075;
        Double limiteFaixaA = 1903.99;
        Double deducaoFaixaA = 142.80;

        Double aliquotaFaixaB = 0.15;
        Double limiteFaixaB = 2826.65;
        Double deducaoFaixaB = 354.80;

        Double aliquotaFaixaC = 0.2250;
        Double limiteFaixaC = 3751.05;
        Double deducaoFaixaC = 636.13;

        Double aliquotaFaixaD = 0.2750;
        Double limiteFaixaD = 4664.68;
        Double deducaoFaixaD = 869.36;

        if (calculoIRPF >= limiteFaixaA && calculoIRPF <= limiteFaixaB ){
            valorIRPF = (calculoIRPF * aliquotaFaixaA) - deducaoFaixaA;
        } else if (calculoIRPF >= limiteFaixaB && calculoIRPF <= limiteFaixaC ){
            valorIRPF = (calculoIRPF * aliquotaFaixaB) - deducaoFaixaB;
        } else if (calculoIRPF >= limiteFaixaC && calculoIRPF <= limiteFaixaD ){
            valorIRPF = (calculoIRPF * aliquotaFaixaC) - deducaoFaixaC;
        }else if (calculoIRPF >= limiteFaixaD){
            valorIRPF = (calculoIRPF * aliquotaFaixaD) - deducaoFaixaD;
        }
        return valorIRPF;
    }

}
